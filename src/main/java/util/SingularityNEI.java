package util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;

/**
 * Helpers for the Singularity's NEI display: one tab per void mode, with every planet as its own page.
 */
public final class SingularityNEI {

    private static int order = 0;

    private SingularityNEI() {}

    /**
     * GT sorts NEI recipes by EU, then duration, then special value. All Singularity display recipes share the same
     * EU and duration, so an increasing special value keeps pages in registration order: tier, then planet, then page.
     */
    public static int nextOrder() {
        return order++;
    }

    /** Tab icon for a void mode. Called lazily by NEI at load complete, so every item exists by then. */
    public static ItemStack icon(String mode) {
        switch (mode) {
            case "Ore":
                return new ItemStack(Blocks.iron_ore);
            case "Ingot":
                return new ItemStack(Items.iron_ingot);
            case "Gem":
                return new ItemStack(Items.diamond);
            case "Dust": {
                ItemStack dust = GTOreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 1L);
                return dust != null ? dust : new ItemStack(Items.redstone);
            }
            case "Fluid":
                return new ItemStack(Items.water_bucket);
            default:
                return new ItemStack(Items.nether_star);
        }
    }
}
