package com.hjae.gcm.recipes;

import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.recipes.Recipe;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import net.minecraftforge.fluids.FluidStack;

import java.util.*;

import static gregicadditions.GAMaterials.*;
import static gregicadditions.item.GAMetaItems.*;
import static gregicadditions.recipes.GARecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregicadditions.recipes.GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class CircuitReplacements {
    public static void init() {
        FluidStack fluidStack = Materials.SolderingAlloy.getFluid(288);
        Collection<Recipe> rCopy = new ArrayList<>(CIRCUIT_ASSEMBLER_RECIPES.getRecipeList());
        for (Recipe recipe : rCopy) {
            CIRCUIT_ASSEMBLER_RECIPES.removeRecipe(recipe);
        }

        //ELECTRONICS   //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(16).outputs(BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3)).inputs(RESISTOR.getStackForm(8), CAPACITOR.getStackForm(8), GOOD_PHENOLIC_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm()).input(wireFine, Copper, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(16).outputs(BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3)).inputs(SMD_RESISTOR_REFINED.getStackForm(4), SMD_CAPACITOR_REFINED.getStackForm(4), GOOD_PHENOLIC_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm()).input(wireFine, Copper, 4).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(16).outputs(ELECTRONIC_ASSEMBLY.getStackForm(2)).inputs(BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3), TRANSISTOR.getStackForm(2), RESISTOR.getStackForm(8)).input(plate, Electrum, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(16).outputs(ELECTRONIC_ASSEMBLY.getStackForm(2)).inputs(BASIC_ELECTRONIC_CIRCUIT_LV.getStackForm(3), SMD_TRANSISTOR_REFINED.getStackForm(1), SMD_RESISTOR_REFINED.getStackForm(4)).input(plate, Electrum, 1).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(16).outputs(ELECTRONIC_COMPUTER.getStackForm(1)).inputs(ELECTRONIC_ASSEMBLY.getStackForm(4), CAPACITOR.getStackForm(4), RESISTOR.getStackForm(4), INTEGRATED_LOGIC_CIRCUIT.getStackForm(2)).input(plate, Aluminium, 2).input(wireGtSingle, AnnealedCopper, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(16).outputs(ELECTRONIC_COMPUTER.getStackForm(1)).inputs(ELECTRONIC_ASSEMBLY.getStackForm(4), SMD_CAPACITOR_REFINED.getStackForm(2), SMD_RESISTOR_REFINED.getStackForm(2), INTEGRATED_LOGIC_CIRCUIT.getStackForm(2)).input(plate, Aluminium, 2).input(wireGtSingle, AnnealedCopper, 4).fluidInputs(fluidStack).buildAndRegister();



        //REFINED
        //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(60).outputs(REFINED_PROCESSOR.getStackForm(4)).inputs(RESISTOR.getStackForm(8), TRANSISTOR.getStackForm(8), CAPACITOR.getStackForm(8), GOOD_PLASTIC_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm()).input(wireFine, TinAlloy, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(60).outputs(REFINED_PROCESSOR.getStackForm(4)).inputs(SMD_RESISTOR_REFINED.getStackForm(4), SMD_TRANSISTOR_REFINED.getStackForm(4), SMD_CAPACITOR_REFINED.getStackForm(4), GOOD_PLASTIC_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm()).input(wireFine, TinAlloy, 2).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(60).outputs(REFINED_ASSEMBLY.getStackForm(3)).inputs(REFINED_PROCESSOR.getStackForm(3), RESISTOR.getStackForm(8), TRANSISTOR.getStackForm(8), CAPACITOR.getStackForm(8), GOOD_PLASTIC_BOARD.getStackForm()).input(plate, StainlessSteel, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(60).outputs(REFINED_ASSEMBLY.getStackForm(3)).inputs(REFINED_PROCESSOR.getStackForm(3), SMD_RESISTOR_REFINED.getStackForm(2), SMD_TRANSISTOR_REFINED.getStackForm(2), SMD_CAPACITOR_REFINED.getStackForm(2), GOOD_PLASTIC_BOARD.getStackForm()).input(plate, StainlessSteel, 1).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(90).outputs(REFINED_COMPUTER.getStackForm(2)).inputs(REFINED_ASSEMBLY.getStackForm(4), RESISTOR.getStackForm(8), TRANSISTOR.getStackForm(8), RANDOM_ACCESS_MEMORY.getStackForm(2), GOOD_PLASTIC_BOARD.getStackForm()).input(wireGtSingle, MVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(90).outputs(REFINED_COMPUTER.getStackForm(2)).inputs(REFINED_ASSEMBLY.getStackForm(4), SMD_RESISTOR_REFINED.getStackForm(2), SMD_TRANSISTOR_REFINED.getStackForm(2), RANDOM_ACCESS_MEMORY.getStackForm(2), GOOD_PLASTIC_BOARD.getStackForm()).input(wireGtSingle, MVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        //MAINFRAME
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(110).outputs(REFINED_MAINFRAME.getStackForm()).inputs(REFINED_COMPUTER.getStackForm(2), RESISTOR.getStackForm(32), TRANSISTOR.getStackForm(16), DIODE.getStackForm(8), RANDOM_ACCESS_MEMORY.getStackForm(4)).input(frameGt, StainlessSteel, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(110).outputs(REFINED_MAINFRAME.getStackForm()).inputs(REFINED_COMPUTER.getStackForm(2), SMD_RESISTOR_REFINED.getStackForm(16), SMD_TRANSISTOR_REFINED.getStackForm(8), SMD_DIODE_REFINED.getStackForm(4), RANDOM_ACCESS_MEMORY.getStackForm(4)).input(frameGt, StainlessSteel, 4).fluidInputs(fluidStack).buildAndRegister();



        //MICRO
        //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(400).outputs(MICRO_PROCESSOR.getStackForm(4)).inputs(SMD_RESISTOR_REFINED.getStackForm(8), SMD_TRANSISTOR_REFINED.getStackForm(8), SMD_CAPACITOR_REFINED.getStackForm(8), ADVANCED_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm(2)).input(wireFine, RedAlloy, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(400).outputs(MICRO_PROCESSOR.getStackForm(4)).inputs(SMD_RESISTOR.getStackForm(4), SMD_TRANSISTOR.getStackForm(4), SMD_CAPACITOR.getStackForm(4), ADVANCED_BOARD.getStackForm(), CENTRAL_PROCESSING_UNIT.getStackForm(2)).input(wireFine, RedAlloy, 2).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(350).outputs(PROCESSOR_ASSEMBLY_HV.getStackForm(3)).inputs(MICRO_PROCESSOR.getStackForm(3), SMD_CAPACITOR_REFINED.getStackForm(4), SMD_RESISTOR_REFINED.getStackForm(8), RANDOM_ACCESS_MEMORY.getStackForm(2), ADVANCED_BOARD.getStackForm()).input(plate, Titanium, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(350).outputs(PROCESSOR_ASSEMBLY_HV.getStackForm(3)).inputs(MICRO_PROCESSOR.getStackForm(3), SMD_CAPACITOR.getStackForm(2), SMD_RESISTOR.getStackForm(4), RANDOM_ACCESS_MEMORY.getStackForm(2), ADVANCED_BOARD.getStackForm()).input(plate, Titanium, 1).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(425).outputs(MICRO_COMPUTER.getStackForm(2)).inputs(PROCESSOR_ASSEMBLY_HV.getStackForm(4), SMD_RESISTOR_REFINED.getStackForm(8), SMD_TRANSISTOR_REFINED.getStackForm(8), RANDOM_ACCESS_MEMORY.getStackForm(8), ADVANCED_BOARD.getStackForm()).input(wireGtSingle, HVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(425).outputs(MICRO_COMPUTER.getStackForm(2)).inputs(PROCESSOR_ASSEMBLY_HV.getStackForm(4), SMD_RESISTOR.getStackForm(4), SMD_TRANSISTOR.getStackForm(4), RANDOM_ACCESS_MEMORY.getStackForm(8), ADVANCED_BOARD.getStackForm()).input(wireGtSingle, HVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        //MAINFRAME
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(500).outputs(MICRO_MAINFRAME.getStackForm()).inputs(MICRO_COMPUTER.getStackForm(2), SMD_RESISTOR_REFINED.getStackForm(40), SMD_TRANSISTOR_REFINED.getStackForm(20), SMD_DIODE_REFINED.getStackForm(10), RANDOM_ACCESS_MEMORY.getStackForm(8)).input(frameGt, Titanium, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(500).outputs(MICRO_MAINFRAME.getStackForm()).inputs(MICRO_COMPUTER.getStackForm(2), SMD_RESISTOR.getStackForm(20), SMD_TRANSISTOR.getStackForm(10), SMD_DIODE.getStackForm(5), RANDOM_ACCESS_MEMORY.getStackForm(8)).input(frameGt, Titanium, 4).fluidInputs(fluidStack).buildAndRegister();


        //NANO       //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(2000).outputs(NANO_PROCESSOR_HV.getStackForm(4)).inputs(SMD_RESISTOR.getStackForm(8), SMD_TRANSISTOR.getStackForm(8), SMD_CAPACITOR.getStackForm(8), EXTREME_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(12)).input(wireFine, Aluminium, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(2000).outputs(NANO_PROCESSOR_HV.getStackForm(4)).inputs(SMD_RESISTOR_NANO.getStackForm(4), SMD_TRANSISTOR_NANO.getStackForm(4), SMD_CAPACITOR_NANO.getStackForm(4), EXTREME_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(12)).input(wireFine, Aluminium, 2).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(2000).outputs(NANO_PROCESSOR_ASSEMBLY_EV.getStackForm(3)).inputs(NANO_PROCESSOR_HV.getStackForm(3), SMD_CAPACITOR.getStackForm(8), SMD_RESISTOR.getStackForm(8), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(2), EXTREME_BOARD.getStackForm()).input(plate, TungstenSteel, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(2000).outputs(NANO_PROCESSOR_ASSEMBLY_EV.getStackForm(3)).inputs(NANO_PROCESSOR_HV.getStackForm(3), SMD_CAPACITOR_NANO.getStackForm(4), SMD_RESISTOR_NANO.getStackForm(4), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(2), EXTREME_BOARD.getStackForm()).input(plate, TungstenSteel, 1).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(2000).outputs(NANO_COMPUTER.getStackForm(2)).inputs(NANO_PROCESSOR_ASSEMBLY_EV.getStackForm(4), SMD_RESISTOR.getStackForm(8), SMD_TRANSISTOR.getStackForm(8), RANDOM_ACCESS_MEMORY.getStackForm(8), EXTREME_BOARD.getStackForm()).input(wireGtSingle, EVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(2000).outputs(NANO_COMPUTER.getStackForm(2)).inputs(NANO_PROCESSOR_ASSEMBLY_EV.getStackForm(4), SMD_RESISTOR_NANO.getStackForm(4), SMD_TRANSISTOR_NANO.getStackForm(4), RANDOM_ACCESS_MEMORY.getStackForm(8), EXTREME_BOARD.getStackForm()).input(wireGtSingle, EVSuperconductor, 1).fluidInputs(fluidStack).buildAndRegister();
        //MAINFRAME
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(2000).outputs(NANO_MAINFRAME.getStackForm()).inputs(NANO_COMPUTER.getStackForm(2), SMD_RESISTOR.getStackForm(48), SMD_TRANSISTOR.getStackForm(24), SMD_DIODE.getStackForm(12), RANDOM_ACCESS_MEMORY.getStackForm(12)).input(frameGt, TungstenSteel, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(500).EUt(2000).outputs(NANO_MAINFRAME.getStackForm()).inputs(NANO_COMPUTER.getStackForm(2), SMD_RESISTOR_NANO.getStackForm(24), SMD_TRANSISTOR_NANO.getStackForm(12), SMD_DIODE_NANO.getStackForm(6), RANDOM_ACCESS_MEMORY.getStackForm(12)).input(frameGt, TungstenSteel, 4).fluidInputs(fluidStack).buildAndRegister();



        //QUANTUM       //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(3000).outputs(QUANTUM_PROCESSOR_EV.getStackForm(4)).inputs(QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1), SMD_TRANSISTOR_NANO.getStackForm(8), SMD_CAPACITOR_NANO.getStackForm(8), ELITE_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, Platinum, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(3000).outputs(QUANTUM_PROCESSOR_EV.getStackForm(4)).inputs(QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1), SMD_TRANSISTOR_QUANTUM.getStackForm(4), SMD_CAPACITOR_QUANTUM.getStackForm(4), ELITE_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, Platinum, 2).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(4000).outputs(QUANTUM_ASSEMBLY.getStackForm(3)).inputs(QUANTUM_PROCESSOR_EV.getStackForm(3), SMD_CAPACITOR_NANO.getStackForm(8), SMD_RESISTOR_NANO.getStackForm(8), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(2), ELITE_BOARD.getStackForm()).input(plate, Osmium, 1).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(4000).outputs(QUANTUM_ASSEMBLY.getStackForm(3)).inputs(QUANTUM_PROCESSOR_EV.getStackForm(3), SMD_CAPACITOR_QUANTUM.getStackForm(4), SMD_RESISTOR_QUANTUM.getStackForm(4), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(2), ELITE_BOARD.getStackForm()).input(plate, Osmium, 1).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(6000).outputs(QUANTUM_COMPUTER.getStackForm(2)).inputs(QUANTUM_ASSEMBLY.getStackForm(4), SMD_DIODE_NANO.getStackForm(16), QUANTUM_EYE.getStackForm(1), POWER_INTEGRATED_CIRCUIT.getStackForm(4), ELITE_BOARD.getStackForm()).input(wireGtSingle, IVSuperconductor, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(6000).outputs(QUANTUM_COMPUTER.getStackForm(2)).inputs(QUANTUM_ASSEMBLY.getStackForm(4), SMD_DIODE_QUANTUM.getStackForm(8), QUANTUM_EYE.getStackForm(1), POWER_INTEGRATED_CIRCUIT.getStackForm(4), ELITE_BOARD.getStackForm()).input(wireGtSingle, IVSuperconductor, 2).fluidInputs(fluidStack).buildAndRegister();
        //MAINFRAME
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(500).EUt(8000).outputs(QUANTUM_MAINFRAME.getStackForm()).inputs(QUANTUM_COMPUTER.getStackForm(2), SMD_RESISTOR_NANO.getStackForm(64), SMD_TRANSISTOR_NANO.getStackForm(56), SMD_CAPACITOR_NANO.getStackForm(56), SMD_DIODE_NANO.getStackForm(32), POWER_INTEGRATED_CIRCUIT.getStackForm(8), QUANTUM_STAR.getStackForm()).input(frameGt, TungstenSteel, 4).input(wireGtSingle, IVSuperconductor, 16).fluidInputs(fluidStack).buildAndRegister();
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(500).EUt(8000).outputs(QUANTUM_MAINFRAME.getStackForm()).inputs(QUANTUM_COMPUTER.getStackForm(2), SMD_RESISTOR_QUANTUM.getStackForm(32), SMD_TRANSISTOR_QUANTUM.getStackForm(28), SMD_CAPACITOR_QUANTUM.getStackForm(28), SMD_DIODE_QUANTUM.getStackForm(16), POWER_INTEGRATED_CIRCUIT.getStackForm(8), QUANTUM_STAR.getStackForm()).input(frameGt, TungstenSteel, 4).input(wireGtSingle, IVSuperconductor, 16).fluidInputs(fluidStack).buildAndRegister();


        //CRYSTAL      //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(10000).outputs(CRYSTAL_PROCESSOR.getStackForm(4)).inputs(CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(1), SMD_TRANSISTOR_QUANTUM.getStackForm(16), SMD_CAPACITOR_QUANTUM.getStackForm(8), MASTER_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, NiobiumTitanium, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(10000).outputs(CRYSTAL_PROCESSOR.getStackForm(4)).inputs(CRYSTAL_CENTRAL_PROCESSING_UNIT.getStackForm(1), SMD_TRANSISTOR_CRYSTAL.getStackForm(8), SMD_CAPACITOR_CRYSTAL.getStackForm(4), MASTER_BOARD.getStackForm(), NANO_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, NiobiumTitanium, 2).fluidInputs(fluidStack).buildAndRegister();
        //ASSEMBLY
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(20000).outputs(ENERGY_FLOW_CIRCUIT_LUV.getStackForm()).inputs(CRYSTAL_PROCESSOR.getStackForm(3), CENTRAL_PROCESSING_UNIT.getStackForm(64), SMD_RESISTOR_QUANTUM.getStackForm(8), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1), MASTER_BOARD.getStackForm()).input(wireGtSingle, LuVSuperconductor, 4).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(100).EUt(20000).outputs(ENERGY_FLOW_CIRCUIT_LUV.getStackForm()).inputs(CRYSTAL_PROCESSOR.getStackForm(3), CENTRAL_PROCESSING_UNIT.getStackForm(64), SMD_RESISTOR_CRYSTAL.getStackForm(4), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1), MASTER_BOARD.getStackForm()).input(wireGtSingle, LuVSuperconductor, 4).fluidInputs(fluidStack).buildAndRegister();
        //COMPUTER
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(300).EUt(30000).outputs(CRYSTAL_COMPUTER.getStackForm()).inputs(ENERGY_FLOW_CIRCUIT_LUV.getStackForm(4), SMD_DIODE_QUANTUM.getStackForm(16), SMD_RESISTOR_QUANTUM.getStackForm(16), QUANTUM_EYE.getStackForm(1), HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(1), MASTER_BOARD.getStackForm()).input(plate, RhodiumPlatedPalladium, 2).input(wireGtSingle, LuVSuperconductor, 16).fluidInputs(fluidStack).buildAndRegister();
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(300).EUt(30000).outputs(CRYSTAL_COMPUTER.getStackForm()).inputs(ENERGY_FLOW_CIRCUIT_LUV.getStackForm(4), SMD_DIODE_CRYSTAL.getStackForm(8), SMD_RESISTOR_CRYSTAL.getStackForm(8), QUANTUM_EYE.getStackForm(1), HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(1), MASTER_BOARD.getStackForm()).input(plate, RhodiumPlatedPalladium, 2).input(wireGtSingle, LuVSuperconductor, 16).fluidInputs(fluidStack).buildAndRegister();
        //MAINFRAME
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(500).EUt(30000).outputs(CRYSTAL_MAINFRAME.getStackForm()).inputs(CRYSTAL_COMPUTER.getStackForm(2), SMD_RESISTOR_QUANTUM.getStackForm(64), SMD_RESISTOR_QUANTUM.getStackForm(64), SMD_TRANSISTOR_QUANTUM.getStackForm(64), SMD_CAPACITOR_QUANTUM.getStackForm(64), SMD_DIODE_QUANTUM.getStackForm(48), HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(4), QUANTUM_STAR.getStackForm(4)).input(frameGt, HSSE, 4).input(wireGtSingle, LuVSuperconductor, 32).fluidInputs(fluidStack).buildAndRegister();
        ASSEMBLY_LINE_RECIPES.recipeBuilder().duration(500).EUt(30000).outputs(CRYSTAL_MAINFRAME.getStackForm()).inputs(CRYSTAL_COMPUTER.getStackForm(2), SMD_RESISTOR_CRYSTAL.getStackForm(48), SMD_TRANSISTOR_CRYSTAL.getStackForm(36), SMD_CAPACITOR_CRYSTAL.getStackForm(32), SMD_DIODE_CRYSTAL.getStackForm(24), HIGH_POWER_INTEGRATED_CIRCUIT.getStackForm(4), QUANTUM_STAR.getStackForm(4)).input(frameGt, HSSE, 4).input(wireGtSingle, LuVSuperconductor, 32).fluidInputs(fluidStack).buildAndRegister();

        //WETWARE      //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(56000).outputs(WETWARE_PROCESSOR_LUV.getStackForm(1)).inputs(CRYSTAL_SYSTEM_ON_CHIP.getStackForm(1), SMD_TRANSISTOR_CRYSTAL.getStackForm(16), SMD_CAPACITOR_CRYSTAL.getStackForm(8), CYBER_PROCESSING_UNIT.getStackForm(), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, YttriumBariumCuprate, 2).fluidInputs(fluidStack).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(56000).outputs(WETWARE_PROCESSOR_LUV.getStackForm(1)).inputs(CRYSTAL_SYSTEM_ON_CHIP.getStackForm(1), SMD_TRANSISTOR_WETWARE.getStackForm(8), SMD_CAPACITOR_WETWARE.getStackForm(4), CYBER_PROCESSING_UNIT.getStackForm(), QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(1)).input(wireFine, YttriumBariumCuprate, 2).fluidInputs(fluidStack).buildAndRegister();
        fluidStack.amount = Math.min(64000, fluidStack.amount * 4);

        //BIOWARE     //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(240000)
                .outputs(BIOWARE_PROCESSOR.getStackForm(1))
                .inputs(QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(4),
                        SMD_TRANSISTOR_BIOWARE.getStackForm(8),
                        SMD_CAPACITOR_BIOWARE.getStackForm(4),
                        NEURO_PROCESSOR.getStackForm(),
                        HASOC.getStackForm(1))
                .input(wireFine, NaquadahAlloy, 4)
                .fluidInputs(fluidStack).buildAndRegister();

        //OPTICAL    //PROCESSOR

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(480000)
                .outputs(OPTICAL_PROCESSOR.getStackForm(1))
                .inputs(QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(4),
                        SMD_TRANSISTOR_OPTICAL.getStackForm(8),
                        SMD_CAPACITOR_OPTICAL.getStackForm(4),
                        OPTICAL_PROCESSING_CORE.getStackForm(),
                        HASOC.getStackForm(1))
                .input(wireFine, Pikyonium, 4)
                .fluidInputs(fluidStack).buildAndRegister();


        //COSMIC     //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(1920000)
                .outputs(COSMIC_PROCESSOR.getStackForm(1))
                .qubit(16)
                .inputs(QBIT_CENTRAL_PROCESSING_UNIT.getStackForm(4),
                        SMD_TRANSISTOR_COSMIC.getStackForm(32),
                        SMD_CAPACITOR_COSMIC.getStackForm(16),
                        COSMIC_PROCESSING_CORE.getStackForm(),
                        UHASOC.getStackForm(1))
                .input(wireFine, Cinobite, 4)
                .fluidInputs(fluidStack).buildAndRegister();


        //SUPRACAUSAL     //PROCESSOR
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(200).EUt(2097152).qubit(32)
                .outputs(SUPRACAUSAL_PROCESSOR.getStackForm())
                .inputs(UHASOC.getStackForm(16),
                        MANIFOLD_OSCILLATORY_POWER_CELL.getStackForm(1),
                        MICROWORMHOLE_GENERATOR.getStackForm(),
                        SUPRACAUSAL_PROCESSING_CORE.getStackForm())
                .input(plate, SuperheavyHAlloy, 4)
                .input(wireGtSingle, UHVSuperconductor, 8)
                .fluidInputs(fluidStack).buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(75).EUt(30).outputs(CIRCUIT_MAGNETIC_ULV.getStackForm(4)).inputs(VACUUM_TUBE.getStackForm()).inputs(OreDictUnifier.get(gem, MagnetoResonatic), IMPRINT_SUPPORTED_BOARD.getStackForm(), DIODE.getStackForm(4), CAPACITOR.getStackForm(4), TRANSISTOR.getStackForm(4)).fluidInputs(SolderingAlloy.getFluid(36)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(150).EUt(120).outputs(CIRCUIT_MAGNETIC_LV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(), OreDictUnifier.get(gem, MagnetoResonatic), CIRCUIT_MAGNETIC_ULV.getStackForm(), SMD_DIODE_REFINED.getStackForm(8), SMD_CAPACITOR_REFINED.getStackForm(8), SMD_TRANSISTOR_REFINED.getStackForm(8)).fluidInputs(SolderingAlloy.getFluid(72)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(225).EUt(480).outputs(CIRCUIT_MAGNETIC_MV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(), OreDictUnifier.get(gem, MagnetoResonatic), CIRCUIT_MAGNETIC_LV.getStackForm(), SMD_DIODE.getStackForm(12), SMD_CAPACITOR.getStackForm(12), SMD_TRANSISTOR.getStackForm(12)).fluidInputs(SolderingAlloy.getFluid(108)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(300).EUt(1920).outputs(CIRCUIT_MAGNETIC_HV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(), OreDictUnifier.get(gem, MagnetoResonatic), CIRCUIT_MAGNETIC_MV.getStackForm(), SMD_DIODE_NANO.getStackForm(16), SMD_CAPACITOR_NANO.getStackForm(16), SMD_TRANSISTOR_NANO.getStackForm(16)).fluidInputs(SolderingAlloy.getFluid(144)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(375).EUt(7680).outputs(CIRCUIT_MAGNETIC_EV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(), OreDictUnifier.get(gem, MagnetoResonatic), CIRCUIT_MAGNETIC_HV.getStackForm(), SMD_DIODE_CRYSTAL.getStackForm(20), SMD_CAPACITOR_CRYSTAL.getStackForm(20), SMD_TRANSISTOR_CRYSTAL.getStackForm(20)).fluidInputs(SolderingAlloy.getFluid(180)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(450).EUt(30720).outputs(CIRCUIT_MAGNETIC_IV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(6), OreDictUnifier.get(gem, MagnetoResonatic, 6), CIRCUIT_MAGNETIC_EV.getStackForm(), SMD_DIODE_QUANTUM.getStackForm(24), SMD_CAPACITOR_QUANTUM.getStackForm(24), SMD_TRANSISTOR_QUANTUM.getStackForm(24)).fluidInputs(SolderingAlloy.getFluid(864)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(525).EUt(122880).outputs(CIRCUIT_MAGNETIC_LUV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(6), OreDictUnifier.get(gem, MagnetoResonatic, 6), CIRCUIT_MAGNETIC_IV.getStackForm(), SMD_DIODE_WETWARE.getStackForm(28), SMD_CAPACITOR_WETWARE.getStackForm(28), SMD_TRANSISTOR_WETWARE.getStackForm(28)).fluidInputs(SolderingAlloy.getFluid(1008)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(600).EUt(491520).outputs(CIRCUIT_MAGNETIC_ZPM.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(6), OreDictUnifier.get(gemExquisite, MagnetoResonatic), CIRCUIT_MAGNETIC_LUV.getStackForm(), SMD_DIODE_BIOWARE.getStackForm(32), SMD_CAPACITOR_BIOWARE.getStackForm(32), SMD_TRANSISTOR_BIOWARE.getStackForm(32)).fluidInputs(SolderingAlloy.getFluid(4608)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(675).EUt(1966080).outputs(CIRCUIT_MAGNETIC_UV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(6), OreDictUnifier.get(gemExquisite, MagnetoResonatic, 6), CIRCUIT_MAGNETIC_ZPM.getStackForm(), SMD_DIODE_BIOWARE.getStackForm(36), SMD_CAPACITOR_BIOWARE.getStackForm(36), SMD_TRANSISTOR_BIOWARE.getStackForm(36)).fluidInputs(SolderingAlloy.getFluid(5184)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(750).EUt(7864320).outputs(CIRCUIT_MAGNETIC_UHV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(12), OreDictUnifier.get(gemExquisite, MagnetoResonatic, 12), CIRCUIT_MAGNETIC_UV.getStackForm(), SMD_DIODE_BIOWARE.getStackForm(40), SMD_CAPACITOR_BIOWARE.getStackForm(40), SMD_TRANSISTOR_BIOWARE.getStackForm(40)).fluidInputs(SolderingAlloy.getFluid(5760)).buildAndRegister();
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder().duration(825).EUt(31457280).outputs(CIRCUIT_MAGNETIC_UEV.getStackForm(4)).inputs(IMPRINT_SUPPORTED_BOARD.getStackForm(12), OreDictUnifier.get(gemExquisite, MagnetoResonatic, 12), CIRCUIT_MAGNETIC_UHV.getStackForm(), SMD_DIODE_BIOWARE.getStackForm(44), SMD_CAPACITOR_BIOWARE.getStackForm(44), SMD_TRANSISTOR_BIOWARE.getStackForm(44)).fluidInputs(SolderingAlloy.getFluid(6336)).buildAndRegister();


    }
}
