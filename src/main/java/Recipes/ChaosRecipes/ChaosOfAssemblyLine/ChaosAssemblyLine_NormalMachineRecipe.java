package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
import static gregtech.api.enums.TierEU.RECIPE_LuV;
import static gregtech.api.enums.TierEU.RECIPE_UEV;
import static gregtech.api.enums.TierEU.RECIPE_UHV;
import static gregtech.api.enums.TierEU.RECIPE_UIV;
import static gregtech.api.enums.TierEU.RECIPE_UMV;
import static gregtech.api.enums.TierEU.RECIPE_UV;
import static gregtech.api.enums.TierEU.RECIPE_UXV;
import static gregtech.api.enums.TierEU.RECIPE_ZPM;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import EnumList.EnumFluidList.FluidList;
import EnumList.EnumFluidList.GasList;
import EnumList.EnumFluidList.MoltenList;
import EnumList.EnumFluidList.PlasmaList;
import EnumList.EnumItemList.EnumGTList.BatteryList;
import EnumList.EnumItemList.EnumGTList.CableList;
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.PipeList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.MiscPlateList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.BloodMagicList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GalaxySpaceList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.KekzTechList;
import EnumList.EnumItemList.EnumModList.OpenBlocksList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumModList.ThaumcraftList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;

public class ChaosAssemblyLine_NormalMachineRecipe {

