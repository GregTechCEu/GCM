package com.hjae.gcm.jei;

import com.google.common.collect.Lists;
import gregicadditions.jei.AssemblyLineInfo;
import gregtech.integration.jei.multiblock.MultiblockInfoRecipeWrapper;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.gui.recipes.RecipeLayout;
import net.minecraft.client.resources.I18n;

public class GCMMultiblockInfoCategory implements IRecipeCategory<MultiblockInfoRecipeWrapper> {

    private final IDrawable background;
    private final IGuiHelper guiHelper;

    public GCMMultiblockInfoCategory(IJeiHelpers helpers) {
        this.guiHelper = helpers.getGuiHelper();
        this.background = guiHelper.createBlankDrawable(176, 166);
    }

    public static void registerRecipes(IModRegistry registry) {
        registry.addRecipes(Lists.newArrayList(
                new MultiblockInfoRecipeWrapper(new AdvAssemblyLineInfo())
                ), "gregtech:multiblock_info");
    }

    @Override
    public String getUid() {
        return "gcm:multiblock_info";
    }

    @Override
    public String getTitle() {
        return I18n.format("gregtech.multiblock.title");
    }

    @Override
    public String getModName() {
        return "gcm";
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, MultiblockInfoRecipeWrapper recipeWrapper, IIngredients ingredients) {
        recipeWrapper.setRecipeLayout((RecipeLayout) recipeLayout, guiHelper);
    }
}
