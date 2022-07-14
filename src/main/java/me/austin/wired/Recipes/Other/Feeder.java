package me.austin.wired.Recipes.Other;

import me.austin.wired.Utilities.Other.FeederUtils;
import me.austin.wired.Utilities.Other.FlyingFeatherUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class Feeder {

    public static void FeederRecipe() {

        ShapedRecipe feeder = new ShapedRecipe(new NamespacedKey(getPlugin(), "Feeder"), FeederUtils.createFeeder());
        feeder.shape("WWW", "WGW", "WWW");
        feeder.setIngredient('W', Material.WHEAT);
        feeder.setIngredient('G', Material.GOLDEN_APPLE);
        Bukkit.addRecipe(feeder);

    }
}
