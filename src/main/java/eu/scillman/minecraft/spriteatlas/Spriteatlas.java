package eu.scillman.minecraft.spriteatlas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class Spriteatlas implements ModInitializer
{
	public static final String MOD_ID = "spriteatlas";
	public static final String MOD_NAME = "SpriteAtlas";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static int counter = 0;

	@Override
	public void onInitialize()
	{
		LOGGER.info("Hello Fabric world!");

		net.minecraft.client.gui.widget.ButtonWidget button;
	}
}