package com.discord.wetnoodle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class WetNoodle implements ModInitializer
{
    public static final Logger LOGGER = LoggerFactory.getLogger("wetnoodle");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Hello Fabric world!");
    }
}
