package com.discord.wetnoodle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class WetNoodle implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("wetnoodle");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		// EnchantmentTarget target = EnchantmentTarget.ARMOR;

		// HorseArmorItem itemA = new HorseArmorItem(0, "HorseArmorItem", new FabricItemSettings());
		// boolean resultA = target.isAcceptableItem(itemA);
		// LOGGER.info("resultA = " + resultA);
		
		// net.minecraft.item.ArmorItem itemB = new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
		// boolean resultB = target.isAcceptableItem(itemB);
		// LOGGER.info("resultB = " + resultB);
	}

/*
	public static InputStream loadFileFromRoot(String filePath) throws FileNotFoundException
	{
		Collection<ModContainer> mods = FabricLoader.getInstance().getAllMods();
		for (ModContainer mod: mods)
		{
			List<Path> paths = mod.getRootPaths();
			for (Path path: paths)
			{
				File file = Path.of(path.toString(), filePath).toFile();
				LOGGER.info("path => \"" + file.getAbsolutePath() + "\"");
			}
		}

        File file = FabricLoader.getInstance().getModContainer(MOD_ID).get().getPath(path).toFile();
        return new FileInputStream(file);
    }

	public static void getPixelColor(int xPos, int yPos)
    {
		int r, g, b, a;

        String backup = "/Users/me/Desktop/skin.png";
        File file = new File(backup);
        java.awt.image.BufferedImage image = null;
        try
        {
            image = ImageIO.read(file);
            if (image == null)
            {
                LOGGER.error("The image could not be read: " + file);
            }
            else
            {
                int pixel = image.getRGB(xPos, yPos);
                r = ColorHelper.Argb.getRed(pixel);
                g = ColorHelper.Argb.getGreen(pixel);
                b = ColorHelper.Argb.getBlue(pixel);
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
*/

}