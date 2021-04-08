package com.hjae.gcm;

import com.hjae.gcm.recipes.CircuitReplacements;
import com.hjae.gcm.recipes.GCMRecipeAdditions;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GCM.MODID)
public class CommonProxy {
    @SubscribeEvent
    public static void registerOrePrefix(RegistryEvent.Register<IRecipe> event) {
        CircuitReplacements.init();
        GCMRecipeAdditions.init();
    }
}
