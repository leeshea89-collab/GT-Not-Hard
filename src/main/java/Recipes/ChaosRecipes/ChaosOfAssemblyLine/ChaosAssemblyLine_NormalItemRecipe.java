package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
import static gregtech.api.enums.TierEU.RECIPE_EV;
import static gregtech.api.enums.TierEU.RECIPE_IV;
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

import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.DraconicEvolutionList;
import EnumList.EnumItemList.EnumModList.KubaTechList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import EnumList.EnumItemList.EnumOreProductList.OreList;
import net.minecraft.item.ItemStack;

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
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.PipeList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.CasingList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.DrillTipList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.MiscPlateList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.QuintuplePlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.RoundList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AvaritiaList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GalacticraftList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTUtility;

public class ChaosAssemblyLine_NormalItemRecipe {

    public static void addChaosAssemblyLine_NormalItemRecipe() {
        // "Advanced Radiation Proof Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MiscPlateList.Radiation_Proof_Plate, 2),
                setStackSize(PlateList.Fluxed_Electrum_Plate, 4),
                setStackSize(PlateList.Trinium_Plate, 4),
                setStackSize(PlateList.Naquadah_Alloy_Plate, 4),

                setStackSize(PlateList.Osmiridium_Plate, 4),
                setStackSize(PlateList.Vibrant_Alloy_Plate, 4),
                setStackSize(MiscPlateList.Radiation_Proof_Prismatic_Naquadah_Composite_Sheet, 4))
            .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8))
            .itemOutputs(MiscPlateList.Advanced_Radiation_Proof_Plate)
            .eut(RECIPE_ZPM)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Bio Processing Unit"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board, 1),
                setStackSize(CircuitList.Biocells, 16),
                setStackSize(GTItemList.Reinforced_Glass_Tube, 16),
                setStackSize(PipeList.Tiny_PBI_Fluid_Pipe, 16),

                setStackSize(CasingList.Fluxed_Electrum_Casing, 16),
                setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                setStackSize(BoltList.HSSS_Bolt, 32))
            .fluidInputs(
                setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium, 500),
                setStackSize(FluidList.UU_Matter, 500),
                setStackSize(FluidList.IC2_Coolant, 1000 * 2))
            .itemOutputs(CircuitList.Bio_Processing_Unit)
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Carbon Nanites"
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),
                setStackSize(GTItemList.Robot_Arm_UV, 16),
                setStackSize(CircuitList.Stemcells, 32),
                setStackSize(RingList.Naquadah_Alloy_Ring, 32),

                setStackSize(RodList.Naquadah_Alloy_Rod, 16),
                setStackSize(DustList.Carbon_Dust, 64))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter, 1000 * 10),
                setStackSize(MoltenList.Molten_Indalloy_140, 144 * 32))
            .itemOutputs(GTItemList.Carbon_Nanites)
            .eut(RECIPE_UV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Charge Pack
        {
            // "Containment Unit I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PlateList.Inconel_625_Plate, 16),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_8x, 32),
                    setStackSize(GearList.Inconel_625_Gear, 4),
                    setStackSize(GTPPList.Coil_Wire_EV, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Zeron_100, 144 * 8),
                    setStackSize(MoltenList.Molten_Hastelloy_N, 144 * 16),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 16))
                .itemOutputs(GTPPList.Containment_Unit_I)
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Proton Cell Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Containment_Unit_I, 1),
                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit, 16),
                    setStackSize(PlateList.Zeron_100_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(WireList.Yttrium_Barium_Cuprate_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt, 8),
                    setStackSize(ScrewList.Inconel_625_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Zeron_100, 144 * 16),
                    setStackSize(MoltenList.Molten_Hastelloy_N, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 16))
                .itemOutputs(GTPPList.Proton_Cell_Empty)
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Proton Cell"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Containment_Unit_I, 1),
                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit, 16),
                    setStackSize(PlateList.Zeron_100_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(WireList.Yttrium_Barium_Cuprate_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt, 8),
                    setStackSize(ScrewList.Inconel_625_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Zeron_100, 144 * 16),
                    setStackSize(MoltenList.Molten_Hastelloy_N, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 16))
                .itemOutputs(GTPPList.Proton_Cell)
                .eut(RECIPE_LuV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [LuV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Proton_Cell_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_EV, 64),
                    setStackSize(PlateList.Zeron_100_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(CableList.Nichrome_Cable_12x, 16),
                    setStackSize(ScrewList.Zeron_100_Screw, 16),
                    setStackSize(BoltList.Hastelloy_N_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_IV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Zeron_100, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    setStackSize(MoltenList.Molten_Arcanite, 144 * 16),
                    setStackSize(MoltenList.Molten_Inconel_792, 144 * 16))
                .itemOutputs(GTPPList.Charge_Pack_LuV_Empty)
                .eut(RECIPE_LuV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [LuV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Proton_Cell_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_EV, 64),
                    setStackSize(PlateList.Zeron_100_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(CableList.Nichrome_Cable_12x, 16),
                    setStackSize(ScrewList.Zeron_100_Screw, 16),
                    setStackSize(BoltList.Hastelloy_N_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_IV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Zeron_100, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    setStackSize(MoltenList.Molten_Arcanite, 144 * 16),
                    setStackSize(MoltenList.Molten_Inconel_792, 144 * 16))
                .itemOutputs(GTPPList.Charge_Pack_LuV)
                .eut(RECIPE_LuV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Containment Unit II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PlateList.Zeron_100_Plate, 16),
                    setStackSize(CableList.Naquadah_Cable_8x, 32),
                    setStackSize(GearList.Zeron_100_Gear, 4),
                    setStackSize(GTPPList.Coil_Wire_IV, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 8),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 16))
                .itemOutputs(GTPPList.Containment_Unit_II)
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electron Cell Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Containment_Unit_II, 1),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit, 16),
                    setStackSize(PlateList.Pikyonium_64B_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(WireList.Naquadah_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt, 8),
                    setStackSize(ScrewList.Zeron_100_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 32),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 16),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16))
                .itemOutputs(GTPPList.Electron_Cell_Empty)
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electron Cell"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Containment_Unit_II, 1),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit, 16),
                    setStackSize(PlateList.Pikyonium_64B_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(WireList.Naquadah_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt, 8),
                    setStackSize(ScrewList.Zeron_100_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 16),
                    setStackSize(MoltenList.Molten_Energy_Crystal, 144 * 32),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 16),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16))
                .itemOutputs(GTPPList.Electron_Cell)
                .eut(RECIPE_ZPM)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [ZPM] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Electron_Cell_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_IV, 64),
                    setStackSize(PlateList.Pikyonium_64B_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(CableList.Platinum_Cable_12x, 16),
                    setStackSize(ScrewList.Pikyonium_64B_Screw, 16),
                    setStackSize(BoltList.Energy_Crystal_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_LuV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 32),
                    setStackSize(MoltenList.Molten_Arcanite, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_ZPM_Empty)
                .eut(RECIPE_ZPM)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [ZPM]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Electron_Cell_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_IV, 64),
                    setStackSize(PlateList.Pikyonium_64B_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(CableList.Platinum_Cable_12x, 16),
                    setStackSize(ScrewList.Pikyonium_64B_Screw, 16),
                    setStackSize(BoltList.Energy_Crystal_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_LuV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 32),
                    setStackSize(MoltenList.Molten_Arcanite, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_ZPM)
                .eut(RECIPE_ZPM)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Advanced Containment Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PlateList.Pikyonium_64B_Plate, 16),
                    setStackSize(CableList.Duranium_Cable_8x, 32),
                    setStackSize(GearList.Pikyonium_64B_Gear, 4),
                    setStackSize(GTPPList.Coil_Wire_LuV, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Advanced_Nitinol, 144 * 8),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16),
                    setStackSize(MoltenList.Molten_Titansteel, 144 * 16))
                .itemOutputs(GTPPList.Advanced_Containment_Unit)
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Quark Entanglement Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Advanced_Containment_Unit, 1),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit, 16),
                    setStackSize(PlateList.Advanced_Nitinol_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(WireList.Duranium_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Titansteel_Bolt, 8),
                    setStackSize(ScrewList.Pikyonium_64B_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Advanced_Nitinol, 144 * 16),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    setStackSize(MoltenList.Molten_Titansteel, 144 * 16),
                    setStackSize(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16))
                .itemOutputs(GTPPList.Quark_Entanglement_Empty)
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Quark Entanglement"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Advanced_Containment_Unit, 1),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit, 16),
                    setStackSize(PlateList.Advanced_Nitinol_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(WireList.Duranium_Wire_1x, 64 * 8),
                    setStackSize(BoltList.Titansteel_Bolt, 8),
                    setStackSize(ScrewList.Pikyonium_64B_Screw, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Advanced_Nitinol, 144 * 16),
                    setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    setStackSize(MoltenList.Molten_Titansteel, 144 * 16),
                    setStackSize(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16))
                .itemOutputs(GTPPList.Quark_Entanglement)
                .eut(RECIPE_UV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Quark_Entanglement_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_LuV, 64),
                    setStackSize(PlateList.Advanced_Nitinol_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x, 16),
                    setStackSize(ScrewList.Titansteel_Screw, 16),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_ZPM, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Advanced_Nitinol, 144 * 32),
                    setStackSize(MoltenList.Molten_Arceus_Alloy_2B, 144 * 32),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_UV_Empty)
                .eut(RECIPE_UV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Quark_Entanglement_Empty, 2),
                    setStackSize(GTPPList.Coil_Wire_LuV, 64),
                    setStackSize(PlateList.Advanced_Nitinol_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x, 16),
                    setStackSize(ScrewList.Titansteel_Screw, 16),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_ZPM, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Advanced_Nitinol, 144 * 32),
                    setStackSize(MoltenList.Molten_Arceus_Alloy_2B, 144 * 32),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 32),
                    setStackSize(MoltenList.Molten_Lafium_Compound, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_UV)
                .eut(RECIPE_UV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UHV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Graviton_Anomaly, 2),
                    setStackSize(GTPPList.Coil_Wire_ZPM, 64),
                    setStackSize(PlateList.Abyssal_Alloy_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(CableList.Naquadah_Cable_12x, 16),
                    setStackSize(ScrewList.Abyssal_Alloy_Screw, 16),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_UV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Abyssal_Alloy, 144 * 32),
                    setStackSize(MoltenList.Molten_Titansteel, 144 * 64),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_UHV_Empty)
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UHV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Graviton_Anomaly, 2),
                    setStackSize(GTPPList.Coil_Wire_ZPM, 64),
                    setStackSize(PlateList.Abyssal_Alloy_Plate, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(CableList.Naquadah_Cable_12x, 16),
                    setStackSize(ScrewList.Abyssal_Alloy_Screw, 16),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt, 32),

                    setStackSize(GTItemList.Field_Generator_UV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Abyssal_Alloy, 144 * 32),
                    setStackSize(MoltenList.Molten_Titansteel, 144 * 64),
                    setStackSize(MoltenList.Molten_Cinobite_A243, 144 * 32))
                .itemOutputs(GTPPList.Charge_Pack_UHV)
                .eut(RECIPE_UHV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Circuit
        {
            // "Neuro Processing Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(CircuitList.Extreme_Wetware_Lifesupport_Circuit_Board, 1),
                    setStackSize(CircuitList.Stemcells, 16),
                    setStackSize(GTItemList.Reinforced_Glass_Tube, 16),
                    setStackSize(PipeList.Tiny_PBI_Fluid_Pipe, 8),

                    setStackSize(CasingList.Enriched_Naquadah_Casing, 4),
                    setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                    setStackSize(BoltList.Tungstensteel_Bolt, 32))
                .fluidInputs(
                    setStackSize(FluidList.Growth_Catalyst_Medium, 250),
                    setStackSize(FluidList.UU_Matter, 250),
                    setStackSize(FluidList.IC2_Coolant, 1000))
                .itemOutputs(CircuitList.Neuro_Processing_Unit)
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // Wetware Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x, 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x, 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x, 2) };

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box, 2),
                            setStackSize(CircuitList.Wetware_Supercomputer, 2),
                            setStackSize(CircuitList.Advanced_SMD_Inductor, 16),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor, 16),

                            setStackSize(CircuitList.Advanced_SMD_Resistor, 16),
                            setStackSize(CircuitList.Advanced_SMD_Transistor, 16),
                            setStackSize(CircuitList.Advanced_SMD_Diode, 16),
                            setStackSize(CircuitList.Random_Access_Memory_Chip, 48),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64))
                        .fluidInputs(
                            setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                            setStackSize(FluidList.IC2_Coolant, 1000 * 10),
                            setStackSize(GasList.Radon, 2500))
                        .itemOutputs(CircuitList.Wetware_Mainframe)
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 7),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box, 2),
                            setStackSize(CircuitList.Wetware_Supercomputer, 2),
                            setStackSize(CircuitList.Optical_SMD_Inductor, 4),
                            setStackSize(CircuitList.Optical_SMD_Capacitor, 4),

                            setStackSize(CircuitList.Optical_SMD_Resistor, 4),
                            setStackSize(CircuitList.Optical_SMD_Transistor, 4),
                            setStackSize(CircuitList.Optical_SMD_Diode, 4),
                            setStackSize(CircuitList.Random_Access_Memory_Chip, 48),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64))
                        .fluidInputs(
                            setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                            setStackSize(FluidList.IC2_Coolant, 1000 * 10),
                            setStackSize(GasList.Radon, 2500))
                        .itemOutputs(CircuitList.Wetware_Mainframe)
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Bioware SuperComputer
            {
                final ItemStack[] Transistor = new ItemStack[] { setStackSize(CircuitList.Advanced_SMD_Transistor, 16),
                    setStackSize(CircuitList.Optical_SMD_Transistor, 4) };

                final ItemStack[] Resistor = new ItemStack[] { setStackSize(CircuitList.Advanced_SMD_Resistor, 16),
                    setStackSize(CircuitList.Optical_SMD_Resistor, 4) };

                final ItemStack[] Capacitor = new ItemStack[] { setStackSize(CircuitList.Advanced_SMD_Capacitor, 16),
                    setStackSize(CircuitList.Optical_SMD_Capacitor, 4) };

                final ItemStack[] Diode = new ItemStack[] { setStackSize(CircuitList.Advanced_SMD_Diode, 16),
                    setStackSize(CircuitList.Optical_SMD_Diode, 4) };

                for (int Circuit_Parts_Tier = 0; Circuit_Parts_Tier < 2; Circuit_Parts_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(Circuit_Parts_Tier + 1),

                            setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board, 2),
                            setStackSize(CircuitList.Bioware_Assembly, 2),
                            Transistor[Circuit_Parts_Tier],
                            Resistor[Circuit_Parts_Tier],

                            Capacitor[Circuit_Parts_Tier],
                            Diode[Circuit_Parts_Tier],
                            setStackSize(CircuitList.NOR_Memory_Chip, 32),
                            setStackSize(CircuitList.Random_Access_Memory_Chip, 64),

                            setStackSize(FineWireList.Fine_Niobium_Titanium_Wire, 32),
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder, 144 * 10),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 10),
                            setStackSize(FluidList.Super_Coolant, 1000 * 10))
                        .itemOutputs(CircuitList.Bioware_Supercomputer)
                        .eut(RECIPE_UV)
                        .duration(200 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Bio Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 16),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x, 8) };

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box, 4),
                            setStackSize(CircuitList.Bioware_Supercomputer, 2),
                            setStackSize(CircuitList.Advanced_SMD_Inductor, 24),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor, 24),

                            setStackSize(CircuitList.Advanced_SMD_Resistor, 24),
                            setStackSize(CircuitList.Advanced_SMD_Transistor, 24),
                            setStackSize(CircuitList.Advanced_SMD_Diode, 24),
                            setStackSize(CircuitList.Random_Access_Memory_Chip, 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 64))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 20),
                            setStackSize(FluidList.Super_Coolant, 1000 * 20))
                        .itemOutputs(CircuitList.Bioware_Mainframe)
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 5),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box, 4),
                            setStackSize(CircuitList.Bioware_Supercomputer, 2),
                            setStackSize(CircuitList.Optical_SMD_Inductor, 6),
                            setStackSize(CircuitList.Optical_SMD_Capacitor, 6),

                            setStackSize(CircuitList.Optical_SMD_Resistor, 6),
                            setStackSize(CircuitList.Optical_SMD_Transistor, 6),
                            setStackSize(CircuitList.Optical_SMD_Diode, 6),
                            setStackSize(CircuitList.Random_Access_Memory_Chip, 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 64))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 20),
                            setStackSize(FluidList.Super_Coolant, 1000 * 20))
                        .itemOutputs(CircuitList.Bioware_Mainframe)
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Optical Assembly
            {
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        CircuitList.Optical_Circuit_Board,
                        setStackSize(CircuitList.Optical_Processor, 4),
                        setStackSize(CircuitList.Optical_SMD_Inductor, 16),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 20),

                        setStackSize(CircuitList.Optical_SMD_Resistor, 20),
                        setStackSize(CircuitList.NOR_Memory_Chip, 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip, 64),
                        setStackSize(FineWireList.Fine_Lumiium_Wire, 24),

                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 10),
                        setStackSize(PlasmaList.Radon_Plasma, 144 * 10),
                        setStackSize(FluidList.Super_Coolant, 1000 * 10),
                        setStackSize(GasList.Oganesson, 500))
                    .itemOutputs(CircuitList.Optical_Assembly)
                    .eut(RECIPE_UHV)
                    .duration(20 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // Optical Computer
            {
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(CircuitList.Optical_Circuit_Board, 2),
                        setStackSize(CircuitList.Optical_Assembly, 4),
                        setStackSize(CircuitList.Optical_SMD_Transistor, 24),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 24),

                        setStackSize(CircuitList.Optical_SMD_Capacitor, 24),
                        setStackSize(CircuitList.Optical_SMD_Diode, 24),
                        setStackSize(CircuitList.NOR_Memory_Chip, 64),
                        setStackSize(CircuitList.ASoC_Chip, 32),

                        setStackSize(FineWireList.Fine_Lumiium_Wire, 32),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                        setStackSize(PlasmaList.Radon_Plasma, 144 * 20),
                        setStackSize(FluidList.Super_Coolant, 1000 * 20),
                        setStackSize(GasList.Oganesson, 1000))
                    .itemOutputs(CircuitList.Optical_Supercomputer)
                    .eut(RECIPE_UHV)
                    .duration(200 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // Optical Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 64),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 32),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x, 16) };

                for (int superConductor_Tier = 0; superConductor_Tier < 3; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box, 8),
                            setStackSize(CircuitList.Optical_Supercomputer, 4),
                            setStackSize(CircuitList.Advanced_SMD_Inductor, 32),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor, 32),

                            setStackSize(CircuitList.Advanced_SMD_Resistor, 32),
                            setStackSize(CircuitList.Advanced_SMD_Transistor, 32),
                            setStackSize(CircuitList.Advanced_SMD_Diode, 32),
                            setStackSize(CircuitList.ASoC_Chip, 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 128),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 128))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder, 144 * 40),
                            setStackSize(PlasmaList.Radon_Plasma, 144 * 40),
                            setStackSize(FluidList.Super_Coolant, 1000 * 40),
                            setStackSize(GasList.Oganesson, 1000 * 2))
                        .itemOutputs(CircuitList.Optical_Mainframe)
                        .eut(RECIPE_UEV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Special Circuit
            {
                // "Nano Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(FrameBoxList.Tritanium_Frame_Box, 8),
                        setStackSize(CircuitList.Bioware_Mainframe, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 32),

                        setStackSize(CircuitList.Optical_SMD_Transistor, 32),
                        setStackSize(CircuitList.Optical_SMD_Diode, 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip, 64),
                        setStackSize(CircuitList.Nano_Power_IC_Chip, 64),

                        setStackSize(WireList.Draconium_Wire_1x, 64),
                        setStackSize(WireList.Superconductor_UHV_Wire_1x, 128),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 26),
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 28),
                        setStackSize(FluidList.IC2_Coolant, 1000 * 20))
                    .itemOutputs(NewHorizonsCoreModList.Nano_Circuit)
                    .eut(RECIPE_UIV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Pico Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(CircuitList.Optical_Circuit_Board, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor, 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 48),

                        setStackSize(CircuitList.Optical_SMD_Capacitor, 48),
                        setStackSize(CircuitList.Optical_SMD_Diode, 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip, 64),
                        setStackSize(FoilList.Thin_Radox_Polymer_Sheet, 16),

                        setStackSize(BoltList.Transcendent_Metal_Bolt, 32),
                        setStackSize(BoltList.Neutronium_Bolt, 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 8),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 16),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 64),
                        setStackSize(CircuitList.Optical_SMD_Diode, 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor, 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip, 64),
                        setStackSize(FoilList.Shirabon_Foil, 64),

                        setStackSize(BoltList.Indium_Bolt, 64),
                        setStackSize(WireList.SpaceTime_Wire_1x, 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 16))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 24),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit)
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // Drone
        {
            // "Drone Remote Interface"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate, 16),
                    setStackSize(GTItemList.Computer_Monitor_Cover, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(GTItemList.Field_Generator_UHV, 4),

                    setStackSize(GTItemList.Sensor_UHV, 8),
                    setStackSize(GTItemList.Emitter_UHV, 8),
                    setStackSize(GTItemList.Drone_Level_3, 1),
                    setStackSize(GTItemList.Data_Orb, 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 1000),
                    setStackSize(FluidList.Ethyl_Cyanoacrylate_Super_Glue, 1000 * 64))
                .itemOutputs(GTItemList.Drone_Remote_Interface)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 2)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DensePlateList.Dense_Naquadah_Alloy_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3, 4),
                    setStackSize(GTItemList.Large_Osmium_Fluid_Cell, 1),

                    setStackSize(PipeList.Quadruple_Mysterious_Crystal_Fluid_Pipe, 1),
                    setStackSize(GTItemList.Emitter_ZPM, 4),
                    setStackSize(BatteryList.Energy_Module_Empty, 1),
                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4),
                    setStackSize(FluidList.CN3H7O3_Rocket_Fuel, 1000 * 4))
                .itemOutputs(setStackSize(GTItemList.Drone_Level_2, 4))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 3)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DensePlateList.Dense_Infinity_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(GTItemList.Field_Generator_UV, 16),
                    setStackSize(GTItemList.Gravi_Star, 8),

                    setStackSize(GTItemList.Emitter_UV, 4),
                    setStackSize(HatchList.Auto_Taping_Maintenance_Hatch, 16),
                    setStackSize(BatteryList.Energy_Cluster_Empty, 8),
                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 1000),
                    setStackSize(FluidList.Ethyl_Cyanoacrylate_Super_Glue, 1000 * 2))
                .itemOutputs(GTItemList.Drone_Level_3)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 4)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(IngotList.Hypogen_Ingot, 1),
                    setStackSize(SingularityList.Eternal_Singularity, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(GTItemList.Field_Generator_UHV, 16),

                    setStackSize(GTItemList.Nuclear_Star, 8),
                    setStackSize(GTItemList.Emitter_UHV, 4),
                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty, 1),
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIII, 64))
                .fluidInputs(
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 8),
                    setStackSize(FluidList.Mutated_Living_Solder, 1000 * 8))
                .itemOutputs(GTItemList.Drone_Level_4)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Dyson
        {
            // "Corona-Resistant Drone Case"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(OpenComputersList.Drone_Case_Tier3, 4),
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box, 4),
                    setStackSize(GTItemList.Emitter_UEV, 1),
                    setStackSize(OpenComputersList.Navigation_Upgrade, 64),

                    setStackSize(GTItemList.Gravitation_Engine, 4),
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty, 4),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 1))
                .fluidInputs(
                    setStackSize(PlasmaList.Xenon_Plasma, 1000),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 5))
                .itemOutputs(GTNHIntergalacticList.Corona_Resistant_Drone_Case)
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Magnetically Shielded Femtocontroller"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(OpenComputersList.Microcontroller_Case_Tier3, 4),
                    setStackSize(CircuitList.Optically_Perfected_CPU, 1),
                    setStackSize(GTItemList.Sensor_UEV, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Energised_Tesseract, 1),
                    setStackSize(ScrewList.Enriched_Naquadah_Alloy_Screw, 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 4))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 5))
                .itemOutputs(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller)
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Ultra_Durable_Solar_Sail, 4),
                    setStackSize(GTNHIntergalacticList.Corona_Resistant_Drone_Case, 1),
                    setStackSize(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller, 1),
                    setStackSize(MachineList.Radioisotope_Thermoelectric_Generator, 1),

                    setStackSize(GTNHIntergalacticList.Hyperfine_TrNq_Radioisomer_Pellet, 1),
                    setStackSize(CircuitList.Femto_Power_IC_Chip, 4))
                .fluidInputs(
                    setStackSize(FluidList.Gelid_Cryotheum, 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 2))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module, 64))
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Electromagnet
        {
            // "Steel Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PlateList.Nickel_Zinc_Ferrite_Plate, 32),
                    setStackSize(RingList.Magnetic_Steel_Ring, 16),
                    setStackSize(GTItemList.Ludicrous_Voltage_Coil, 16),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x, 64),

                    setStackSize(GTItemList.Field_Generator_LuV, 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant, 1000 * 8),
                    setStackSize(MoltenList.Molten_Cobalt_GregTech, 144 * 16),
                    setStackSize(MoltenList.Molten_Vanadium_Gallium, 144 * 16))
                .itemOutputs(GTItemList.Steel_Electromagnet)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neodymium Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PlateList.Naquadah_Alloy_Plate, 32),
                    setStackSize(RingList.Magnetic_Neodymium_Ring, 16),
                    setStackSize(GTItemList.ZPM_Voltage_Coil, 16),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x, 64 * 2),

                    setStackSize(GTItemList.Field_Generator_ZPM, 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16),
                    setStackSize(MoltenList.Molten_Cobalt_GregTech, 144 * 32),
                    setStackSize(MoltenList.Molten_Osmiridium, 144 * 16))
                .itemOutputs(GTItemList.Neodymium_Electromagnet)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Samarium Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DoublePlateList.Double_Neutronium_Plate, 32),
                    setStackSize(RingList.Magnetic_Samarium_Ring, 32),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil, 32),
                    setStackSize(WireList.Superconductor_UV_Wire_1x, 64 * 4),

                    setStackSize(GTItemList.Field_Generator_UV, 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant, 1000 * 32),
                    setStackSize(MoltenList.Molten_Cobalt_GregTech, 144 * 48),
                    setStackSize(MoltenList.Molten_Fluxed_Electrum, 144 * 16))
                .itemOutputs(GTItemList.Samarium_Electromagnet)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Tengam Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate, 32),
                    setStackSize(RingList.Attuned_Tengam_Ring, 32),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil, 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64 * 8),

                    setStackSize(GTItemList.Field_Generator_UHV, 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant, 1000 * 64),
                    setStackSize(MoltenList.Molten_Cobalt_GregTech, 144 * 64),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 16))
                .itemOutputs(GTItemList.Tengam_Electromagnet)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Energy Orb & Ultimate Battery
        {
            // "Lapotronic Energy Orb Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board, 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 72),

                    setStackSize(CircuitList.High_Power_IC_Chip, 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 8),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor, 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor, 8),

                    setStackSize(CircuitList.Advanced_SMD_Transistor, 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire, 64))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 5))
                .itemOutputs(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Energy Orb Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board, 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 72),

                    setStackSize(CircuitList.High_Power_IC_Chip, 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 8),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor, 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor, 8),

                    setStackSize(CircuitList.Advanced_SMD_Transistor, 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire, 64))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 5))
                .itemOutputs(BatteryList.Lapotronic_Energy_Orb_Cluster)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(PlateList.Europium_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 2),
                    setStackSize(GTItemList.Field_Generator_LuV, 2),

                    setStackSize(CircuitList.ASoC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 8),
                    setStackSize(CableList.Naquadah_Cable_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Energy_Module_Empty)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(PlateList.Europium_Plate, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 2),
                    setStackSize(GTItemList.Field_Generator_LuV, 2),

                    setStackSize(CircuitList.ASoC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 8),
                    setStackSize(CableList.Naquadah_Cable_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Energy_Module)
                .eut(RECIPE_ZPM)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(PlateList.Americium_Plate, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 4),
                    setStackSize(GTItemList.Field_Generator_ZPM, 2),

                    setStackSize(CircuitList.HPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 16),
                    setStackSize(CableList.Naquadah_Alloy_Cable_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Energy_Cluster_Empty)
                .eut(RECIPE_UV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(PlateList.Americium_Plate, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 4),
                    setStackSize(GTItemList.Field_Generator_ZPM, 2),

                    setStackSize(CircuitList.HPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 16),
                    setStackSize(CableList.Naquadah_Alloy_Cable_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Energy_Cluster)
                .eut(RECIPE_UV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(PlateList.Tritanium_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 8),
                    setStackSize(GTItemList.Field_Generator_UV, 2),

                    setStackSize(CircuitList.HPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Ultimate_Battery_Empty)
                .eut(RECIPE_UV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(PlateList.Tritanium_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 8),
                    setStackSize(GTItemList.Field_Generator_UV, 2),

                    setStackSize(CircuitList.HPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(BatteryList.Ultimate_Battery)
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Really Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(DoublePlateList.Double_Neutronium_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 16),
                    setStackSize(GTItemList.Field_Generator_UHV, 2),

                    setStackSize(CircuitList.UHPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer, 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 64),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(BatteryList.Really_Ultimate_Battery_Empty)
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Really Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(DoublePlateList.Double_Neutronium_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 16),
                    setStackSize(GTItemList.Field_Generator_UHV, 2),

                    setStackSize(CircuitList.UHPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer, 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode, 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x, 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 64),
                    setStackSize(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(BatteryList.Really_Ultimate_Battery)
                .eut(RECIPE_UHV)
                .duration(400 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 32),
                    setStackSize(GTItemList.Field_Generator_UEV, 2),

                    setStackSize(CircuitList.PPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(BatteryList.Extremely_Ultimate_Battery_Empty)
                .eut(RECIPE_UEV)
                .duration(250 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 32),
                    setStackSize(GTItemList.Field_Generator_UEV, 2),

                    setStackSize(CircuitList.PPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x, 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(BatteryList.Extremely_Ultimate_Battery)
                .eut(RECIPE_UEV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(DoublePlateList.Double_Hypogen_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 64),
                    setStackSize(GTItemList.Field_Generator_UIV, 2),

                    setStackSize(CircuitList.QPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor, 32),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64 * 2))
                .itemOutputs(BatteryList.Insanely_Ultimate_Battery_Empty)
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(DoublePlateList.Double_Hypogen_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 64),
                    setStackSize(GTItemList.Field_Generator_UIV, 2),

                    setStackSize(CircuitList.QPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor, 32),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x, 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64 * 2))
                .itemOutputs(BatteryList.Insanely_Ultimate_Battery)
                .eut(RECIPE_UIV)
                .duration(600 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(DoublePlateList.Double_Dragonblood_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 128),
                    setStackSize(GTItemList.Field_Generator_UMV, 2),

                    setStackSize(CircuitList.FPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor, 64),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x, 64 * 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Astral_Titanium, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 4),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64 * 4))
                .itemOutputs(BatteryList.Mega_Ultimate_Battery_Empty)
                .eut(RECIPE_UMV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(DoublePlateList.Double_Dragonblood_Plate, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip, 64 * 128),
                    setStackSize(GTItemList.Field_Generator_UMV, 2),

                    setStackSize(CircuitList.FPIC_Wafer, 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip, 64),
                    setStackSize(CircuitList.Optical_SMD_Diode, 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor, 64),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x, 64 * 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Astral_Titanium, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 4),
                    setStackSize(FluidList.Super_Coolant, 1000 * 64 * 4))
                .itemOutputs(BatteryList.Mega_Ultimate_Battery)
                .eut(RECIPE_UMV)
                .duration(720 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fluid Storage Core
        {
            // "Fluid Storage Core T3"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PipeList.Nonuple_Stainless_Steel_Fluid_Pipe, 4),
                    setStackSize(GTItemList.Electric_Pump_HV, 8),
                    setStackSize(GTBlockList.Quantum_Tank_I, 1),
                    setStackSize(DensePlateList.Dense_Osmium_Plate, 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator, 1),
                    setStackSize(FoilList.Thin_Polycaprolactam_PCL_Sheet, 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16),
                    setStackSize(FluidList.Lubricant, 1000 * 4))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T3)
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T4"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PipeList.Nonuple_Titanium_Fluid_Pipe, 4),
                    setStackSize(GTItemList.Electric_Pump_EV, 8),
                    setStackSize(GTBlockList.Quantum_Tank_I, 4),
                    setStackSize(DensePlateList.Dense_Europium_Plate, 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator, 4),
                    setStackSize(FoilList.Thin_Styrene_Butadiene_Rubber_SBR_Sheet, 64),
                    setStackSize(PipeList.Large_Tungstensteel_Fluid_Pipe, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 64 * 2),
                    setStackSize(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T4)
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T5"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PipeList.Nonuple_Mysterious_Crystal_Fluid_Pipe, 4),
                    setStackSize(GTItemList.Electric_Pump_IV, 8),
                    setStackSize(GTBlockList.Quantum_Tank_III, 8),
                    setStackSize(DensePlateList.Dense_Neutronium_Plate, 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator, 16),
                    setStackSize(QuintuplePlateList.Quintuple_Polycaprolactam_PCL_Sheet, 24),
                    setStackSize(PipeList.Huge_Titanium_Fluid_Pipe, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 16),
                    setStackSize(MoltenList.Molten_Titanium, 144 * 2),
                    setStackSize(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T5)
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T6"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe, 4),
                    setStackSize(GTItemList.Electric_Pump_LuV, 8),
                    setStackSize(GTBlockList.Quantum_Tank_IV, 16),
                    setStackSize(DensePlateList.Dense_Infinity_Plate, 16),

                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 16),
                    setStackSize(GalacticraftList.Fluid_Manipulator, 16),
                    setStackSize(MachineList.Compressor_IV, 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 16),
                    setStackSize(MoltenList.Molten_Titanium, 144 * 2),
                    setStackSize(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T6)
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T7"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GalacticraftList.Fluid_Manipulator, 64),
                    setStackSize(GTItemList.Electric_Pump_ZPM, 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor, 1),
                    setStackSize(GTBlockList.Quantum_Tank_IV, 32),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe, 8),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Catalyst_Plate, 8),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 160),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16),
                    setStackSize(MoltenList.Molten_Infinity_Catalyst, 144 * 8))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T7)
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T8"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GalacticraftList.Fluid_Manipulator, 64),
                    setStackSize(GTItemList.Electric_Pump_UV, 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor, 2),
                    setStackSize(GTBlockList.Quantum_Tank_IV, 64),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe, 8),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Plate, 24),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 210),
                    setStackSize(MoltenList.Molten_Infinity_Catalyst, 144 * 40))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T8)
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T9"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GalacticraftList.Fluid_Manipulator, 64),
                    setStackSize(GTItemList.Electric_Pump_UHV, 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor, 2),
                    setStackSize(GTBlockList.Quantum_Tank_V, 8),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe, 32),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Plate, 36),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 210),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 10),
                    setStackSize(MoltenList.Molten_Infinity_Catalyst, 144 * 40))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T9)
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T10"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GalacticraftList.Fluid_Manipulator, 64),
                    setStackSize(GTItemList.Electric_Pump_UEV, 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor, 4),
                    setStackSize(GTBlockList.Quantum_Tank_V, 16),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe, 32),
                    setStackSize(QuintuplePlateList.Quintuple_Cosmic_Neutronium_Plate, 24),
                    setStackSize(DoublePlateList.Double_SpaceTime_Plate, 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 320),
                    setStackSize(MoltenList.Molten_Transcendent_Metal, 144 * 30),
                    setStackSize(MoltenList.Molten_Infinity_Catalyst, 144 * 120))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T10)
                .eut(RECIPE_UXV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // GT Part Items
        {
            // LuV
            {
                // "Electric Motor (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(RodList.Magnetic_Samarium_Rod, 1),
                        setStackSize(LongRodList.Long_HSSS_Rod, 2),
                        setStackSize(FineWireList.Fine_Ruridit_Wire, 64 * 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144),
                        setStackSize(FluidList.Lubricant, 250))
                    .itemOutputs(GTItemList.Electric_Motor_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_LuV, 1),
                        setStackSize(PipeList.Small_Niobium_Titanium_Fluid_Pipe, 2),
                        setStackSize(PlateList.HSSS_Plate, 2),
                        setStackSize(ScrewList.HSSS_Screw, 8),

                        setStackSize(RingList.Silicone_Rubber_Ring, 4),
                        setStackSize(RotorList.HSSS_Rotor, 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144),
                        setStackSize(FluidList.Lubricant, 250))
                    .itemOutputs(GTItemList.Electric_Pump_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_LuV, 2),
                        setStackSize(PlateList.HSSS_Plate, 2),
                        setStackSize(RingList.HSSS_Ring, 4),
                        setStackSize(RoundList.HSSS_Round, 32),

                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 10))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144),
                        setStackSize(FluidList.Lubricant, 250))
                    .itemOutputs(GTItemList.Conveyor_Module_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_LuV, 1),
                        setStackSize(PlateList.HSSS_Plate, 6),
                        setStackSize(RingList.HSSS_Ring, 4),
                        setStackSize(RoundList.HSSS_Round, 32),

                        setStackSize(RodList.HSSS_Rod, 4),
                        setStackSize(GearList.HSSS_Gear, 1),
                        setStackSize(SmallGearList.Small_HSSS_Gear, 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144),
                        setStackSize(FluidList.Lubricant, 250))
                    .itemOutputs(GTItemList.Electric_Piston_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_HSSS_Rod, 4),
                        setStackSize(GearList.HSSS_Gear, 1),
                        setStackSize(SmallGearList.Small_HSSS_Gear, 3),
                        setStackSize(GTItemList.Electric_Motor_LuV, 2),

                        setStackSize(GTItemList.Electric_Piston_LuV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 8),

                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4),
                        setStackSize(FluidList.Lubricant, 250))
                    .itemOutputs(GTItemList.Robot_Arm_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.HSSS_Frame_Box, 1),
                        setStackSize(PlateList.HSSS_Plate, 6),
                        setStackSize(GTItemList.Quantum_Star, 2),
                        setStackSize(GTItemList.Emitter_LuV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FineWireList.Fine_Ruridit_Wire, 64 * 4),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 8))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(GTItemList.Field_Generator_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.HSSS_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_LuV, 1),
                        setStackSize(RodList.Ruridit_Rod, 8),
                        setStackSize(GTItemList.Quantum_Star, 1),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                        setStackSize(FoilList.Gallium_Foil, 64 * 3),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 7))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(GTItemList.Emitter_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.HSSS_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_LuV, 1),
                        setStackSize(PlateList.Ruridit_Plate, 8),
                        setStackSize(GTItemList.Quantum_Star, 1),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                        setStackSize(FoilList.Gallium_Foil, 64 * 3),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x, 7))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(GTItemList.Sensor_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // ZPM
            {
                // "Electric Motor (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(RodList.Magnetic_Samarium_Rod, 2),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod, 4),
                        setStackSize(RingList.Naquadah_Alloy_Ring, 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round, 16),

                        setStackSize(FineWireList.Fine_Europium_Wire, 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 2),
                        setStackSize(FluidList.Lubricant, 750))
                    .itemOutputs(GTItemList.Electric_Motor_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_ZPM, 1),
                        setStackSize(PipeList.Enderium_Fluid_Pipe, 2),
                        setStackSize(PlateList.Naquadah_Alloy_Plate, 2),
                        setStackSize(ScrewList.Naquadah_Alloy_Screw, 8),

                        setStackSize(RingList.Silicone_Rubber_Ring, 8),
                        setStackSize(RotorList.Naquadah_Alloy_Rotor, 2),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 2),
                        setStackSize(FluidList.Lubricant, 750))
                    .itemOutputs(GTItemList.Electric_Pump_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_ZPM, 2),
                        setStackSize(PlateList.Naquadah_Alloy_Plate, 2),
                        setStackSize(RingList.Naquadah_Alloy_Ring, 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round, 32),

                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 20))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 2),
                        setStackSize(FluidList.Lubricant, 750))
                    .itemOutputs(GTItemList.Conveyor_Module_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_ZPM, 1),
                        setStackSize(PlateList.Naquadah_Alloy_Plate, 6),
                        setStackSize(RingList.Naquadah_Alloy_Ring, 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round, 32),

                        setStackSize(RodList.Naquadah_Alloy_Rod, 4),
                        setStackSize(GearList.Naquadah_Alloy_Gear, 1),
                        setStackSize(SmallGearList.Small_Naquadah_Alloy_Gear, 2),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 2),
                        setStackSize(FluidList.Lubricant, 750))
                    .itemOutputs(GTItemList.Electric_Piston_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod, 4),
                        setStackSize(GearList.Naquadah_Alloy_Gear, 1),
                        setStackSize(SmallGearList.Small_Naquadah_Alloy_Gear, 3),
                        setStackSize(GTItemList.Electric_Motor_ZPM, 2),

                        setStackSize(GTItemList.Electric_Piston_ZPM, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),

                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8),
                        setStackSize(FluidList.Lubricant, 750))
                    .itemOutputs(GTItemList.Robot_Arm_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box, 1),
                        setStackSize(PlateList.Naquadah_Alloy_Plate, 6),
                        setStackSize(GTItemList.Quantum_Star, 2),
                        setStackSize(GTItemList.Emitter_ZPM, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FineWireList.Fine_Europium_Wire, 64 * 4),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 8))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(GTItemList.Field_Generator_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_ZPM, 1),
                        setStackSize(RodList.Osmiridium_Rod, 8),
                        setStackSize(GTItemList.Quantum_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FoilList.Trinium_Foil, 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 7))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(GTItemList.Emitter_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_ZPM, 1),
                        setStackSize(PlateList.Osmiridium_Plate, 8),
                        setStackSize(GTItemList.Quantum_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FoilList.Trinium_Foil, 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x, 7))
                    .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(GTItemList.Sensor_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UV
            {
                // "Electric Motor (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Magnetic_Samarium_Rod, 2),
                        setStackSize(LongRodList.Long_Neutronium_Rod, 4),
                        setStackSize(RingList.Neutronium_Ring, 4),
                        setStackSize(RoundList.Neutronium_Round, 16),

                        setStackSize(FineWireList.Fine_Americium_Wire, 64 * 6),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                        setStackSize(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(GTItemList.Electric_Motor_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UV, 1),
                        setStackSize(PipeList.Large_Naquadah_Fluid_Pipe, 2),
                        setStackSize(PlateList.Neutronium_Plate, 2),
                        setStackSize(ScrewList.Neutronium_Screw, 8),

                        setStackSize(RingList.Silicone_Rubber_Ring, 16),
                        setStackSize(RotorList.Neutronium_Rotor, 2),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                        setStackSize(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(GTItemList.Electric_Pump_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UV, 2),
                        setStackSize(PlateList.Neutronium_Plate, 2),
                        setStackSize(RingList.Neutronium_Ring, 4),
                        setStackSize(RoundList.Neutronium_Round, 32),

                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 40))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                        setStackSize(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(GTItemList.Conveyor_Module_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UV, 1),
                        setStackSize(PlateList.Neutronium_Plate, 6),
                        setStackSize(RingList.Neutronium_Ring, 4),
                        setStackSize(RoundList.Neutronium_Round, 32),

                        setStackSize(RodList.Neutronium_Rod, 4),
                        setStackSize(GearList.Neutronium_Gear, 1),
                        setStackSize(SmallGearList.Small_Neutronium_Gear, 2),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 9),
                        setStackSize(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(GTItemList.Electric_Piston_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Neutronium_Rod, 4),
                        setStackSize(GearList.Neutronium_Gear, 1),
                        setStackSize(SmallGearList.Small_Neutronium_Gear, 3),
                        setStackSize(GTItemList.Electric_Motor_UV, 2),

                        setStackSize(GTItemList.Electric_Piston_UV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),

                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16),
                        setStackSize(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(GTItemList.Robot_Arm_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 1),
                        setStackSize(PlateList.Neutronium_Plate, 6),
                        setStackSize(GTItemList.Gravi_Star, 2),
                        setStackSize(GTItemList.Emitter_UV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FineWireList.Fine_Americium_Wire, 64 * 6),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(GTItemList.Field_Generator_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UV, 1),
                        setStackSize(RodList.Neutronium_Rod, 8),
                        setStackSize(GTItemList.Gravi_Star, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FoilList.Naquadria_Foil, 64 * 3),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(GTItemList.Emitter_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UV, 1),
                        setStackSize(PlateList.Neutronium_Plate, 8),
                        setStackSize(GTItemList.Gravi_Star, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FoilList.Naquadria_Foil, 64 * 3),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 9),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(GTItemList.Sensor_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UHV
            {
                // "Electric Motor (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Magnetic_Samarium_Rod, 4),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod, 8),
                        setStackSize(RingList.Cosmic_Neutronium_Ring, 4),
                        setStackSize(RoundList.Cosmic_Neutronium_Round, 16),

                        setStackSize(FineWireList.Fine_Neutronium_Wire, 64 * 8),
                        setStackSize(CableList.Bedrockium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Motor_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UHV, 1),
                        setStackSize(PipeList.Large_Neutronium_Fluid_Pipe, 2),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate, 4),
                        setStackSize(ScrewList.Cosmic_Neutronium_Screw, 16),

                        setStackSize(RingList.Silicone_Rubber_Ring, 32),
                        setStackSize(RotorList.Cosmic_Neutronium_Rotor, 4),
                        setStackSize(CableList.Bedrockium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Pump_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UHV, 2),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate, 2),
                        setStackSize(RingList.Cosmic_Neutronium_Ring, 8),
                        setStackSize(RoundList.Cosmic_Neutronium_Round, 64),

                        setStackSize(CableList.Bedrockium_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 40))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Conveyor_Module_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UHV, 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate, 6),
                        setStackSize(RingList.Cosmic_Neutronium_Ring, 8),
                        setStackSize(RoundList.Cosmic_Neutronium_Round, 64),

                        setStackSize(RodList.Cosmic_Neutronium_Rod, 8),
                        setStackSize(GearList.Cosmic_Neutronium_Gear, 2),
                        setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear, 4),
                        setStackSize(CableList.Bedrockium_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Piston_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod, 8),
                        setStackSize(GearList.Cosmic_Neutronium_Gear, 2),
                        setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear, 6),
                        setStackSize(GTItemList.Electric_Motor_UHV, 2),

                        setStackSize(GTItemList.Electric_Piston_UHV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                        setStackSize(CableList.Bedrockium_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Robot_Arm_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box, 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate, 6),
                        setStackSize(GTItemList.Gravi_Star, 4),
                        setStackSize(GTItemList.Emitter_UHV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FineWireList.Fine_Neutronium_Wire, 64 * 8),
                        setStackSize(CableList.Bedrockium_Cable_4x, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(GTItemList.Field_Generator_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UHV, 1),
                        setStackSize(RodList.Cosmic_Neutronium_Rod, 8),
                        setStackSize(GTItemList.Gravi_Star, 8),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FoilList.Fluxed_Electrum_Foil, 64 * 4),
                        setStackSize(CableList.Bedrockium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(GTItemList.Emitter_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UHV, 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate, 8),
                        setStackSize(GTItemList.Gravi_Star, 8),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FoilList.Fluxed_Electrum_Foil, 64 * 4),
                        setStackSize(CableList.Bedrockium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 18),
                        setStackSize(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(GTItemList.Sensor_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UEV
            {
                // "Electric Motor (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod, 8),
                        setStackSize(LongRodList.Long_Infinity_Rod, 16),
                        setStackSize(RingList.Infinity_Ring, 8),
                        setStackSize(RoundList.Infinity_Round, 32),

                        setStackSize(FineWireList.Fine_Cosmic_Neutronium_Wire, 64 * 8),
                        setStackSize(CableList.Draconium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Motor_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UEV, 1),
                        setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe, 2),
                        setStackSize(PlateList.Infinity_Plate, 4),
                        setStackSize(ScrewList.Infinity_Screw, 16),

                        setStackSize(RingList.Silicone_Rubber_Ring, 64),
                        setStackSize(RotorList.Infinity_Rotor, 4),
                        setStackSize(CableList.Draconium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Pump_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UEV, 2),
                        setStackSize(PlateList.Infinity_Plate, 2),
                        setStackSize(RingList.Infinity_Ring, 8),
                        setStackSize(RoundList.Infinity_Round, 64),

                        setStackSize(CableList.Draconium_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 64 * 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Conveyor_Module_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UEV, 1),
                        setStackSize(PlateList.Infinity_Plate, 6),
                        setStackSize(RingList.Infinity_Ring, 8),
                        setStackSize(RoundList.Infinity_Round, 64),

                        setStackSize(RodList.Infinity_Rod, 8),
                        setStackSize(GearList.Infinity_Gear, 2),
                        setStackSize(SmallGearList.Small_Infinity_Gear, 4),
                        setStackSize(CableList.Draconium_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Piston_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Infinity_Rod, 8),
                        setStackSize(GearList.Infinity_Gear, 2),
                        setStackSize(SmallGearList.Small_Infinity_Gear, 6),
                        setStackSize(GTItemList.Electric_Motor_UEV, 2),

                        setStackSize(GTItemList.Electric_Piston_UEV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                        setStackSize(CableList.Draconium_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(GTItemList.Robot_Arm_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Infinity_Frame_Box, 1),
                        setStackSize(PlateList.Infinity_Plate, 6),
                        setStackSize(GTItemList.Gravi_Star, 8),
                        setStackSize(GTItemList.Emitter_UEV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FineWireList.Fine_Tritanium_Wire, 64 * 8),
                        setStackSize(CableList.Draconium_Cable_4x, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Field_Generator_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Infinity_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UEV, 1),
                        setStackSize(RodList.Infinity_Rod, 16),
                        setStackSize(GTItemList.Gravi_Star, 16),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FoilList.Infinity_Catalyst_Foil, 64 * 4),
                        setStackSize(CableList.Draconium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Emitter_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Infinity_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UEV, 1),
                        setStackSize(PlateList.Infinity_Plate, 8),
                        setStackSize(GTItemList.Gravi_Star, 16),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FoilList.Infinity_Catalyst_Foil, 64 * 4),
                        setStackSize(CableList.Draconium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Quantium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Sensor_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UIV
            {
                // "Electric Motor (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod, 16),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod, 16),
                        setStackSize(RingList.Transcendent_Metal_Ring, 8),
                        setStackSize(RoundList.Transcendent_Metal_Round, 32),

                        setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire, 64 * 8),
                        setStackSize(CableList.Nether_Star_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Motor_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UIV, 1),
                        setStackSize(PipeList.Large_Awakened_Draconium_Fluid_Pipe, 2),
                        setStackSize(PlateList.Transcendent_Metal_Plate, 4),
                        setStackSize(ScrewList.Transcendent_Metal_Screw, 16),

                        setStackSize(RingList.Silicone_Rubber_Ring, 64),
                        setStackSize(RotorList.Transcendent_Metal_Rotor, 4),
                        setStackSize(CableList.Nether_Star_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Pump_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UIV, 2),
                        setStackSize(PlateList.Transcendent_Metal_Plate, 2),
                        setStackSize(RingList.Transcendent_Metal_Ring, 8),
                        setStackSize(RoundList.Transcendent_Metal_Round, 64),

                        setStackSize(CableList.Nether_Star_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 64 + 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Conveyor_Module_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UIV, 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate, 6),
                        setStackSize(RingList.Transcendent_Metal_Ring, 8),
                        setStackSize(RoundList.Transcendent_Metal_Round, 64),

                        setStackSize(RodList.Transcendent_Metal_Rod, 8),
                        setStackSize(GearList.Transcendent_Metal_Gear, 2),
                        setStackSize(SmallGearList.Small_Transcendent_Metal_Gear, 4),
                        setStackSize(CableList.Nether_Star_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Piston_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod, 8),
                        setStackSize(GearList.Transcendent_Metal_Gear, 2),
                        setStackSize(SmallGearList.Small_Transcendent_Metal_Gear, 6),
                        setStackSize(GTItemList.Electric_Motor_UIV, 2),

                        setStackSize(GTItemList.Electric_Piston_UIV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),

                        setStackSize(CableList.Nether_Star_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Robot_Arm_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box, 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate, 6),
                        setStackSize(GTItemList.Nuclear_Star, 1),
                        setStackSize(GTItemList.Emitter_UIV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire, 64 * 8),
                        setStackSize(CableList.Nether_Star_Cable_4x, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Field_Generator_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UIV, 1),
                        setStackSize(RodList.Transcendent_Metal_Rod, 16),
                        setStackSize(GTItemList.Nuclear_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FoilList.Arceus_Alloy_2B_Foil, 64),
                        setStackSize(FoilList.Lafium_Compound_Foil, 64),
                        setStackSize(FoilList.Cinobite_A243_Foil, 64),

                        setStackSize(FoilList.Pikyonium_64B_Foil, 64),
                        setStackSize(CableList.Nether_Star_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Emitter_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UIV, 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate, 8),
                        setStackSize(GTItemList.Nuclear_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FoilList.Arceus_Alloy_2B_Foil, 64),
                        setStackSize(FoilList.Lafium_Compound_Foil, 64),
                        setStackSize(FoilList.Cinobite_A243_Foil, 64),

                        setStackSize(FoilList.Pikyonium_64B_Foil, 64),
                        setStackSize(CableList.Nether_Star_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Sensor_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UMV
            {
                // "Electric Motor (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod, 32),
                        setStackSize(LongRodList.Long_SpaceTime_Rod, 16),
                        setStackSize(RingList.SpaceTime_Ring, 8),
                        setStackSize(RoundList.SpaceTime_Round, 32),

                        setStackSize(FineWireList.Fine_Hypogen_Wire, 64 * 8),
                        setStackSize(CableList.Quantium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Motor_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UMV, 1),
                        setStackSize(PipeList.Large_Infinity_Fluid_Pipe, 2),
                        setStackSize(PlateList.SpaceTime_Plate, 4),
                        setStackSize(ScrewList.SpaceTime_Screw, 16),

                        setStackSize(RingList.Silicone_Rubber_Ring, 64),
                        setStackSize(RotorList.SpaceTime_Rotor, 4),
                        setStackSize(CableList.Quantium_Cable_4x, 2))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Pump_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UMV, 2),
                        setStackSize(PlateList.SpaceTime_Plate, 2),
                        setStackSize(RingList.SpaceTime_Ring, 8),
                        setStackSize(RoundList.SpaceTime_Round, 64),

                        setStackSize(CableList.Quantium_Cable_4x, 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet, 64 + 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Conveyor_Module_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UMV, 1),
                        setStackSize(PlateList.SpaceTime_Plate, 6),
                        setStackSize(RingList.SpaceTime_Ring, 8),
                        setStackSize(RoundList.SpaceTime_Round, 64),

                        setStackSize(RodList.SpaceTime_Rod, 8),
                        setStackSize(GearList.SpaceTime_Gear, 2),
                        setStackSize(SmallGearList.Small_SpaceTime_Gear, 4),
                        setStackSize(CableList.Quantium_Cable_4x, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Piston_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_SpaceTime_Rod, 8),
                        setStackSize(GearList.SpaceTime_Gear, 2),
                        setStackSize(SmallGearList.Small_SpaceTime_Gear, 6),
                        setStackSize(GTItemList.Electric_Motor_UMV, 2),

                        setStackSize(GTItemList.Electric_Piston_UMV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),

                        setStackSize(CableList.Quantium_Cable_4x, 6))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(GTItemList.Robot_Arm_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box, 1),
                        setStackSize(PlateList.SpaceTime_Plate, 6),
                        setStackSize(GTItemList.Nuclear_Star, 2),
                        setStackSize(GTItemList.Emitter_UMV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FineWireList.Fine_Hypogen_Wire, 64 * 8),
                        setStackSize(CableList.Quantium_Cable_4x, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Field_Generator_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UMV, 1),
                        setStackSize(RodList.SpaceTime_Rod, 16),
                        setStackSize(GTItemList.Nuclear_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FoilList.Celestial_Tungsten_Foil, 64),
                        setStackSize(FoilList.Quantum_Foil, 64),
                        setStackSize(FoilList.Astral_Titanium_Foil, 64),

                        setStackSize(FoilList.Titansteel_Foil, 64),
                        setStackSize(CableList.Quantium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Emitter_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UMV, 1),
                        setStackSize(PlateList.SpaceTime_Plate, 8),
                        setStackSize(GTItemList.Nuclear_Star, 2),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FoilList.Celestial_Tungsten_Foil, 64),
                        setStackSize(FoilList.Quantum_Foil, 64),
                        setStackSize(FoilList.Astral_Titanium_Foil, 64),

                        setStackSize(FoilList.Titansteel_Foil, 64),
                        setStackSize(CableList.Quantium_Cable_4x, 7))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                        setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(GTItemList.Sensor_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UXV
            {
                // "Electric Motor (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(GTItemList.Energised_Tesseract, 1),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod, 16),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring, 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round, 32),

                        setStackSize(FineWireList.Fine_Superconductor_Base_UHV_Wire, 64 * 2),
                        setStackSize(FineWireList.Fine_Magnetohydrodynamically_Constrained_Star_Matter_Wire, 64 * 2),
                        setStackSize(FineWireList.Fine_Universium_Wire, 64 * 2),
                        setStackSize(FineWireList.Fine_Magmatter_Wire, 64 * 2),

                        setStackSize(WireList.SpaceTime_Wire_4x, 4),
                        setStackSize(GTItemList.Neutronium_Nanites, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Motor_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UXV, 1),
                        setStackSize(PipeList.Large_SpaceTime_Fluid_Pipe, 2),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate, 4),
                        setStackSize(ScrewList.Magnetohydrodynamically_Constrained_Star_Matter_Screw, 16),

                        setStackSize(RingList.Kevlar_Ring, 64),
                        setStackSize(RingList.Radox_Polymer_Ring, 64),
                        setStackSize(RotorList.Magnetohydrodynamically_Constrained_Star_Matter_Rotor, 4),
                        setStackSize(RotorList.Magmatter_Rotor, 4),

                        setStackSize(WireList.SpaceTime_Wire_4x, 4),
                        setStackSize(GTItemList.Neutronium_Nanites, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Pump_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UXV, 2),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate, 2),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring, 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round, 64),

                        setStackSize(WireList.SpaceTime_Wire_4x, 2),
                        setStackSize(PlateList.Kevlar_Plate, 64 + 16),
                        setStackSize(PlateList.Radox_Polymer_Sheet, 64 + 16),
                        setStackSize(GTItemList.Neutronium_Nanites, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(GTItemList.Conveyor_Module_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UXV, 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate, 6),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring, 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round, 64),

                        setStackSize(RodList.Magnetohydrodynamically_Constrained_Star_Matter_Rod, 8),
                        setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear, 2),
                        setStackSize(GearList.Magmatter_Gear, 2),
                        setStackSize(SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear, 4),

                        setStackSize(SmallGearList.Small_Magmatter_Gear, 4),
                        setStackSize(WireList.SpaceTime_Wire_4x, 8),
                        setStackSize(GTItemList.Neutronium_Nanites, 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Piston_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod, 8),
                        setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear, 2),
                        setStackSize(GearList.Magmatter_Gear, 2),
                        setStackSize(SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear, 6),
                        setStackSize(SmallGearList.Small_Magmatter_Gear, 6),
                        setStackSize(GTItemList.Electric_Motor_UXV, 2),

                        setStackSize(GTItemList.Electric_Piston_UXV, 1),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(WireList.SpaceTime_Wire_4x, 12),
                        setStackSize(GTItemList.Neutronium_Nanites, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(GTItemList.Robot_Arm_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box, 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate, 6),
                        setStackSize(GTItemList.Nuclear_Star, 64),
                        setStackSize(GTItemList.Emitter_UXV, 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4),
                        setStackSize(FineWireList.Fine_Superconductor_Base_UHV_Wire, 64 * 2),
                        setStackSize(FineWireList.Fine_Magnetohydrodynamically_Constrained_Star_Matter_Wire, 64 * 2),
                        setStackSize(FineWireList.Fine_Universium_Wire, 64 * 2),

                        setStackSize(FineWireList.Fine_Magmatter_Wire, 64 * 2),
                        setStackSize(WireList.SpaceTime_Wire_4x, 16),
                        setStackSize(GTItemList.Neutronium_Nanites, 12))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(GTItemList.Field_Generator_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UXV, 1),
                        setStackSize(RodList.Magnetohydrodynamically_Constrained_Star_Matter_Rod, 16),
                        setStackSize(GTItemList.Nuclear_Star, 16),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FoilList.Magnetohydrodynamically_Constrained_Star_Matter_Foil, 64),
                        setStackSize(FoilList.Magmatter_Foil, 64),
                        setStackSize(FoilList.SpaceTime_Foil, 64),

                        setStackSize(FoilList.Universium_Foil, 64),
                        setStackSize(WireList.SpaceTime_Wire_4x, 14),
                        setStackSize(GTItemList.Neutronium_Nanites, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(GTItemList.Emitter_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box, 1),
                        setStackSize(GTItemList.Electric_Motor_UXV, 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate, 8),
                        setStackSize(GTItemList.Nuclear_Star, 16),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FoilList.Magnetohydrodynamically_Constrained_Star_Matter_Foil, 64),
                        setStackSize(FoilList.Magmatter_Foil, 64),
                        setStackSize(FoilList.SpaceTime_Foil, 64),

                        setStackSize(FoilList.Universium_Foil, 64),
                        setStackSize(WireList.SpaceTime_Wire_4x, 14),
                        setStackSize(GTItemList.Neutronium_Nanites, 8))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 18),
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(GTItemList.Sensor_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // Heavy Duty Alloy Ingot
        {
            // "Heavy Duty Alloy Ingot T4"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_3, 1),
                    setStackSize(MiscPlateList.Compressed_Ice_Plate, 6),
                    setStackSize(BoltList.Ruridit_Bolt, 4))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 36))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T4)
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T5"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_4, 1),
                    setStackSize(MiscPlateList.Compressed_Quantium_Plate, 8),
                    setStackSize(BoltList.Europium_Bolt, 8))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 72))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T5)
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T6"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_5, 1),
                    setStackSize(MiscPlateList.Compressed_Lead_Oriharukon_Plate, 10),
                    setStackSize(BoltList.Tritanium_Bolt, 8))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T6)
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T7"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_6, 1),
                    setStackSize(MiscPlateList.Compressed_Mysterious_Crystal_Plate, 12),
                    setStackSize(BoltList.Neutronium_Bolt, 10))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 2))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T7)
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T8"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7, 1),
                    setStackSize(MiscPlateList.Compressed_Black_Plutonium_Plate, 14),
                    setStackSize(BoltList.Black_Plutonium_Bolt, 12))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140, 144 * 4))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T8)
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lightweight Alloy Ingot"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_8, 1),
                    setStackSize(PlateList.Kevlar_Plate, 14),
                    setStackSize(ScrewList.Neutronium_Screw, 12))
                .fluidInputs(setStackSize(MoltenList.Molten_Radox_Polymer, 144 * 4))
                .itemOutputs(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T8)
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Mining Drone
        {
            // "Mining Drone MK-IV (EV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Trinium_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_EV, 8),
                    setStackSize(GTItemList.Field_Generator_EV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_3, 32),
                    setStackSize(GalacticraftList.Heavy_Rocket_Engine, 4),
                    setStackSize(GTItemList.Sensor_EV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 5),
                    setStackSize(MoltenList.Molten_Iridium, 144 * 5),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 16))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKIV_EV)
                .eut(RECIPE_EV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-V (IV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Naquadah_Alloy_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_IV, 8),
                    setStackSize(GTItemList.Field_Generator_IV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_4, 32),
                    setStackSize(GalacticraftList.Heavy_Rocket_Engine, 4),
                    setStackSize(GTItemList.Sensor_IV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 10),
                    setStackSize(MoltenList.Molten_Iridium, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 32))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKV_IV)
                .eut(RECIPE_IV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VI (LuV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Naquadria_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_LuV, 8),
                    setStackSize(GTItemList.Field_Generator_LuV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_5, 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3, 4),
                    setStackSize(GTItemList.Sensor_LuV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Osmiridium, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 64))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVI_LuV)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VII (ZPM)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Neutronium_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_ZPM, 8),
                    setStackSize(GTItemList.Field_Generator_ZPM, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_6, 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3, 4),
                    setStackSize(GTItemList.Sensor_ZPM, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Osmiridium, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 128))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVII_ZPM)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VIII (UV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UV, 8),
                    setStackSize(GTItemList.Field_Generator_UV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7, 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 4),
                    setStackSize(GTItemList.Sensor_UV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140, 144 * 20),
                    setStackSize(MoltenList.Molten_Naquadria, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 256))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVIII_UV)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-IX (UHV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Infinity_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UHV, 8),
                    setStackSize(GTItemList.Field_Generator_UHV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_8, 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 4),
                    setStackSize(GTItemList.Sensor_UHV, 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                    setStackSize(MoltenList.Molten_Neutronium, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKIX_UHV)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-X (UEV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UEV, 8),
                    setStackSize(GTItemList.Field_Generator_UEV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate, 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 8),
                    setStackSize(GTItemList.Sensor_UEV, 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 20),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 10),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKX_UEV)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XI (UIV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UIV, 8),
                    setStackSize(GTItemList.Field_Generator_UIV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate, 64),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 16),
                    setStackSize(GTItemList.Sensor_UIV, 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder, 144 * 40),
                    setStackSize(MoltenList.Molten_Quantium, 144 * 20),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXI_UIV)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XII (UMV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.SpaceTime_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UMV, 8),
                    setStackSize(GTItemList.Field_Generator_UMV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate, 128),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 32),
                    setStackSize(GTItemList.Sensor_UMV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Hypogen, 144 * 4),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXII_UMV)
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XIII (UXV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DrillTipList.Eternity_Drill_Tip, 8),
                    setStackSize(GTItemList.Robot_Arm_UXV, 8),
                    setStackSize(GTItemList.Field_Generator_UXV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate, 256),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4, 64),
                    setStackSize(GTItemList.Sensor_UXV, 8))
                .fluidInputs(
                    setStackSize(FluidList.Spatially_Enlarged_Fluid, 144 * 4),
                    setStackSize(MoltenList.Molten_Universium, 144 * 4),
                    setStackSize(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXIII_UXV)
                .eut(RECIPE_UXV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Schematic
        {
            // "Draconic Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DraconicEvolutionList.Draconic_Core, 1),
                    setStackSize(DensePlateList.Dense_Draconium_Plate, 1),
                    setStackSize(PlateList.Ichorium_Plate, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Sunnarium, 144 * 100),
                    setStackSize(MoltenList.Molten_Void_Metal, 144 * 200))
                .itemOutputs(KubaTechList.Draconic_Core_Schematic)
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Wyvern Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DraconicEvolutionList.Draconic_Core, 4),
                    setStackSize(DensePlateList.Dense_Draconium_Plate, 1),
                    setStackSize(PlateList.Neutronium_Plate, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium, 144 * 100),
                    setStackSize(MoltenList.Molten_Void_Metal, 144 * 400))
                .itemOutputs(KubaTechList.Wyvern_Core_Schematic)
                .eut(RECIPE_UEV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Awakened Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DraconicEvolutionList.Wyvern_Core, 4),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 1),
                    setStackSize(PlateList.Infinity_Plate, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Infinity, 144 * 100),
                    setStackSize(MoltenList.Molten_Void_Metal, 144 * 800))
                .itemOutputs(KubaTechList.Awakened_Core_Schematic)
                .eut(RECIPE_UIV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Chaotic Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(DraconicEvolutionList.Awakened_Core, 8),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate, 4),
                    setStackSize(PlateList.SpaceTime_Plate, 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_SpaceTime, 144 * 100),
                    setStackSize(MoltenList.Molten_Void_Metal, 144 * 1600))
                .itemOutputs(KubaTechList.Awakened_Core_Schematic)
                .eut(RECIPE_UMV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Shuttle Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(OreList.Samarium_Ore_Stone, 64),
                    setStackSize(OreList.Tartarite_Ore_Stone, 64),
                    setStackSize(OreList.Cadmium_Ore_Stone, 64),
                    setStackSize(OreList.Caesium_Ore_Stone, 64),

                    setStackSize(OreList.Lanthanum_Ore_Stone, 64),
                    setStackSize(OreList.Cerium_Ore_Stone, 64),
                    setStackSize(IngotList.Bedrockium_Ingot, 64),
                    setStackSize(IngotList.Awakened_Draconium_Ingot, 64),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot, 64),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot, 64),
                    setStackSize(IngotList.Infinity_Ingot, 64),
                    setStackSize(GTItemList.Electric_Pump_UHV, 8),

                    setStackSize(GTItemList.Conveyor_Module_UHV, 8),
                    setStackSize(GTItemList.Robot_Arm_UHV, 8),
                    setStackSize(GTItemList.Field_Generator_UHV, 8),
                    setStackSize(GTItemList.Sensor_UHV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Abyssal_Alloy, 144 * 64),
                    setStackSize(MoltenList.Molten_Octiron, 144 * 64),
                    setStackSize(MoltenList.Molten_Astral_Titanium, 144 * 64))
                .itemOutputs(AmunRaList.Shuttle_Schematic)
                .eut(RECIPE_UEV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Stargate Part
        {
            // 2.1.0.0
            {
                // "Nano Circuit of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(FrameBoxList.Tritanium_Frame_Box, 8),
                        setStackSize(CircuitList.Bioware_Mainframe, 2),
                        setStackSize(CircuitList.Advanced_SMD_Capacitor, 32),
                        setStackSize(CircuitList.Advanced_SMD_Resistor, 32),

                        setStackSize(CircuitList.Advanced_SMD_Transistor, 32),
                        setStackSize(CircuitList.Advanced_SMD_Diode, 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip, 64),
                        setStackSize(CircuitList.Nano_Power_IC_Chip, 64),

                        setStackSize(WireList.Draconium_Wire_1x, 64),
                        setStackSize(WireList.Superconductor_UHV_Wire_1x, 128),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet, 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        setStackSize(MoltenList.Molten_Naquadria, 144 * 32),
                        setStackSize(FluidList.IC2_Coolant, 1000 * 20))
                    .itemOutputs(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin)
                    .eut(RECIPE_UEV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(SingularityList.Eternal_Singularity, 1),
                        setStackSize(GTItemList.Sensor_UV, 16),
                        setStackSize(AvaritiaList.Infinity_Block, 16),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block, 16),

                        setStackSize(BlockList.Block_of_Naquadah_Alloy, 64 * 3),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin, 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64 * 4),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64 * 4),
                        setStackSize(MoltenList.Molten_Superconductor_Base_ZPM, 144 * 64 * 4),
                        setStackSize(PlasmaList.Silver_Plasma, 144 * 64 * 4))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(GTItemList.Electric_Piston_UV, 16),
                        setStackSize(GTItemList.Electric_Motor_UV, 64),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block, 16),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy, 64),

                        setStackSize(BlockList.Block_of_Nether_Star, 16),
                        setStackSize(DensePlateList.Dense_Ardite_Plate, 24),
                        setStackSize(GemList.Exquisite_Ruby, 64),
                        setStackSize(GemList.Exquisite_Jasper, 64),

                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin, 32))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64),
                        setStackSize(MoltenList.Molten_Superconductor_Base_ZPM, 144 * 64),
                        setStackSize(PlasmaList.Silver_Plasma, 144 * 64))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Infinity_Rod, 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod, 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod, 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod, 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64 * 8),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64 * 8),
                        setStackSize(FluidList.Wet_Concrete, 144 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.1.2.3qf
            {
                // "Pico Circuit of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board, 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer, 4),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor, 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor, 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 48),
                        setStackSize(CircuitList.Optical_SMD_Diode, 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip, 64),

                        setStackSize(FoilList.Niobium_Titanium_Foil, 16),
                        setStackSize(BoltList.Osmium_Bolt, 32),
                        setStackSize(BoltList.Neutronium_Bolt, 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 8),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest)
                    .eut(RECIPE_UEV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 64),
                        setStackSize(CircuitList.Optical_SMD_Diode, 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor, 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip, 64),
                        setStackSize(FoilList.Niobium_Titanium_Foil, 64),

                        setStackSize(BoltList.Indium_Bolt, 64),
                        setStackSize(WireList.Bedrockium_Wire_1x, 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 24),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(SingularityList.Eternal_Singularity, 1),
                        setStackSize(GTItemList.Sensor_UEV, 16),
                        setStackSize(AvaritiaList.Infinity_Block, 16),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block, 16),

                        setStackSize(BlockList.Block_of_Naquadah_Alloy, 64 * 3),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest, 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64 * 4),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64 * 4),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64 * 4),
                        setStackSize(PlasmaList.Silver_Plasma, 144 * 64 * 4))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Piston_UEV, 16),
                        setStackSize(GTItemList.Electric_Motor_UEV, 64),
                        setStackSize(AvaritiaList.Infinity_Block, 16),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy, 64),

                        setStackSize(BlockList.Block_of_Nether_Star, 16),
                        setStackSize(DensePlateList.Dense_Ardite_Plate, 24),
                        setStackSize(GemList.Exquisite_Ruby, 64),
                        setStackSize(GemList.Exquisite_Jasper, 64),

                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest, 32))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64),
                        setStackSize(PlasmaList.Silver_Plasma, 144 * 64))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(LongRodList.Long_Infinity_Rod, 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod, 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod, 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod, 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 144 * 64 * 8),
                        setStackSize(MoltenList.Molten_Tritanium, 144 * 64 * 8),
                        setStackSize(FluidList.Wet_Concrete, 144 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.2.3
            {
                // "Pico Circuit of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board, 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer, 4),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor, 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor, 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 48),
                        setStackSize(CircuitList.Optical_SMD_Diode, 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip, 64),

                        setStackSize(FoilList.Niobium_Titanium_Foil, 16),
                        setStackSize(BoltList.Osmium_Bolt, 32),
                        setStackSize(BoltList.Neutronium_Bolt, 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 8),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 64),
                        setStackSize(CircuitList.Optical_SMD_Diode, 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor, 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip, 64),
                        setStackSize(FoilList.Niobium_Titanium_Foil, 64),

                        setStackSize(BoltList.Indium_Bolt, 64),
                        setStackSize(WireList.SpaceTime_Wire_1x, 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 24),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge, 64),
                        setStackSize(AvaritiaList.Infinity_Block, 64 * 3),
                        setStackSize(BlockList.Block_of_SpaceTime, 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity, 16),

                        setStackSize(DensePlateList.Dense_SpaceTime_Plate, 16),
                        setStackSize(DensePlateList.Dense_Infinity_Plate, 16),
                        setStackSize(GTItemList.Sensor_UMV, 16),
                        setStackSize(GTItemList.Emitter_UMV, 16),

                        setStackSize(SingularityList.Eternal_Singularity, 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(AvaritiaList.Infinity_Block, 64),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy, 64),
                        setStackSize(MultiMachineCasingList.Dimensional_Bridge, 64 * 2),
                        setStackSize(FrameBoxList.SpaceTime_Frame_Box, 16),

                        setStackSize(FrameBoxList.Infinity_Frame_Box, 16),
                        setStackSize(GemList.Exquisite_Ruby, 16),
                        setStackSize(GemList.Exquisite_Jasper, 16),
                        setStackSize(GemList.Exquisite_Opal, 16),

                        setStackSize(GemList.Exquisite_Sapphire, 16),
                        setStackSize(DensePlateList.Dense_Osmiridium_Plate, 16),
                        setStackSize(GTItemList.Electric_Motor_UMV, 64),
                        setStackSize(GTItemList.Electric_Piston_UMV, 64),

                        setStackSize(GTItemList.Field_Generator_UMV, 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity, 32))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(LongRodList.Long_Infinity_Rod, 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod, 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod, 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod, 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod, 64),
                        setStackSize(LongRodList.Long_Californium_Rod, 64),
                        setStackSize(LongRodList.Long_Quantum_Rod, 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod, 64),

                        setStackSize(LongRodList.Long_Celestial_Tungsten_Rod, 64),
                        setStackSize(LongRodList.Long_Tairitsu_Rod, 64),
                        setStackSize(LongRodList.Long_Astral_Titanium_Rod, 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod, 64),

                        setStackSize(LongRodList.Long_Sunnarium_Rod, 64),
                        setStackSize(LongRodList.Long_Abyssal_Alloy_Rod, 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 17),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.3.0
            {
                // "Stargate Plate of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge, 64),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator, 64),
                        setStackSize(BlockList.Block_of_Shirabon, 64 * 2),
                        setStackSize(BlockList.Block_of_SpaceTime, 64),

                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire, 16),
                        setStackSize(DensePlateList.Dense_SpaceTime_Plate, 8),
                        setStackSize(DensePlateList.Dense_Universium_Plate, 8),
                        setStackSize(DensePlateList.Dense_Infinity_Plate, 8),

                        setStackSize(DensePlateList.Dense_Shirabon_Plate, 8),
                        setStackSize(GTItemList.Sensor_UXV, 16),
                        setStackSize(GTItemList.Emitter_UXV, 16),
                        setStackSize(SingularityList.Eternal_Singularity, 16),

                        setStackSize(GTItemList.Universium_Nanites, 16),
                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites, 16),
                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites, 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(BlockList.Block_of_Transcendent_Metal, 64),
                        setStackSize(BlockList.Block_of_Shirabon, 64),
                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing, 64 * 2),
                        setStackSize(FrameBoxList.SpaceTime_Frame_Box, 16),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box, 16),
                        setStackSize(GemList.Exquisite_Ruby, 16),
                        setStackSize(GemList.Exquisite_Jasper, 16),
                        setStackSize(GemList.Exquisite_Opal, 16),

                        setStackSize(GemList.Exquisite_Sapphire, 16),
                        setStackSize(DensePlateList.Dense_Magnetohydrodynamically_Constrained_Star_Matter_Plate, 8),
                        setStackSize(DensePlateList.Dense_Shirabon_Plate, 8),
                        setStackSize(GTItemList.Electric_Motor_UXV, 64),

                        setStackSize(GTItemList.Electric_Piston_UXV, 64),
                        setStackSize(GTItemList.Field_Generator_UXV, 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire, 32))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 64 * 4),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(LongRodList.Long_Infinity_Rod, 64),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod, 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod, 64),
                        setStackSize(LongRodList.Long_Osmiridium_Rod, 64),

                        setStackSize(LongRodList.Long_Shirabon_Rod, 64),
                        setStackSize(LongRodList.Long_Californium_Rod, 64),
                        setStackSize(LongRodList.Long_Quantum_Rod, 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod, 64),

                        setStackSize(LongRodList.Long_Celestial_Tungsten_Rod, 64),
                        setStackSize(LongRodList.Long_Tairitsu_Rod, 64),
                        setStackSize(LongRodList.Long_Astral_Titanium_Rod, 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod, 64),

                        setStackSize(LongRodList.Long_Universium_Rod, 64),
                        setStackSize(LongRodList.Long_Abyssal_Alloy_Rod, 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod, 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime, 144 * 64 * 17),
                        setStackSize(MoltenList.Molten_Universium, 144 * 64 * 16),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.7.0
            {
                // "Pico Circuit of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(CircuitList.Optical_Circuit_Board, 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor, 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor, 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 48),
                        setStackSize(CircuitList.Optical_SMD_Diode, 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip, 64),

                        setStackSize(FoilList.Thin_Radox_Polymer_Sheet, 16),
                        setStackSize(BoltList.Transcendent_Metal_Bolt, 32),
                        setStackSize(BoltList.Neutronium_Bolt, 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 64))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 8),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box, 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor, 64),
                        setStackSize(CircuitList.Optical_SMD_Diode, 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor, 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor, 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip, 64),
                        setStackSize(FoilList.Shirabon_Foil, 64),

                        setStackSize(BoltList.Indium_Bolt, 64),
                        setStackSize(WireList.SpaceTime_Wire_1x, 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire, 16))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        setStackSize(FluidList.UU_Matter, 1000 * 24),
                        setStackSize(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire)
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing, 64),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator, 64),
                        setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit, 32),
                        setStackSize(SuperdensePlateList.Superdense_Magmatter_Plate, 17),

                        setStackSize(SuperdensePlateList.Superdense_Universium_Plate, 8),
                        setStackSize(SuperdensePlateList.Superdense_Eternity_Plate, 8),
                        setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate, 8),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire, 16),

                        setStackSize(GTItemList.Sensor_UXV, 16),
                        setStackSize(GTItemList.Emitter_UXV, 16),
                        setStackSize(SingularityList.Chronic_Singularity, 64),
                        setStackSize(GTItemList.Universium_Nanites, 16),

                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites, 16),
                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites, 16),
                        setStackSize(GTItemList.Six_Phased_Copper_Nanites, 16))
                    .fluidInputs(
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 64),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing, 64),
                        setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing, 64),
                        setStackSize(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block, 64),
                        setStackSize(
                            SuperdensePlateList.Superdense_Magnetohydrodynamically_Constrained_Star_Matter_Plate,
                            8),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box, 16),
                        setStackSize(GemList.Exquisite_Ruby, 64),
                        setStackSize(GemList.Exquisite_Jasper, 64),
                        setStackSize(GemList.Exquisite_Opal, 64),

                        setStackSize(GemList.Exquisite_Sapphire, 64),
                        setStackSize(DensePlateList.Dense_Osmiridium_Plate, 16),
                        setStackSize(GTItemList.Electric_Motor_UXV, 64),
                        setStackSize(GTItemList.Electric_Piston_UXV, 64),

                        setStackSize(GTItemList.Field_Generator_UXV, 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire, 32))
                    .fluidInputs(
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        setStackSize(MoltenList.Molten_Magmatter, 144 * 64 * 146),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Infinity_Rod, 64),
                        setStackSize(LongRodList.Long_Mellion_Rod, 64),
                        setStackSize(LongRodList.Long_Eternity_Rod, 64),
                        setStackSize(LongRodList.Long_Creon_Rod, 64),

                        setStackSize(LongRodList.Long_SpaceTime_Rod, 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod, 64),
                        setStackSize(LongRodList.Long_Shirabon_Rod, 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod, 64),

                        setStackSize(LongRodList.Long_Six_Phased_Copper_Rod, 64),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod, 64),
                        setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod, 64),
                        setStackSize(LongRodList.Long_White_Dwarf_Matter_Rod, 64),

                        setStackSize(LongRodList.Long_Magmatter_Rod, 64),
                        setStackSize(LongRodList.Long_Black_Dwarf_Matter_Rod, 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod, 64))
                    .fluidInputs(
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        setStackSize(MoltenList.Molten_Universium, 144 * 64 * 17),
                        setStackSize(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }
    }
}
