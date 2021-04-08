package com.hjae.gcm.tileentities;

import com.hjae.gcm.GCM;
import gregtech.api.GregTechAPI;
import net.minecraft.util.ResourceLocation;

public class GCMTileEntities {

    public static AdvancedAssemblyLine ADV_ASSEMBLY_LINE;

    public static void init() {
        ADV_ASSEMBLY_LINE = GregTechAPI.registerMetaTileEntity(10000, new AdvancedAssemblyLine(location("adv_assembly_line")));
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(GCM.MODID, name);
    }
}
