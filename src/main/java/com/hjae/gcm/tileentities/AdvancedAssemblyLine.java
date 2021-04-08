package com.hjae.gcm.tileentities;

import gregicadditions.capabilities.GregicAdditionsCapabilities;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.item.GAMultiblockCasing;
import gregicadditions.item.GATransparentCasing;
import gregicadditions.machines.multi.TileEntityAssemblyLine;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.util.ResourceLocation;

import static gregtech.api.multiblock.BlockPattern.RelativeDirection.*;

public class AdvancedAssemblyLine extends TileEntityAssemblyLine {

    public AdvancedAssemblyLine(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
        return new AdvancedAssemblyLine(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(LEFT, DOWN, BACK)
                .aisle("#Y#", "GAG", "RTR", "COC")
                .aisle("#Y#", "GAG", "RTR", "FIF").setRepeatable(3, 15)
                .aisle("#Y#", "GSG", "RTR", "FIF")
                .where('S', selfPredicate())
                .where('C', statePredicate(getCasingState()))
                .where('F', statePredicate(getCasingState()).or(abilityPartPredicate(MultiblockAbility.IMPORT_FLUIDS)))
                .where('O', statePredicate(getCasingState()).or(abilityPartPredicate(MultiblockAbility.EXPORT_ITEMS)))
                .where('Y', statePredicate(getCasingState()).or(abilityPartPredicate(MultiblockAbility.INPUT_ENERGY)).or(abilityPartPredicate(GregicAdditionsCapabilities.INPUT_QBIT)))
                .where('I', statePredicate(getCasingState()).or(abilityPartPredicate(MultiblockAbility.IMPORT_ITEMS)))
                .where('G', statePredicate(MetaBlocks.MUTLIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING)))
                .where('A', statePredicate(MetaBlocks.MUTLIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLER_CASING)))
                .where('R', statePredicate(GAMetaBlocks.TRANSPARENT_CASING.getState(GATransparentCasing.CasingType.IRIDIUM_GLASS)))
                .where('T', statePredicate(GAMetaBlocks.MUTLIBLOCK_CASING.getState(GAMultiblockCasing.CasingType.TUNGSTENSTEEL_GEARBOX_CASING)))
                .where('#', (tile) -> true).build();

    }
}
