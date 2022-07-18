package me.toast.wired.Recipes.Other;

import me.toast.wired.Utilities.Other.FlyingFeatherUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;


public class FlyingFeather {

    public static void FlytingFeatherRecipe() {

        ShapedRecipe FlyingFeather = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FlyingFeather"), FlyingFeatherUtils.createFlyingFeather());
        FlyingFeather.shape("SES", "SES", "SES");
        FlyingFeather.setIngredient('S', Material.FEATHER);
        FlyingFeather.setIngredient('E', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(FlyingFeather);

    }
}