    public static void addChaosAssemblyLine_NormalMachineRecipe() {
        // "Advanced Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Assembly_Line, 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 8),

                setStackSize(GTBlockList.Chest_Buffer_LuV, 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                setStackSize(FluidList.Lubricant, 1000 * 2))
            .itemOutputs(MultiMachineControllerList.Advanced_Assembly_Line)
            .eut(RECIPE_LuV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Crafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Target_Chamber, 1),
                setStackSize(GTItemList.Field_Generator_ZPM, 4),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing, 32),
                setStackSize(MultiMachineControllerList.Large_Molecular_Assembler, 2))
            .fluidInputs(setStackSize(FluidList.UU_Matter, 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Beam_Crafter)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Splitter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Weighted_Network_Switch_With_QoS, 1),
                setStackSize(GTItemList.Samarium_Electromagnet, 1),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing, 4))
            .fluidInputs(setStackSize(FluidList.Super_Coolant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Beam_Splitter)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // BEC
        {
            // "Bose-Einstein Condensate Containment Field"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV, 1),
                    setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator, 4),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX, 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate, 16),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate, 16),
                    setStackSize(DensePlateList.Dense_Shijima_Plate, 16),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit, 8),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit, 8),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit, 8),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2000),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 64))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Containment_Field)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Entanglement Apparatus"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Thermic_Heating_Device, 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing, 4),
                    setStackSize(MultiMachineCasingList.Hypogen_Coil_Block, 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate, 8),

                    setStackSize(GTItemList.Emitter_UIV, 16),
                    setStackSize(GTItemList.Electric_Pump_UIV, 16),
                    setStackSize(GTPPList.Quantum_Anomaly, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Entanglement_Apparatus)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Maxwell Gate"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(Appliedenergistics2List.ME_Storage_Bus, 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing, 4),
                    setStackSize(GTItemList.Fluid_Regulator_UIV, 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate, 4),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate, 4),
                    setStackSize(DensePlateList.Dense_Shijima_Plate, 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 8),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 500),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 16))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Maxwell_Gate)
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Observation Array"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Advanced_Assembly_Line, 1),
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit, 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge, 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate, 8),

                    setStackSize(GTItemList.Sensor_UIV, 16),
                    setStackSize(GTItemList.Robot_Arm_UIV, 16),
                    setStackSize(GTItemList.Chromatic_Lens, 64),
                    setStackSize(Appliedenergistics2List.Singularity, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Observation Array Teleportation Node"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit, 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge, 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),

                    setStackSize(DensePlateList.Dense_Tairitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate, 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate, 8),
                    setStackSize(GTItemList.Emitter_UIV, 8),

                    setStackSize(GTItemList.Conveyor_Module_UIV, 8),
                    setStackSize(SingularityList.Eternal_Singularity, 4),
                    setStackSize(Appliedenergistics2List.Singularity, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Bio Chamber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Clean_Stainless_Steel_Machine_Casing, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(CircuitList.Stemcells, 64),
                setStackSize(GTItemList.Fluid_Regulator_ZPM, 1),

                setStackSize(GTItemList.Electric_Pump_ZPM, 1),
                setStackSize(GTItemList.Sensor_ZPM, 4),
                setStackSize(FineWireList.Fine_Holmium_Wire, 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                setStackSize(FluidList.Growth_Catalyst_Medium, 144 * 64 * 3))
            .itemOutputs(MultiMachineControllerList.Bio_Chamber)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Circuit Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Circuit_Assembler_LuV, 1),
                setStackSize(GTItemList.Robot_Arm_LuV, 4),
                setStackSize(GTItemList.Electric_Motor_LuV, 4),
                setStackSize(GTItemList.Field_Generator_LuV, 1),

                setStackSize(GTItemList.Emitter_LuV, 1),
                setStackSize(GTItemList.Sensor_LuV, 1),
                setStackSize(PlateList.Rhodium_Plated_Palladium_Plate, 8))
            .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Circuit_Assembly_Line)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Component Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Assembly_Line, 16),
                setStackSize(MultiMachineCasingList.Assembler_Machine_Casing, 16),
                setStackSize(MultiMachineCasingList.Assembly_Line_Casing, 32),
                setStackSize(GTItemList.Robot_Arm_UV, 16),

                setStackSize(GTItemList.Conveyor_Module_UV, 32),
                setStackSize(GTItemList.Electric_Motor_UV, 32),
                setStackSize(PipeList.PBI_Fluid_Pipe, 16),
                setStackSize(SuperdensePlateList.Superdense_Iridium_Plate, 4),

                setStackSize(MachineList.Fluid_Solidifier_ZPM, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 20),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 24))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 12),
                setStackSize(MoltenList.Molten_Naquadria, 144 * 16),
                setStackSize(FluidList.Lubricant, 1000 * 5))
            .itemOutputs(MultiMachineControllerList.Component_Assembly_Line)
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cooling Tower"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Reinforced_Photolithographic_Framework_Casing, 4),
                setStackSize(MultiMachineCasingList.Superconducting_Coil_Block, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),
                setStackSize(FoilList.Damascus_Steel_Foil, 16),

                setStackSize(GTItemList.Electric_Pump_UV, 1),
                setStackSize(GTItemList.Sensor_UV, 4),
                setStackSize(FineWireList.Fine_Infinity_Wire, 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                setStackSize(FluidList.Super_Coolant, 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Cooling_Tower)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Data Bank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS, 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),
                setStackSize(GTItemList.Data_Orb, 1),
                setStackSize(GTItemList.Computer_Monitor_Cover, 1))
            .fluidInputs(setStackSize(FluidList.IC2_Coolant, 1000 * 2), setStackSize(GasList.Hydrogen, 1000))
            .itemOutputs(MultiMachineControllerList.Data_Bank)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Dimensionally Transcendent Plasma Forge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Dimensional_Bridge, 4),
                setStackSize(MultiMachineControllerList.Exothermic_Hearth, 16),
                setStackSize(HatchList.Energy_Hatch_UEV, 4),
                setStackSize(WireList.Superconductor_UEV_Wire_1x, 96),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 20),
                setStackSize(GTItemList.Field_Generator_UEV, 4),
                setStackSize(SingularityList.Eternal_Singularity, 4),
                setStackSize(GTPPList.Quantum_Anomaly, 1),

                setStackSize(SuperdensePlateList.Superdense_Osmiridium_Plate, 4),
                setStackSize(GTItemList.Electric_Pump_UEV, 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty, 1))
            .fluidInputs(
                setStackSize(GasList.Oganesson, 1000 * 64 * 2),
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                setStackSize(MoltenList.Molten_Californium, 144 * 64 * 4),
                setStackSize(MoltenList.Molten_Enriched_Naquadah, 144 * 64 * 4))
            .itemOutputs(MultiMachineControllerList.Dimensionally_Transcendent_Plasma_Forge)
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Draconic Evolution Fusion Crafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Assembler_UHV, 1),
                setStackSize(MultiMachineCasingList.Bloody_Ichorium_Fusion_Casing, 1),
                setStackSize(DensePlateList.Dense_Gaia_Spirit_Plate, 1),
                setStackSize(MultiMachineCasingList.Awakened_Draconium_Coil_Block, 8),

                setStackSize(GTItemList.Electric_Motor_UHV, 8),
                setStackSize(GTItemList.Robot_Arm_UHV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Gravi_Star, 4),

                setStackSize(ThaumcraftList.Primordial_Pearl, 1),
                setStackSize(BloodMagicList.Soul_Shard, 8),
                setStackSize(BloodMagicList.Life_Shard, 8),
                setStackSize(SuperdensePlateList.Superdense_Void_Metal_Plate, 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                setStackSize(MoltenList.Molten_Void_Metal, 144 * 20),
                setStackSize(MoltenList.Molten_Awakened_Draconium, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Draconic_Evolution_Fusion_Crafter)
            .eut(RECIPE_UEV)
            .duration(75 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Electric Implosion Compressor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Implosion_Compressor, 1),
                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate, 1),
                setStackSize(LongRodList.Long_Osmium_Rod, 64),
                setStackSize(RingList.Osmium_Ring, 64),

                setStackSize(WireList.Superconductor_UHV_Wire_1x, 64),
                setStackSize(GTItemList.Electric_Piston_UV, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(MoltenList.Molten_Osmium, 144 * 10),
                setStackSize(MoltenList.Molten_Neutronium, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Electric_Implosion_Compressor)
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Elemental Duplicator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_ZPM, 4),
                setStackSize(GTItemList.Field_Generator_IV, 16),
                setStackSize(GTItemList.Electric_Motor_ZPM, 16),
                setStackSize(GTItemList.Electric_Piston_ZPM, 4),

                setStackSize(GTPPList.Energy_Core_LuV, 2),
                setStackSize(PlateList.Pikyonium_64B_Plate, 16),
                setStackSize(ScrewList.Pikyonium_64B_Screw, 32),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt, 32),

                setStackSize(RodList.Zeron_100_Rod, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 20),
                setStackSize(GTItemList.Data_Orb, 32),
                setStackSize(GTPPList.Quantum_Anomaly, 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 16),
                setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16),
                setStackSize(MoltenList.Molten_Babbit_Alloy, 144 * 64 * 2))
            .itemOutputs(MultiMachineControllerList.Elemental_Duplicator)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Endothermic Fridge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Vacuum_Freezer, 64),
                setStackSize(MultiMachineControllerList.Cryogenic_Freezer, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Coolant_Duct, 4),

                setStackSize(RodList.Callisto_Ice_Rod, 32),
                setStackSize(GTItemList.Electric_Pump_ZPM, 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM, 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x, 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil, 16),
                setStackSize(SuperdensePlateList.Superdense_Ledox_Plate, 8),
                setStackSize(SuperdensePlateList.Superdense_Aluminium_Plate, 8))
            .fluidInputs(
                setStackSize(FluidList.Gelid_Cryotheum, 1000 * 256),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Endothermic_Fridge)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energy Infuser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Active_Transformer, 1),
                setStackSize(MultiMachineCasingList.Molecular_Coil, 8),
                setStackSize(MultiMachineCasingList.High_Power_Casing, 8),
                setStackSize(ScrewList.Magnetic_Neodymium_Screw, 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Electrum_GregTech, 144 * 18),
                setStackSize(MoltenList.Molten_Europium, 144 * 13),
                setStackSize(FluidList.IC2_Coolant, 1000 * 2))
            .itemOutputs(MultiMachineControllerList.Energy_Infuser)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Eye of Harmony"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Space_Elevator, 16),
                setStackSize(MultiMachineControllerList.Forge_of_the_Gods, 4),
                setStackSize(MultiMachineControllerList.Dimensionally_Transcendent_Plasma_Forge, 4),
                setStackSize(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing, 1),

                setStackSize(TecTechList.Crude_Time_Dilation_Field_Generator, 1),
                setStackSize(TecTechList.Crude_Spacetime_Compression_Field_Generator, 1),
                setStackSize(TecTechList.Crude_Stabilisation_Field_Generator, 1),
                setStackSize(MultiMachineControllerList.Quantum_Computer, 64),

                setStackSize(MachineList.World_Accelerator_UV, 64),
                setStackSize(GTBlockList.Quantum_Chest_V, 64),
                setStackSize(MultiMachineControllerList.Void_Miner_III, 64),
                setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig, 64),

                setStackSize(GTItemList.Field_Generator_UMV, 16),
                setStackSize(GTItemList.Robot_Arm_UMV, 16),
                setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty, 4),
                setStackSize(WireList.Superconductor_UMV_Wire_1x, 64 * 16))
            .fluidInputs(
                setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 1000),
                setStackSize(FluidList.Spatially_Enlarged_Fluid, 144 * 1000),
                setStackSize(MoltenList.Molten_Metastable_Oganesson, 144 * 64 * 16),
                setStackSize(MoltenList.Molten_Shirabon, 144 * 64 * 16))
            .itemOutputs(MultiMachineControllerList.Eye_of_Harmony)
            .eut(RECIPE_UMV)
            .duration(24_000 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Exo-Foundry
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Mass_Solidifier, 64),
                setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing, 16),
                setStackSize(PipeList.Large_Infinity_Fluid_Pipe, 8),
                setStackSize(WireList.Superconductor_UEV_Wire_1x, 64 * 2),

                setStackSize(GTItemList.Field_Generator_UEV, 4),
                setStackSize(GTItemList.Electric_Pump_UEV, 8),
                setStackSize(GTItemList.Fluid_Regulator_UEV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                setStackSize(SuperdensePlateList.Superdense_Netherite_Plate, 4),
                setStackSize(RotorList.Cosmic_Neutronium_Rotor, 8),
                setStackSize(SingularityList.Eternal_Singularity, 1),
                setStackSize(GTPPList.Quantum_Anomaly, 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                setStackSize(MoltenList.Molten_Precious_Metals_Alloy, 144 * 32),
                setStackSize(MoltenList.Molten_Metastable_Oganesson, 144 * 20),
                setStackSize(MoltenList.Molten_Dragonblood, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Exo_Foundry)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Exothermic Hearth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Electric_Blast_Furnace, 64),
                setStackSize(MultiMachineControllerList.Volcanus, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Heating_Duct, 4),

                setStackSize(RodList.Firestone_Rod, 32),
                setStackSize(GTItemList.Electric_Pump_ZPM, 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM, 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x, 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil, 16),
                setStackSize(SuperdensePlateList.Superdense_Invar_Plate, 8),
                setStackSize(SuperdensePlateList.Superdense_Cupronickel_Plate, 8))
            .fluidInputs(
                setStackSize(FluidList.Blazing_Pyrotheum, 1000 * 256),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Exothermic_Hearth)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Flotation Cell Regulator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Dangote_Distillus, 2),
                setStackSize(MultiMachineCasingList.Inconel_Reinforced_Casing, 4),
                setStackSize(MultiMachineCasingList.Flotation_Cell_Casings, 4),
                setStackSize(GTItemList.Electric_Pump_LuV, 4),

                setStackSize(GearList.Stellite_Gear, 8),
                setStackSize(PlateList.Stellite_Plate, 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate, 16),
                setStackSize(ScrewList.Hastelloy_N_Screw, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Inconel_625, 144 * 16),
                setStackSize(MoltenList.Molten_Inconel_792, 144 * 32),
                setStackSize(MoltenList.Molten_Hastelloy_N, 144 * 32))
            .itemOutputs(MultiMachineControllerList.Flotation_Cell_Regulator)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Forge of the Gods
        {
            // "Forge of the Gods"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Stellar_Energy_Siphon_Casing, 4),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 2),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge, 64),
                    setStackSize(SingularityList.Eternal_Singularity, 32),

                    setStackSize(DensePlateList.Dense_Mellion_Plate, 16),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate, 16),
                    setStackSize(DensePlateList.Dense_Creon_Plate, 16),
                    setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate, 16),

                    setStackSize(GTItemList.Stable_Boson_Containment_Unit, 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),
                    setStackSize(GTItemList.Sensor_UIV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64),

                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV, 1),
                    setStackSize(GTBlockList.Energy_Distributor_UIV, 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 32),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 8192),
                    setStackSize(PlasmaList.Thorium_Plasma, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 32))
                .itemOutputs(MultiMachineControllerList.Forge_of_the_Gods)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflare Power Forge"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing, 4),
                    setStackSize(MultiMachineControllerList.Exothermic_Hearth, 64),
                    setStackSize(MultiMachineControllerList.Multi_Smelter, 64),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 4),
                    setStackSize(GTItemList.Robot_Arm_UIV, 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV, 16),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate, 16),

                    setStackSize(DensePlateList.Dense_Creon_Plate, 8),
                    setStackSize(DensePlateList.Dense_Mellion_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    setStackSize(PlasmaList.Lead_Plasma, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Helioflare_Power_Forge)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflux Melting Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing, 4),
                    setStackSize(MultiMachineControllerList.Exothermic_Hearth, 64),
                    setStackSize(MultiMachineControllerList.Mega_Alloy_Blast_Smelter, 64),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 8),
                    setStackSize(GTItemList.Robot_Arm_UIV, 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV, 32),
                    setStackSize(GTItemList.Electric_Pump_UIV, 64),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor, 8),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate, 16),
                    setStackSize(DensePlateList.Dense_Creon_Plate, 8),
                    setStackSize(DensePlateList.Dense_Mellion_Plate, 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Helioflux_Melting_Core)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliofusion Exoticizer"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing, 4),
                    setStackSize(MultiMachineControllerList.Transcendent_Plasma_Mixer, 4),
                    setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV, 1),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 4),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 16),
                    setStackSize(GTItemList.Robot_Arm_UIV, 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV, 32),
                    setStackSize(GTItemList.Electric_Pump_UIV, 64),

                    setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit, 8),
                    setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate, 4),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate, 2),
                    setStackSize(SuperdensePlateList.Superdense_Mellion_Plate, 2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Heliofusion_Exoticizer)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliothermal Plasma Fabricator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing, 4),
                    setStackSize(MachineList.Fluid_Heater_UIV, 64),
                    setStackSize(MultiMachineControllerList.FusionTech_MK_V, 8),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 8),
                    setStackSize(GTItemList.Robot_Arm_UIV, 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV, 32),
                    setStackSize(GTItemList.Electric_Pump_UIV, 64),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor, 8),
                    setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate, 2),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate, 1),
                    setStackSize(SuperdensePlateList.Superdense_Mellion_Plate, 1),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Heliothermal_Plasma_Fabricator)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fusion Control Computer
        {
            // "Fusion Control Computer Mark I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(DensePlateList.Dense_Naquadah_Alloy_Plate, 4),
                    setStackSize(DensePlateList.Dense_Netherite_Plate, 1),

                    setStackSize(GTItemList.Field_Generator_LuV, 2),
                    setStackSize(CircuitList.UHPIC_Wafer, 32),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Vanadium_Gallium, 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_I)
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Europium_Plate, 1),
                    setStackSize(GTItemList.Field_Generator_ZPM, 2),

                    setStackSize(CircuitList.PPIC_Wafer, 48),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Niobium_Titanium, 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_II)
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Americium_Plate, 1),
                    setStackSize(GTItemList.Field_Generator_UV, 2),

                    setStackSize(CircuitList.QPIC_Wafer, 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x, 64 * 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Fluxed_Electrum, 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_III)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate, 1),
                    setStackSize(GTItemList.Field_Generator_UHV, 2),

                    setStackSize(CircuitList.FPIC_Wafer, 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.UU_Matter, 1000 * 50),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 64),
                    setStackSize(MoltenList.Molten_Octiron, 144 * 64),
                    setStackSize(MoltenList.Molten_Astral_Titanium, 144 * 64))
                .itemOutputs(MultiMachineControllerList.FusionTech_MK_IV)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK V"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil_II, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate, 4),
                    setStackSize(GTItemList.Field_Generator_UEV, 2),

                    setStackSize(CircuitList.APIC_Wafer, 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 64 * 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Curium, 144 * 64),
                    setStackSize(MoltenList.Molten_Chromatic_Glass, 144 * 64),
                    setStackSize(MoltenList.Molten_Abyssal_Alloy, 144 * 64),
                    setStackSize(MoltenList.Molten_Dragonblood, 144 * 64))
                .itemOutputs(MultiMachineControllerList.FusionTech_MK_V)
                .eut(RECIPE_UEV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II, 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.UHPIC_Wafer, 32),
                    setStackSize(GTItemList.ZPM_Voltage_Coil, 16),

                    setStackSize(GTItemList.Iridium_Neutron_Reflector, 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKII, 8),
                    setStackSize(GTItemList.Field_Generator_ZPM, 8),
                    setStackSize(SmallGearList.Small_Artherium_Sn_Gear, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_MAR_Ce_M200_Steel, 144 * 16),
                    setStackSize(MoltenList.Molten_High_Durability_Compound_Steel, 144 * 8),
                    setStackSize(MoltenList.Molten_Artherium_Sn, 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKII)
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III, 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CircuitList.NPIC_Wafer, 64),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil, 16),

                    setStackSize(MiscPlateList.Advanced_Radiation_Proof_Plate, 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII, 8),
                    setStackSize(GTItemList.Field_Generator_UV, 8),
                    setStackSize(SmallGearList.Small_High_Durability_Compound_Steel_Gear, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Tanmolyium_Beta_C, 144 * 16),
                    setStackSize(MoltenList.Molten_Dalisenite, 144 * 8),
                    setStackSize(MoltenList.Molten_Americium, 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKIII)
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer Mk-IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV, 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.PPIC_Wafer, 64),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil, 16),

                    setStackSize(DensePlateList.Dense_Titansteel_Plate, 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype, 8),
                    setStackSize(GTItemList.Field_Generator_UHV, 8),
                    setStackSize(SmallGearList.Small_Enriched_Naquadah_Alloy_Gear, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Radox_Polymer, 144 * 9),
                    setStackSize(MoltenList.Molten_Dalisenite, 144 * 8),
                    setStackSize(MoltenList.Molten_Botmium, 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MkIV)
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-V"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_V, 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(CircuitList.QPIC_Wafer, 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil, 16),

                    setStackSize(DensePlateList.Dense_Hypogen_Plate, 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype, 8),
                    setStackSize(GTItemList.Field_Generator_UEV, 8),
                    setStackSize(SmallGearList.Small_Metastable_Oganesson_Gear, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Tairitsu, 144 * 16),
                    setStackSize(MoltenList.Molten_Octiron, 144 * 8),
                    setStackSize(MoltenList.Molten_Rhugnor, 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKV)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Hot Isostatic Pressurization Unit"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Large_Electric_Compressor, 4),
                setStackSize(MultiMachineCasingList.Heating_Duct, 4),
                setStackSize(MultiMachineCasingList.Coolant_Duct, 4),
                setStackSize(BlockList.Block_of_Netherite, 4),

                setStackSize(GTItemList.Electric_Piston_ZPM, 16),
                setStackSize(GTItemList.Robot_Arm_ZPM, 4),
                setStackSize(GTItemList.Electric_Pump_ZPM, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Incoloy_903, 144 * 64 * 4),
                setStackSize(MoltenList.Molten_Enriched_Naquadah, 144 * 64),
                setStackSize(FluidList.Liquid_Air, 1000 * 16),
                setStackSize(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit)
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Industrial_Apiary, 64),
                setStackSize(GTItemList.Upgraded_Acceleration_Upgrade_x256, 64),
                setStackSize(GTItemList.Genetic_Stabilizer_Upgrade, 64),
                setStackSize(GTItemList.Electric_Pump_UHV, 16),

                setStackSize(GTItemList.Robot_Arm_UV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 200),
                setStackSize(FluidList.Honey_Forestry, 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Infinite Fluid Drilling Rig"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Fluid_Drilling_Rig_IV, 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Electric_Motor_UHV, 4),

                setStackSize(GTItemList.Electric_Pump_UHV, 4),
                setStackSize(GearList.Neutronium_Gear, 4),
                setStackSize(GTItemList.Sensor_UHV, 3),
                setStackSize(GTItemList.Field_Generator_UHV, 3),

                setStackSize(ScrewList.Neutronium_Screw, 12))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 9),
                setStackSize(MoltenList.Molten_Neutronium, 144 * 4))
            .itemOutputs(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Integrated Ore Factory"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UHV, 1),
                setStackSize(GTItemList.Electric_Motor_UHV, 32),
                setStackSize(GTItemList.Electric_Piston_UHV, 8),
                setStackSize(GTItemList.Electric_Pump_UHV, 16),

                setStackSize(GTItemList.Conveyor_Module_UHV, 8),
                setStackSize(GTItemList.Robot_Arm_UHV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(WireList.Naquadah_Alloy_Wire_1x, 64 * 2),

                setStackSize(PipeList.PBI_Fluid_Pipe, 64),
                setStackSize(GTItemList.Tungsten_Grinding_Head, 64),
                setStackSize(DoublePlateList.Double_Stainless_Steel_Plate, 32),
                setStackSize(RotorList.Chrome_Rotor, 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                setStackSize(MoltenList.Molten_Naquadria, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Integrated_Ore_Factory)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "IsaMill Grinding Machine"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.IsaMill_Exterior_Casing, 4),
                setStackSize(MultiMachineCasingList.IsaMill_Gearbox, 4),
                setStackSize(GTItemList.Tungsten_Grinding_Head, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GearList.Inconel_625_Gear, 8),
                setStackSize(PlateList.Inconel_625_Plate, 32),
                setStackSize(DoublePlateList.Double_Zeron_100_Plate, 16),
                setStackSize(ScrewList.Zeron_100_Screw, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Zeron_100, 144 * 16),
                setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 32),
                setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32))
            .itemOutputs(MultiMachineControllerList.IsaMill_Grinding_Machine)
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Hadron Collider"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Research_Station, 8),
                setStackSize(HatchList.Neutron_Accelerator_UV, 8),
                setStackSize(GoodGeneratorList.Compact_Fusion_Coil, 64),
                setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil, 32),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64),
                setStackSize(GTItemList.Field_Generator_UV, 64),
                setStackSize(GTItemList.Samarium_Electromagnet, 1),
                setStackSize(MultiMachineCasingList.Charged_Matter_Sensor_Casing, 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Neutronium, 144 * 64 * 72),
                setStackSize(MoltenList.Molten_Cosmic_Neutronium, 144 * 64 * 72))
            .itemOutputs(MultiMachineControllerList.Large_Hadron_Collider)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Naquadah Reactor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Adamantium_Frame_Box, 8),
                setStackSize(GoodGeneratorList.Radiation_Proof_Plate, 16),
                setStackSize(GTItemList.Field_Generator_ZPM, 2),
                setStackSize(GTItemList.Electric_Pump_ZPM, 8),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(WireList.Superconductor_LuV_Wire_1x, 64),
                setStackSize(PipeList.Huge_Naquadah_Fluid_Pipe, 4),
                setStackSize(PlateList.Prismatic_Naquadah_Plate, 8),

                setStackSize(ScrewList.Osmium_Screw, 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Trinium, 144 * 4),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                setStackSize(FluidList.Lubricant, 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Large_Naquadah_Reactor)
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Matter Manipulator Quantum Uplink"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Data_Bank, 1),
                setStackSize(Appliedenergistics2List.ME_Controller, 4),
                setStackSize(Appliedenergistics2List.ME_Quantum_Ring, 8),
                setStackSize(Appliedenergistics2List.ME_Quantum_Link_Chamber, 1),

                setStackSize(Appliedenergistics2List.ME_IO_Port, 1),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card, 2),
                setStackSize(HatchList.Optical_Transmission_Connector, 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable, 32),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 64),
                setStackSize(MoltenList.Molten_Naquadria, 144 * 32))
            .itemOutputs(MultiMachineControllerList.Matter_Manipulator_Quantum_Uplink)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Alloy Blast Smelter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Alloy_Blast_Smelter, 64 * 4),
                setStackSize(GTItemList.Ultimate_Voltage_Coil, 16),
                setStackSize(GTItemList.Conveyor_Module_UV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                setStackSize(CircuitList.Piko_Power_IC_Chip, 16),

                setStackSize(PlateList.Pikyonium_64B_Plate, 16),
                setStackSize(ScrewList.Cinobite_A243_Screw, 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 8),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 10))
            .itemOutputs(MultiMachineControllerList.Mega_Alloy_Blast_Smelter)
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Chemical Reactor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor, 64),
                setStackSize(MultiMachineControllerList.ExxonMobil_Chemical_Plant, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Chemically_Inert_Machine_Casing, 8),

                setStackSize(GTItemList.Electric_Pump_LuV, 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV, 4),
                setStackSize(MachineList.Chemical_Reactor_IV, 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x, 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah, 144 * 4),
                setStackSize(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Mega_Chemical_Reactor)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Distillation Tower"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Distillation_Tower, 64),
                setStackSize(MultiMachineControllerList.Dangote_Distillus, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing, 8),

                setStackSize(GTItemList.Electric_Pump_LuV, 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV, 4),
                setStackSize(MachineList.Distillery_IV, 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x, 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah, 144 * 4),
                setStackSize(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Mega_Distillation_Tower)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Oil Cracker"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Oil_Cracking_Unit, 64),
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing, 8),

                setStackSize(GTItemList.Steam_Valve_IV, 8),
                setStackSize(GTItemList.Steam_Regulator_IV, 8),
                setStackSize(MultiMachineCasingList.Naquadah_Coil_Block, 8),
                setStackSize(WireList.Superconductor_LuV_Wire_1x, 32))
            .fluidInputs(
                setStackSize(FluidList.Lubricant, 1000 * 16),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah, 144 * 4))
            .itemOutputs(MultiMachineControllerList.Mega_Oil_Cracker)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Miniature Wormhole Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Active_Transformer, 1),
                setStackSize(Appliedenergistics2List.Singularity, 4),
                setStackSize(GTItemList.Field_Generator_ZPM, 4),
                setStackSize(GTItemList.Emitter_ZPM, 4),

                setStackSize(MultiMachineCasingList.Fusion_Coil_Block, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Neutronium, 144 * 12),
                setStackSize(MoltenList.Molten_Tritanium, 144 * 12),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 24),
                setStackSize(FluidList.Super_Coolant, 1000 * 7))
            .itemOutputs(MultiMachineControllerList.Miniature_Wormhole_Generator)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Molecular Transformer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FineWireList.Fine_HG_1223_Wire, 64 * 2),
                setStackSize(GTItemList.Electric_Motor_IV, 16),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty, 16),
                setStackSize(CableList.Platinum_Cable_12x, 16),

                setStackSize(WireList.Nichrome_Wire_16x, 32),
                setStackSize(FrameBoxList.Zeron_100_Frame_Box, 4),
                setStackSize(DoublePlateList.Double_Zirconium_Carbide_Plate, 32),
                setStackSize(PlateList.Babbit_Alloy_Plate, 64),

                setStackSize(GearList.Grisium_Gear, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 32),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GTItemList.Woods_Glass_Lens, 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Nitinol_60, 144 * 18),
                setStackSize(MoltenList.Molten_Incoloy_MA956, 144 * 72),
                setStackSize(MoltenList.Molten_Kanthal, 144 * 4))
            .itemOutputs(MultiMachineControllerList.Molecular_Transformer)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mothership Navigation Console"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UHV, 1),
                setStackSize(AmunRaList.Nanite_Control_Module, 32),
                setStackSize(MiscPlateList.Irradiant_Reinforced_Neutronium_Plate, 64),
                setStackSize(GalaxySpaceList.Rocket_Control_Computer_Tier_8, 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                setStackSize(GTItemList.Sensor_UHV, 8),
                setStackSize(GTItemList.Emitter_UHV, 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity, 144 * 100),
                setStackSize(MoltenList.Molten_Enriched_Naquadah_Alloy, 144 * 64 * 4),
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(MultiMachineControllerList.Mothership_Navigation_Console)
            .eut(RECIPE_UEV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nano Forge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UV, 16),
                setStackSize(GTItemList.Carbon_Nanites, 16),
                setStackSize(GTItemList.Field_Generator_ZPM, 16),
                setStackSize(GTItemList.Conveyor_Module_UV, 16),

                setStackSize(GTItemList.Electric_Motor_UV, 32),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(WireList.Naquadah_Wire_1x, 64 * 4),
                setStackSize(SuperdensePlateList.Superdense_Naquadah_Alloy_Plate, 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                setStackSize(MoltenList.Molten_HSS_S, 144 * 32),
                setStackSize(MoltenList.Molten_Osmiridium, 144 * 16))
            .itemOutputs(MultiMachineControllerList.Nano_Forge)
            .eut(RECIPE_ZPM)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nanochip Assembly Complex"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Circuit_Assembly_Line, 64),
                setStackSize(MultiMachineControllerList.Quantum_Computer, 8),
                setStackSize(MultiMachineControllerList.Research_Station, 8),
                setStackSize(MultiMachineControllerList.Data_Bank, 8),

                setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing, 16),
                setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing, 16),
                setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing, 8),
                setStackSize(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing, 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),
                setStackSize(BatteryList.Ultimate_Battery_Empty, 1),

                setStackSize(GTItemList.Sensor_UEV, 4),
                setStackSize(GTItemList.Emitter_UEV, 4),
                setStackSize(OpenComputersList.Screen_Tier3, 1),
                setStackSize(OpenComputersList.Keyboard, 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                setStackSize(PlasmaList.Celestial_Tungsten_Plasma, 144 * 64),
                setStackSize(PlasmaList.Americium_Plasma, 144 * 64),
                setStackSize(PlasmaList.Astral_Titanium_Plasma, 144 * 64))
            .itemOutputs(MultiMachineControllerList.Nanochip_Assembly_Complex)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Naquadah Fuel Refinery"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Osmiridium_Frame_Box, 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate, 64),
                setStackSize(GTItemList.Field_Generator_UV, 8),
                setStackSize(GTItemList.Electric_Pump_UHV, 2),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(PipeList.Huge_Mysterious_Crystal_Fluid_Pipe, 8),
                setStackSize(CircuitList.NPIC_Wafer, 16),
                setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil, 64),

                setStackSize(GTItemList.Aer_Lens, 16),
                setStackSize(ScrewList.Thulium_Screw, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Quantium, 144 * 64),
                setStackSize(MoltenList.Molten_Awakened_Draconium, 144 * 32),
                setStackSize(MoltenList.Molten_Extremely_Unstable_Naquadah, 144 * 10),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 100))
            .itemOutputs(MultiMachineControllerList.Naquadah_Fuel_Refinery)
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "PCB Factory"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Neutronium_Frame_Box, 32),
                setStackSize(MachineList.Circuit_Assembler_ZPM, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(GTItemList.Robot_Arm_ZPM, 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 36),
                setStackSize(MoltenList.Molten_Naquadah, 144 * 18))
            .itemOutputs(MultiMachineControllerList.PCB_Factory)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Pseudostable Black Hole Containment Field"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit, 1),
                setStackSize(MultiMachineControllerList.Neutronium_Compressor, 1),
                setStackSize(MultiMachineControllerList.Density2, 16),
                setStackSize(MachineList.Compressor_UIV, 8),

                setStackSize(MultiMachineControllerList.Electric_Implosion_Compressor, 4),
                setStackSize(GTItemList.Field_Generator_UEV, 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty, 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                setStackSize(GTPPList.Quantum_Anomaly, 64),
                setStackSize(RingList.Proto_Halkonite_Steel_Ring, 32),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor, 16),
                setStackSize(GearList.Proto_Halkonite_Steel_Gear, 8),

                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate, 16),
                setStackSize(SuperdensePlateList.Superdense_Naquadria_Plate, 16),
                setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate, 8),
                setStackSize(SuperdensePlateList.Superdense_Kevlar_Plate, 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_SpaceTime, 144 * 10),
                setStackSize(GasList.Oganesson, 1000 * 64 * 4),
                setStackSize(MoltenList.Molten_Superconductor_Base_UIV, 144 * 300),
                setStackSize(MoltenList.Molten_Infinity, 144 * 100))
            .itemOutputs(MultiMachineControllerList.Pseudostable_Black_Hole_Containment_Field)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Computer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS, 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTItemList.Data_Orb, 1),
                setStackSize(GTItemList.Computer_Monitor_Cover, 1),

                setStackSize(WireList.Superconductor_UV_Wire_1x, 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable, 8),
                setStackSize(SuperdensePlateList.Superdense_Polybenzimidazole_PBI_Sheet, 2))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter, 1000),
                setStackSize(MoltenList.Molten_Iridium, 144 * 9),
                setStackSize(FluidList.IC2_Coolant, 1000 * 2),
                setStackSize(GasList.Hydrogen, 1000))
            .itemOutputs(MultiMachineControllerList.Quantum_Computer)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Force Transformer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Molecular_Transformer, 1),
                setStackSize(SingularityList.Eternal_Singularity, 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                setStackSize(GTItemList.Electric_Pump_UEV, 4),

                setStackSize(GTItemList.Field_Generator_UEV, 4),
                setStackSize(GTPPList.Quantum_Anomaly, 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 10),
                setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 32))
            .itemOutputs(MultiMachineControllerList.Quantum_Force_Transformer)
            .eut(RECIPE_UIV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Research Station"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS, 1),
                setStackSize(GTItemList.Sensor_ZPM, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(GTItemList.Field_Generator_ZPM, 1),

                setStackSize(GTItemList.Electric_Motor_ZPM, 2),
                setStackSize(CableList.Naquadah_Cable_2x, 4),
                setStackSize(FineWireList.Fine_Naquadah_Wire, 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable, 16))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter, 1000),
                setStackSize(MoltenList.Molten_Iridium, 144 * 9),
                setStackSize(FluidList.IC2_Coolant, 1000 * 2),
                setStackSize(MoltenList.Molten_Osmium, 144 * 9))
            .itemOutputs(MultiMachineControllerList.Research_Station)
            .eut(RECIPE_UV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Semi-Stable Antimatter Stabilization Sequencer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV, 1),
                setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box, 16),
                setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator, 16),
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil, 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire, 64),
                setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire, 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                setStackSize(GTItemList.Electric_Pump_UIV, 16),

                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate, 4),
                setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate, 64))
            .fluidInputs(
                setStackSize(FluidList.Protomatter, 1000 * 10),
                setStackSize(MoltenList.Molten_Six_Phased_Copper, 144 * 64),
                setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64),
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 10))
            .itemOutputs(MultiMachineControllerList.Semi_Stable_Antimatter_Stabilization_Sequencer)
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Shielded Lagrangian Annihilation Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Miniature_Wormhole_Generator, 1),
                setStackSize(HatchList.Laser_Source_Hatch1048576_UIV, 4),
                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),

                setStackSize(GTItemList.Emitter_UIV, 32),
                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate, 4),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor, 16),
                setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire, 64 * 3))
            .fluidInputs(
                setStackSize(FluidList.Semi_Stable_Antimatter, 1000),
                setStackSize(MoltenList.Molten_Six_Phased_Copper, 144 * 64),
                setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 64),
                setStackSize(MoltenList.Molten_Superconductor_Base_UIV, 144 * 64))
            .itemOutputs(MultiMachineControllerList.Shielded_Lagrangian_Annihilation_Matrix)
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Space Elevator
        {
            // "Space Elevator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(OpenBlocksList.Elevator, 1),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box, 64),
                    setStackSize(GTItemList.Field_Generator_UV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7, 32),
                    setStackSize(CircuitList.Piko_Power_IC_Chip, 64),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw, 64),
                    setStackSize(GTItemList.Electric_Motor_UV, 32),

                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 40),
                    setStackSize(FluidList.UU_Matter, 1000 * 16),
                    setStackSize(FluidList.Lubricant, 1000 * 32),
                    setStackSize(MoltenList.Molten_Neutronium, 144 * 10))
                .itemOutputs(MultiMachineControllerList.Space_Elevator)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing, 1),
                    setStackSize(MachineList.Assembler_UV, 4),
                    setStackSize(MachineList.Circuit_Assembler_UV, 4),
                    setStackSize(GearList.Cosmic_Neutronium_Gear, 8),

                    setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear, 16),
                    setStackSize(GTItemList.Robot_Arm_UHV, 8),
                    setStackSize(GTItemList.Conveyor_Module_UHV, 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII, 32),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box, 8),
                    setStackSize(ScrewList.Neutronium_Screw, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKI)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing, 1),
                    setStackSize(MachineList.Assembler_UEV, 4),
                    setStackSize(MachineList.Circuit_Assembler_UEV, 4),
                    setStackSize(GearList.Transcendent_Metal_Gear, 8),

                    setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear, 16),
                    setStackSize(GTItemList.Robot_Arm_UIV, 8),
                    setStackSize(GTItemList.Conveyor_Module_UIV, 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype, 32),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(FrameBoxList.Hypogen_Frame_Box, 8),
                    setStackSize(ScrewList.Hypogen_Screw, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                    setStackSize(MoltenList.Molten_Infinity, 144 * 9),
                    setStackSize(FluidList.UU_Matter, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing, 1),
                    setStackSize(MachineList.Assembler_UMV, 4),
                    setStackSize(MachineList.Circuit_Assembler_UMV, 4),
                    setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear, 8),

                    setStackSize(GearList.Magmatter_Gear, 8),
                    setStackSize(SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear, 16),
                    setStackSize(SmallGearList.Small_Magmatter_Gear, 16),
                    setStackSize(GTItemList.Robot_Arm_UXV, 8),

                    setStackSize(GTItemList.Conveyor_Module_UXV, 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 16),
                    setStackSize(FrameBoxList.Universium_Frame_Box, 8),

                    setStackSize(ScrewList.Universium_Screw, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 36),
                    setStackSize(MoltenList.Molten_Black_Dwarf_Matter, 144 * 9),
                    setStackSize(MoltenList.Molten_White_Dwarf_Matter, 144 * 9),
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 9))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKIII)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV, 1),
                    setStackSize(GTItemList.Robot_Arm_UV, 8),
                    setStackSize(GTItemList.Field_Generator_UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),

                    setStackSize(GTItemList.Sensor_UV, 16),
                    setStackSize(WireList.Superconductor_UV_Wire_1x, 64 * 2),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 10),
                    setStackSize(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKI)
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKI, 1),
                    setStackSize(GTItemList.Robot_Arm_UHV, 8),
                    setStackSize(GTItemList.Field_Generator_UHV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(GTItemList.Sensor_UHV, 16),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64 * 2),
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 20),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKII)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKII, 1),
                    setStackSize(GTItemList.Robot_Arm_UEV, 8),
                    setStackSize(GTItemList.Field_Generator_UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Sensor_UEV, 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 64 * 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box, 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 10),
                    setStackSize(FluidList.UU_Matter, 1000 * 2))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKIII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig, 1),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon, 1),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover, 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(GTItemList.Electric_Pump_UEV, 2),
                    setStackSize(GearList.Infinity_Gear, 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 9),
                    setStackSize(MoltenList.Molten_Infinity, 144 * 4))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKI)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig, 4),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon, 4),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover, 8),
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(GTItemList.Electric_Pump_UIV, 8),
                    setStackSize(GearList.SpaceTime_Gear, 4),
                    setStackSize(ScrewList.Metastable_Oganesson_Screw, 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 32),
                    setStackSize(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig, 16),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon, 16),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover, 32),
                    setStackSize(FrameBoxList.Black_Dwarf_Matter_Frame_Box, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 16),
                    setStackSize(GTItemList.Electric_Pump_UMV, 8),
                    setStackSize(GearList.Black_Dwarf_Matter_Gear, 4),
                    setStackSize(ScrewList.White_Dwarf_Matter_Screw, 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                    setStackSize(MoltenList.Molten_Eternity, 144 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKIII)
                .eut(RECIPE_UMV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Sparge Tower Controller"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Sparge_Tower_Exterior_Casing, 4),
                setStackSize(MultiMachineCasingList.Integral_Encasement_V, 4),
                setStackSize(MachineList.Distillery_IV, 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),

                setStackSize(GearList.HS188_A_Gear, 8),
                setStackSize(PlateList.HS188_A_Plate, 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate, 16),
                setStackSize(ScrewList.Hastelloy_N_Screw, 64),

                setStackSize(FineWireList.Fine_Yttrium_Barium_Cuprate_Wire, 64 * 2),
                setStackSize(FoilList.Platinum_Foil, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Incoloy_DS, 144 * 16),
                setStackSize(MoltenList.Molten_Tantalum_Carbide, 144 * 32),
                setStackSize(MoltenList.Molten_Titanium, 144 * 32))
            .itemOutputs(MultiMachineControllerList.Sparge_Tower_Controller)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Spinmatron-2737
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Industrial_Centrifuge, 64),
                setStackSize(MultiMachineControllerList.Large_Supercritical_Steam_Turbine, 4),
                setStackSize(HatchList.Rotor_Assembly, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                setStackSize(RotorList.Pikyonium_64B_Rotor, 4),
                setStackSize(RotorList.HeLiCoPtEr_Rotor, 4),
                setStackSize(RotorList.Arceus_Alloy_2B_Rotor, 4),
                setStackSize(RotorList.Netherite_Rotor, 4),

                setStackSize(GTItemList.Electric_Motor_ZPM, 4),
                setStackSize(GTItemList.Electric_Pump_ZPM, 4),
                setStackSize(ScrewList.Pikyonium_64B_Screw, 16),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x, 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_MAR_Ce_M200_Steel, 144 * 16),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(FluidList.Lubricant, 1000 * 4))
            .itemOutputs(MultiMachineControllerList.Spinmatron_2737)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Transcendent Plasma Mixer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Laser_Target_Hatch262144_UEV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                setStackSize(GTItemList.Electric_Pump_UEV, 16),
                setStackSize(PlateList.Proto_Halkonite_Steel_Plate, 64),

                setStackSize(GearList.Proto_Halkonite_Steel_Gear, 16),
                setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear, 64),
                setStackSize(ScrewList.Proto_Halkonite_Steel_Screw, 64),
                setStackSize(GTItemList.Energised_Tesseract, 32))
            .fluidInputs(
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst, 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 64 * 32))
            .itemOutputs(MultiMachineControllerList.Transcendent_Plasma_Mixer)
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Uncertainty Resolution"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Advanced_Computer_Casing, 1),
                setStackSize(HatchList.Auto_Taping_Maintenance_Hatch, 1),
                setStackSize(GTItemList.Field_Generator_UIV, 1),
                setStackSize(GTPPList.Quantum_Anomaly, 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),
                setStackSize(GTBlockList.Optical_Fiber_Cable, 64 * 2),
                setStackSize(GTItemList.Computer_Monitor_Cover, 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Iridium, 144 * 100),
                setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                setStackSize(PlasmaList.Neptunium_Plasma, 1000 * 20),
                setStackSize(PlasmaList.Fermium_Plasma, 1000 * 20))
            .itemOutputs(HatchList.Uncertainty_Resolution)
            .eut(RECIPE_UIV)
            .duration(200 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner I"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV, 1),
                setStackSize(FrameBoxList.Netherite_Frame_Box, 4),
                setStackSize(PlateList.Europium_Plate, 3),
                setStackSize(GTItemList.Electric_Motor_LuV, 9),

                setStackSize(GTItemList.Sensor_LuV, 9),
                setStackSize(GTItemList.Field_Generator_LuV, 9),
                setStackSize(ScrewList.Europium_Screw, 36))
            .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10), setStackSize(GasList.Neon, 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_I)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner II"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Void_Miner_I, 1),
                setStackSize(FrameBoxList.Black_Plutonium_Frame_Box, 9),
                setStackSize(PlateList.Black_Plutonium_Plate, 3),
                setStackSize(GTItemList.Electric_Motor_ZPM, 9),

                setStackSize(GTItemList.Sensor_ZPM, 9),
                setStackSize(GTItemList.Field_Generator_ZPM, 9),
                setStackSize(ScrewList.Black_Plutonium_Screw, 36))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(GasList.Krypton, 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_II)
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner III"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Void_Miner_II, 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box, 9),
                setStackSize(PlateList.Neutronium_Plate, 3),
                setStackSize(GTItemList.Electric_Motor_UV, 9),

                setStackSize(GTItemList.Sensor_UV, 9),
                setStackSize(GTItemList.Field_Generator_UV, 9),
                setStackSize(ScrewList.Neutronium_Screw, 36))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                setStackSize(GasList.Oganesson, 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_III)
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Water Machine
        {
            // "Water Purification Plant"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungsten_Frame_Box, 4),
                    setStackSize(MultiMachineCasingList.Sterile_Water_Plant_Casing, 8),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing, 8),
                    setStackSize(GTItemList.Electric_Motor_LuV, 2),

                    setStackSize(GTItemList.Robot_Arm_LuV, 1),
                    setStackSize(GTItemList.Electric_Pump_LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(CableList.Niobium_Titanium_Cable_8x, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Water_Purification_Plant)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Clarifier Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTItemList.Activated_Carbon_Filter_Mesh, 16),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing, 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV, 1),

                    setStackSize(GTItemList.Electric_Motor_LuV, 4),
                    setStackSize(GTItemList.Electric_Pump_LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Osmium, 144 * 8),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Clarifier_Purification_Unit)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ozonation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungstensteel_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Inert_Filtration_Casing, 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV, 1),

                    setStackSize(PlateList.Hastelloy_C276_Plate, 8),
                    setStackSize(RotorList.Hastelloy_C276_Rotor, 4),
                    setStackSize(RotorList.Hastelloy_X_Rotor, 4),
                    setStackSize(PlateList.Hastelloy_X_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_LuV, 4),
                    setStackSize(GTItemList.Electric_Pump_LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Hastelloy_C276, 144 * 8),
                    setStackSize(MoltenList.Molten_Hastelloy_X, 144 * 8),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Clarifier_Purification_Unit)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Flocculation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Adamantium_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Slick_Sterile_Flocculation_Casing, 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV, 1),

                    setStackSize(PlateList.Trinium_Plate, 8),
                    setStackSize(RotorList.Trinium_Rotor, 4),
                    setStackSize(RotorList.Naquadah_Alloy_Rotor, 4),
                    setStackSize(PlateList.Naquadah_Alloy_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_ZPM, 4),
                    setStackSize(GTItemList.Electric_Pump_ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Iridium, 144 * 16),
                    setStackSize(MoltenList.Molten_Naquadah_Alloy, 144 * 16),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16),
                    setStackSize(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(MultiMachineControllerList.Flocculation_Purification_Unit)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "pH Neutralization Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Stabilized_Naquadah_Water_Plant_Casing, 8),
                    setStackSize(MultiMachineCasingList.Inert_Neutralization_Water_Plant_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_ZPM, 1),

                    setStackSize(PlateList.Naquadah_Alloy_Plate, 8),
                    setStackSize(RotorList.Naquadah_Alloy_Rotor, 4),
                    setStackSize(RotorList.Hastelloy_C276_Rotor, 4),
                    setStackSize(PlateList.Hastelloy_C276_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_ZPM, 4),
                    setStackSize(GTItemList.Electric_Pump_ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Naquadah_Alloy, 144 * 16),
                    setStackSize(MoltenList.Molten_Hastelloy_C276, 144 * 16),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16),
                    setStackSize(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(MultiMachineControllerList.pH_Neutralization_Purification_Unit)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extreme Temperature Fluctuation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Heat_Resistant_Trinium_Plated_Casing, 8),
                    setStackSize(MultiMachineCasingList.Superconducting_Coil_Block, 8),
                    setStackSize(HatchList.Energy_Hatch64_UV, 1),

                    setStackSize(PlateList.Neutronium_Plate, 8),
                    setStackSize(RotorList.Neutronium_Rotor, 4),
                    setStackSize(RotorList.Netherite_Rotor, 4),
                    setStackSize(PlateList.Netherite_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_UV, 4),
                    setStackSize(GTItemList.Electric_Pump_UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium, 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 32),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                    setStackSize(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(MultiMachineControllerList.Extreme_Temperature_Fluctuation_Purification_Unit)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "High Energy Laser Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Naquadria_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Naquadria_Reinforced_Water_Plant_Casing, 8),
                    setStackSize(MultiMachineCasingList.High_Energy_Ultraviolet_Emitter_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_UV, 1),

                    setStackSize(PlateList.Neutronium_Plate, 8),
                    setStackSize(RotorList.Neutronium_Rotor, 4),
                    setStackSize(RotorList.Draconium_Rotor, 4),
                    setStackSize(PlateList.Draconium_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_UV, 4),
                    setStackSize(GTItemList.Electric_Pump_UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium, 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 32),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32),
                    setStackSize(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(MultiMachineControllerList.High_Energy_Laser_Purification_Unit)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Residual Decontaminant Degasser Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box, 8),
                    setStackSize(MultiMachineCasingList.Heat_Resistant_Trinium_Plated_Casing, 8),
                    setStackSize(MultiMachineCasingList.Computer_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_UEV, 1),

                    setStackSize(PlateList.Infinity_Plate, 8),
                    setStackSize(RotorList.Infinity_Rotor, 4),
                    setStackSize(RotorList.Cosmic_Neutronium_Rotor, 4),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate, 8),

                    setStackSize(GTItemList.Electric_Motor_UEV, 4),
                    setStackSize(GTItemList.Electric_Pump_UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(PipeList.Infinity_Fluid_Pipe, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Quantium, 144 * 64),
                    setStackSize(MoltenList.Molten_Infinity, 144 * 64),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                    setStackSize(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(MultiMachineControllerList.Residual_Decontaminant_Degasser_Purification_Unit)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Absolute Baryonic Perfection Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box, 16),
                    setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing, 8),
                    setStackSize(MultiMachineCasingList.Femtometer_Calibrated_Particle_Beam_Casing, 8),
                    setStackSize(HatchList.Energy_Hatch64_UEV, 1),

                    setStackSize(PlateList.Infinity_Plate, 16),
                    setStackSize(RotorList.Infinity_Rotor, 8),
                    setStackSize(RotorList.Cosmic_Neutronium_Rotor, 8),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate, 16),

                    setStackSize(GTItemList.Electric_Motor_UEV, 4),
                    setStackSize(GTItemList.Electric_Pump_UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),

                    setStackSize(PipeList.Infinity_Fluid_Pipe, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64),
                    setStackSize(MoltenList.Molten_Infinity, 144 * 64),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                    setStackSize(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(MultiMachineControllerList.Absolute_Baryonic_Perfection_Purification_Unit)
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }
    }
}
