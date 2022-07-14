package me.austin.wired.Recipes.Other;

import me.austin.wired.Utilities.Other.HealthBoosterUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HealthBooster {


    public static void HealthBoosterRecipe() {

        ShapedRecipe HealthBooster = new ShapedRecipe(new NamespacedKey(getPlugin(), "HealthBooster"), HealthBoosterUtils.createHealthBooster());
        HealthBooster.shape("EEE", "EGE", "EEE");
        HealthBooster.setIngredient('E', Material.EMERALD_BLOCK);
        HealthBooster.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(HealthBooster);

    }
}
