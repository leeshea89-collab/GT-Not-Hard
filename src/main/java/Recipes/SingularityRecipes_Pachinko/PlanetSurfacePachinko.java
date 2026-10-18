package Recipes.SingularityRecipes_Pachinko;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Surface block pools selected by the GTNH dimension display item.
 *
 * <p>This is deliberately separate from the original machine-item Pachinko maps.
 * Missing optional mod items are skipped, so an absent planet block cannot crash
 * recipe registration or class loading. These outputs are obtainable blocks,
 * NOT a claim that all planet selectors have supported surface output.
 */
public final class PlanetSurfacePachinko {

    private static final Map<String, ItemStack[]> POOLS = new HashMap<>();

    private PlanetSurfacePachinko() {}

    public static ItemStack[] get(String dimensionCode) {
        if (dimensionCode == null) return null;
        synchronized (POOLS) {
            if (!POOLS.containsKey(dimensionCode)) {
                POOLS.put(dimensionCode, createPool(dimensionCode));
            }
            return POOLS.get(dimensionCode);
        }
    }

    private static ItemStack[] createPool(String dimensionCode) {
        List<ItemStack> drops = new ArrayList<>();
        switch (dimensionCode) {
            // GTNH T0 dimension display codes from SingularityOreRecipes.
            case "Ow":
                add(drops, "minecraft", "stone", 0);
                add(drops, "minecraft", "dirt", 0);
                add(drops, "minecraft", "gravel", 0);
                add(drops, "minecraft", "sand", 0);
                add(drops, "minecraft", "clay", 0);
                break;
            case "Ne":
                add(drops, "minecraft", "netherrack", 0);
                add(drops, "minecraft", "soul_sand", 0);
                add(drops, "minecraft", "gravel", 0);
                break;
            case "ED":
            case "EA":
                add(drops, "minecraft", "end_stone", 0);
                break;
            case "TF":
                add(drops, "minecraft", "stone", 0);
                add(drops, "minecraft", "dirt", 0);
                add(drops, "minecraft", "gravel", 0);
                break;
            // Galacticraft Core: verified from this repo's GalacticraftList.
            case "Mo":
                add(drops, "GalacticraftCore", "tile.moonBlock", 3); // moon dirt
                add(drops, "GalacticraftCore", "tile.moonBlock", 4); // moon rock
                add(drops, "GalacticraftCore", "tile.moonBlock", 5); // moon turf
                break;
            // Galacticraft Mars block registry name verified from GalacticraftList.
            // T2 terrain subtypes share the tile.mars item; omit special machinery.
            case "Ma":
                add(drops, "GalacticraftMars", "tile.mars", 0);
                add(drops, "GalacticraftMars", "tile.mars", 1);
                add(drops, "GalacticraftMars", "tile.mars", 2);
                add(drops, "GalacticraftMars", "tile.mars", 3);
                add(drops, "GalacticraftMars", "tile.mars", 4); // cobblestone
                break;
            // GalaxySpace concrete blocks already referenced by GalaxySpaceList.
            case "Ce":
                add(drops, "GalaxySpace", "ceresblocks", 0);
                add(drops, "GalaxySpace", "ceresblocks", 1);
                break;
            case "Io":
                add(drops, "GalaxySpace", "iodualstone", 0);
                break;
            case "Pl":
                add(drops, "GalaxySpace", "plutoblocks", 0);
                add(drops, "GalaxySpace", "plutoblocks", 1);
                break;
            // More planet surface registry names should be verified from the
            // installed GalaxySpace and GalaxySpace addons before inclusion.
            default:
                break;
        }
        return drops.isEmpty() ? null : drops.toArray(new ItemStack[0]);
    }

    private static void add(List<ItemStack> drops, String mod, String registryName, int meta) {
        Item item = GameRegistry.findItem(mod, registryName);
        if (item != null) drops.add(new ItemStack(item, 1, meta));
    }
}
