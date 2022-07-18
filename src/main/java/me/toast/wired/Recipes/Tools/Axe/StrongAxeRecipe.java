package me.toast.wired.Recipes.Tools.Axe;

import me.toast.wired.Items.Tools.Axe.StrongAxeUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class StrongAxeRecipe {

    public static void StrongAxeRecipe() {
        ShapedRecipe StrongAxe = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "StrongAxe"), new ItemStack(StrongAxeUtils.createStrongAxe()));
        StrongAxe.shape("III", "IL ", " L ");
        StrongAxe.setIngredient('L', Material.OAK_LOG);
        StrongAxe.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(StrongAxe);
    }
}
