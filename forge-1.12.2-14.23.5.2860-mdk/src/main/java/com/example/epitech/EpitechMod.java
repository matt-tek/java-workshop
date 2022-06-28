package com.example.epitech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EpitechMod.MODID, name = EpitechMod.NAME, version = EpitechMod.VERSION)
public class EpitechMod
{
    public static final String MODID = "epitech";
    public static final String NAME = "EpitechMod";
    public static final String VERSION = "1.0";
    public static final CreativeTabs TABS = new EpitechCreativeTab();
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
