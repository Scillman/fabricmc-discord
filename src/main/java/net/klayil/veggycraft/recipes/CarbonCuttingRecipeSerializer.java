package net.klayil.veggycraft.recipes;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeCodecs;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.dynamic.Codecs;

public class CarbonCuttingRecipeSerializer implements RecipeSerializer<CarbonCuttingRecipe>
{
    private static final Codec<CarbonCuttingRecipe> CODEC = RecordCodecBuilder.create(instance ->
        instance.group(
            Codecs.createStrictOptionalFieldCodec(Codec.STRING, "group", "").forGetter(recipe -> recipe.group),
            RecipeCodecs.CRAFTING_RESULT.fieldOf("result").forGetter(recipe -> recipe.result),
            Ingredient.ALLOW_EMPTY_CODEC.fieldOf("toolInput").forGetter(recipe -> recipe.toolInput),
            Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("inputA").forGetter(recipe -> recipe.carbonInputA),
            Ingredient.ALLOW_EMPTY_CODEC.fieldOf("inputB").forGetter(recipe -> recipe.carbonInputB),
            Ingredient.ALLOW_EMPTY_CODEC.fieldOf("inputC").forGetter(recipe -> recipe.carbonInputC),
            Ingredient.ALLOW_EMPTY_CODEC.fieldOf("inputD").forGetter(recipe -> recipe.carbonInputD)
        )
        .apply(instance, CarbonCuttingRecipe::new)
    );

    @Override
    public Codec<CarbonCuttingRecipe> codec()
    {
        return CODEC;
    }

    @Override
    public CarbonCuttingRecipe read(PacketByteBuf buf)
    {
        String group = buf.readString();
        ItemStack itemStack = buf.readItemStack();
        Ingredient toolInput = Ingredient.fromPacket(buf);
        Ingredient carbonInputA = Ingredient.fromPacket(buf);
        Ingredient carbonInputB = Ingredient.fromPacket(buf);
        Ingredient carbonInputC = Ingredient.fromPacket(buf);
        Ingredient carbonInputD = Ingredient.fromPacket(buf);

        return new CarbonCuttingRecipe(group, itemStack, toolInput, carbonInputA, carbonInputB, carbonInputC, carbonInputD);
    }

    @Override
    public void write(PacketByteBuf buf, CarbonCuttingRecipe recipe)
    {
        buf.writeString(recipe.group);
        buf.writeItemStack(recipe.result);
        recipe.toolInput.write(buf);
        recipe.carbonInputA.write(buf);
        recipe.carbonInputB.write(buf);
        recipe.carbonInputC.write(buf);
        recipe.carbonInputD.write(buf);
    }
}
