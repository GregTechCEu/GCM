package com.hjae.gcm.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;

@JEIPlugin
public class JEIGCMPlugin implements IModPlugin {

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        registry.addRecipeCategories(new GCMMultiblockInfoCategory(registry.getJeiHelpers()));
    }

    @Override
    public void register(IModRegistry registry) {
        GCMMultiblockInfoCategory.registerRecipes(registry);
    }
}
