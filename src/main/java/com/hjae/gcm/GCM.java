package com.hjae.gcm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GCM.MODID, name = GCM.NAME, version = GCM.VERSION,
        dependencies = "required-after:gregtech@[1.13.0.681,);" +
                "required-after:gtadditions")
public class GCM {
    public static final String MODID = "gcm";
    public static final String NAME = "GCM";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

}
