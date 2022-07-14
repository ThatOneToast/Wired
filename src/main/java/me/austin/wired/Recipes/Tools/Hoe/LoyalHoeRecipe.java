package me.austin.wired.Recipes.Tools.Hoe;

import me.austin.wired.Utilities.Tools.Hoe.LoyaltyHoeUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class LoyalHoeRecipe {

    public static void LoyalHoeRecipe() {
        ShapedRecipe LoyalHoe = new ShapedRecipe(new NamespacedKey(getPlugin(), "LoyalHoe"), new ItemStack(LoyaltyHoeUtils.createLoyalHoe()));
        LoyalHoe.shape("II ", " L ", " L ");
        LoyalHoe.setIngredient('L', Material.OAK_LOG);
        LoyalHoe.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(LoyalHoe);
    }
}
