package com.hjae.gcm.jei;

import com.hjae.gcm.tileentities.GCMTileEntities;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.item.GAMultiblockCasing;
import gregicadditions.item.GATransparentCasing;
import gregicadditions.jei.AssemblyLineInfo;
import gregicadditions.jei.GAMultiblockShapeInfo;
import gregicadditions.machines.GATileEntities;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

public class AdvAssemblyLineInfo extends AssemblyLineInfo {

    @Override
    public MultiblockControllerBase getController() {
        return GCMTileEntities.ADV_ASSEMBLY_LINE;
    }

    @Override
    public List<MultiblockShapeInfo> getMatchingShapes() {
        List<MultiblockShapeInfo> shapes = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            GAMultiblockShapeInfo.Builder builder = GAMultiblockShapeInfo.builder();
            builder.aisle("FIM", "RTR", "GSG", "#Q#");
            for (int num = 0; num < 3 + i; num++) {
                if (num == 4 || num == 9) builder.aisle("FCC", "RTR", "GAG", "#Y#");
                else builder.aisle("CCC", "RTR", "GAG", "#C#");
            }
            builder.aisle("COC", "RTR", "GAG", "#Y#")
                    .where('S', GCMTileEntities.ADV_ASSEMBLY_LINE, EnumFacing.NORTH)
                    .where('M', GATileEntities.MAINTENANCE_HATCH[0], EnumFacing.NORTH)
                    .where('C', MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID))
                    .where('F', MetaTileEntities.FLUID_IMPORT_HATCH[4], EnumFacing.WEST)
                    .where('O', MetaTileEntities.ITEM_EXPORT_BUS[4], EnumFacing.SOUTH)
                    .where('Y', MetaTileEntities.ENERGY_INPUT_HATCH[4], EnumFacing.UP)
                    .where('Q', GATileEntities.QBIT_INPUT_HATCH[0], EnumFacing.UP)
                    .where('I', MetaTileEntities.ITEM_IMPORT_BUS[3], EnumFacing.NORTH)
                    .where('G', MetaBlocks.MUTLIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING))
                    .where('A', MetaBlocks.MUTLIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLER_CASING))
                    .where('R', GAMetaBlocks.TRANSPARENT_CASING.getState(GATransparentCasing.CasingType.IRIDIUM_GLASS))
                    .where('T', GAMetaBlocks.MUTLIBLOCK_CASING.getState(GAMultiblockCasing.CasingType.ASSEMBLY_LINE_CASING))
                    .where('#', Blocks.AIR.getDefaultState());
            shapes.add(builder.build());
        }
        return shapes;
    }

}
