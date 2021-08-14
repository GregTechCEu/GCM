package com.hjae.gcm.core.transform.hooks;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.jline.utils.Log;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

public class GCHooks {
    public GCHooks() {
    }

    public static void addGTWorldgen() { //List<IWorldGenerator> otherModGeneratorsWhitelist) {
        /*try {
            Class target = Class.forName("gregtech.api.worldgen.generator.WorldGeneratorImpl");
            final Field regField = GameRegistry.class.getDeclaredField("worldGenerators");
            regField.setAccessible(true);
            Set<IWorldGenerator> registeredGenerators = (Set<IWorldGenerator>) regField.get(null);
            for (IWorldGenerator gen : registeredGenerators) {
                if (target.isInstance(gen)) {
                    otherModGeneratorsWhitelist.add(gen);
                    Log.info("Whitelisting GTCE Oregen on planets.");
                    return;
                }
            }
        }
        catch (Exception e) {
        }*/
        Log.info("Whitelisting GTCE Oregen on planets.");

    }
}
