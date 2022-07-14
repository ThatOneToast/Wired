package me.austin.wired.Recipes.Other;

import me.austin.wired.Utilities.Other.FeederUtils;
import me.austin.wired.Utilities.Other.HealerUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class Healer {
    public static void HealerRecipe() {

        ShapedRecipe healer = new ShapedRecipe(new NamespacedKey(getPlugin(), "Healer"), HealerUtils.createHealer());
        healer.shape("WWW", "WGW", "WWW");
        healer.setIngredient('W', new RecipeChoice.ExactChoice(FeederUtils.createFeeder()));
        healer.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(healer);

    }
}
