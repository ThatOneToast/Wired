package me.austin.wired.Recipes.Other;

import me.austin.wired.Utilities.Other.FlyingFeatherUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FlyingFeather {

    public static void FlytingFeatherRecipe() {

        ShapedRecipe FlyingFeather = new ShapedRecipe(new NamespacedKey(getPlugin(), "FlyingFeather"), FlyingFeatherUtils.createFlyingFeather());
        FlyingFeather.shape("SES", "SES", "SES");
        FlyingFeather.setIngredient('S', Material.FEATHER);
        FlyingFeather.setIngredient('E', Material.DIAMOND);
        Bukkit.addRecipe(FlyingFeather);

    }
}
