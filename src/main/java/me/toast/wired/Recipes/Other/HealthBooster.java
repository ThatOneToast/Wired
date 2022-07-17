package me.toast.wired.Recipes.Other;

import me.toast.wired.Utilities.Other.HealthBoosterUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;


public class HealthBooster {


    public static void HealthBoosterRecipe() {

        ShapedRecipe HealthBooster = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HealthBooster"), HealthBoosterUtils.createHealthBooster());
        HealthBooster.shape("EEE", "EGE", "EEE");
        HealthBooster.setIngredient('E', Material.EMERALD_BLOCK);
        HealthBooster.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(HealthBooster);

    }
}
