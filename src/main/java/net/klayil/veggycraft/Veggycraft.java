package net.klayil.veggycraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.klayil.veggycraft.recipes.CarbonCuttingRecipeSerializer;
import net.klayil.veggycraft.recipes.CarbonCuttingRecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Veggycraft implements ModInitializer
{
    public static final String MOD_ID = "veggycraft";
    public static final String MOD_NAME = "VeggyCraft";

    public static final Logger LOGGER = LoggerFactory.getLogger("veggycraft");

    public static final String CC_RECIPE_ID = "carbon_cutting";
    public static final CarbonCuttingRecipeType CC_RECIPE_TYPE = new CarbonCuttingRecipeType();
    public static final CarbonCuttingRecipeSerializer CC_RECIPE_SERIALIZER = new CarbonCuttingRecipeSerializer();

    @Override
    public void onInitialize()
    {
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, CC_RECIPE_ID), CC_RECIPE_TYPE);
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, CC_RECIPE_ID), CC_RECIPE_SERIALIZER);
    }
}
