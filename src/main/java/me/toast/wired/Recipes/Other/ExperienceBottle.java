package me.toast.wired.Recipes.Other;

import me.toast.wired.Items.Other.ExpBottleUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class ExperienceBottle {

    public static void ExperienceBottleRecipe() {

        ShapedRecipe feeder = new ShapedRecipe(new NamespacedKey(getPlugin(), "expBottle"), ExpBottleUtils.ExpBottle());
        feeder.shape("WWW", "WGW", "WWW");
        feeder.setIngredient('W', Material.GOLD_INGOT);
        feeder.setIngredient('G', Material.GLASS_BOTTLE);
        Bukkit.addRecipe(feeder);

    }
}
