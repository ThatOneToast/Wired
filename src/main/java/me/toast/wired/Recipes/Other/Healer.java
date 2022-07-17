package me.toast.wired.Recipes.Other;

import me.toast.wired.Utilities.Other.FeederUtils;
import me.toast.wired.Utilities.Other.HealerUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class Healer {
    public static void HealerRecipe() {

        ShapedRecipe healer = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "Healer"), HealerUtils.createHealer());
        healer.shape("WWW", "WGW", "WWW");
        healer.setIngredient('W', new RecipeChoice.ExactChoice(FeederUtils.createFeeder()));
        healer.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(healer);

    }
}
