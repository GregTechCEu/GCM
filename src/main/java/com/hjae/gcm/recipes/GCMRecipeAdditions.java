package com.hjae.gcm.recipes;

import com.hjae.gcm.tileentities.GCMTileEntities;
import gregicadditions.GAMaterials;
import gregicadditions.GAValues;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;

import static gregicadditions.recipes.GARecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.ore.OrePrefix.*;

public class GCMRecipeAdditions {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(MetaTileEntities.HULL[GAValues.LuV].getStackForm())
                .inputs(MetaItems.ROBOT_ARM_LUV.getStackForm(2))
                .inputs(MetaBlocks.MUTLIBLOCK_CASING.getItemVariant(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLER_CASING, 4))
                .input(circuit, MarkerMaterials.Tier.Master, 2)
                .inputs(MetaItems.PLATE_IRIDIUM_ALLOY.getStackForm(4))
                .input(gear, Materials.HSSG, 4)
                .input(plate, GAMaterials.RhodiumPlatedPalladium, 8)
                .input(screw, GAMaterials.Ruridit, 16)
                .input(bolt, GAMaterials.Enderium, 16)
                .outputs(GCMTileEntities.ADV_ASSEMBLY_LINE.getStackForm())
                .EUt(30720)
                .duration(400)
                .buildAndRegister();
    }

}
