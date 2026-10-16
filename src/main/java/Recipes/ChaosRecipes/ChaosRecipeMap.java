package Recipes.ChaosRecipes;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.recipe.maps.AssemblyLineFrontend;

public class ChaosRecipeMap {

    public static final RecipeMap<RecipeMapBackend> AssemblyLineNormalRecipe = RecipeMapBuilder
        .of("Chaos of AssemblyLine Normal", RecipeMapBackend::new)
        .maxIO(16, 1, 4, 0)
        .minInputs(1, 0)
        .useSpecialSlot()
        .neiTransferRect(88, 8, 18, 72)
        .neiTransferRect(124, 8, 18, 72)
        .neiTransferRect(142, 26, 18, 18)
        .frontend(AssemblyLineFrontend::new)
        .build();
}
