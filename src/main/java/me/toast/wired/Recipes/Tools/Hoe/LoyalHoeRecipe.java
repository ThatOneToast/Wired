package me.toast.wired.Recipes.Tools.Hoe;

import me.toast.wired.Utilities.Tools.Hoe.LoyaltyHoeUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class LoyalHoeRecipe {

    public static void LoyalHoeRecipe() {
        ShapedRecipe LoyalHoe = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "LoyalHoe"), new ItemStack(LoyaltyHoeUtils.createLoyalHoe()));
        LoyalHoe.shape("II ", " L ", " L ");
        LoyalHoe.setIngredient('L', Material.OAK_LOG);
        LoyalHoe.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(LoyalHoe);
    }
}
