package net.klayil.veggycraft.recipes;

import net.klayil.veggycraft.Veggycraft;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.world.World;

public final class CarbonCuttingRecipe implements CraftingRecipe
{
    final String group;
    final ItemStack result;
    final Ingredient toolInput;
    final Ingredient carbonInputA;
    final Ingredient carbonInputB;
    final Ingredient carbonInputC;
    final Ingredient carbonInputD;

    public CarbonCuttingRecipe(String group, ItemStack result, Ingredient toolInput,
        Ingredient carbonInputA, Ingredient carbonInputB, Ingredient carbonInputC, Ingredient carbonInputD)
    {
        this.group = group;
        this.result = result;
        this.toolInput = toolInput;

        this.carbonInputA = carbonInputA;
        this.carbonInputB = carbonInputB;
        this.carbonInputC = carbonInputC;
        this.carbonInputD = carbonInputD;
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world)
    {
        int skipSlot = -1;

        for (int slot = 0; slot < inventory.size(); ++slot)
        {
            ItemStack itemStack = inventory.getStack(slot);
            if (itemStack != null && !itemStack.isEmpty())
            {
                if (toolInput.test(itemStack))
                {
                    itemStack.setDamage(itemStack.getDamage() + 1);
                    skipSlot = slot;
                    break;
                }
            }
        }

        for (int slot = 0; slot < inventory.size(); ++slot)
        {
            if (slot == skipSlot)
            {
                continue;
            }

            ItemStack itemStack = inventory.getStack(slot);
            if (itemStack != null && !itemStack.isEmpty())
            {
                if (carbonInputA.test(itemStack)) return true;
                if (carbonInputB.test(itemStack)) return true;
                if (carbonInputC.test(itemStack)) return true;
                if (carbonInputD.test(itemStack)) return true;
            }
        }

        return false;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager)
    {
        return this.result.copy();
    }

    @Override
    public boolean fits(int width, int height)
    {
        return (width * height) >= 4;
    }

    @Override
    public ItemStack getResult(DynamicRegistryManager registryManager)
    {
        return this.result;
    }

    @Override
    public RecipeSerializer<?> getSerializer()
    {
        return Veggycraft.CC_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType()
    {
        return Veggycraft.CC_RECIPE_TYPE;
    }

    @Override
    public CraftingRecipeCategory getCategory()
    {
        return CraftingRecipeCategory.MISC;
    }
}
