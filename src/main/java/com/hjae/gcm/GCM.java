package com.hjae.gcm;

import com.hjae.gcm.tileentities.GCMTileEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GCM.MODID, name = GCM.NAME, version = GCM.VERSION,
        dependencies = "required-after:gregtech@[1.15.0.721,);" +
                "required-after:gtadditions@[0.22.4,)")
public class GCM {
    public static final String MODID = "gcm";
    public static final String NAME = "GCM";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        GCMTileEntities.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

}
