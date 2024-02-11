package net.klayil.veggycraft.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeMatcher;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractRecipeScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;

public class VeggycraftScreenHandler extends AbstractRecipeScreenHandler<RecipeInputInventory>
{
    public VeggycraftScreenHandler(int syncId, PlayerInventory playerInventory)
    {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public VeggycraftScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context)
    {
        super(ScreenHandlerType.CRAFTING, syncId);
    }

    @Override
    public boolean canInsertIntoSlot(int index)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canInsertIntoSlot'");
    }

    @Override
    public void clearCraftingSlots()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearCraftingSlots'");
    }

    @Override
    public RecipeBookCategory getCategory()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategory'");
    }

    @Override
    public int getCraftingHeight()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCraftingHeight'");
    }

    @Override
    public int getCraftingResultSlotIndex()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCraftingResultSlotIndex'");
    }

    @Override
    public int getCraftingSlotCount()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCraftingSlotCount'");
    }

    @Override
    public int getCraftingWidth()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCraftingWidth'");
    }

    @Override
    public boolean matches(RecipeEntry<? extends Recipe<RecipeInputInventory>> recipe)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'matches'");
    }

    @Override
    public void populateRecipeFinder(RecipeMatcher finder)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'populateRecipeFinder'");
    }

    @Override
    public boolean canUse(PlayerEntity player)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canUse'");
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quickMove'");
    }
}
