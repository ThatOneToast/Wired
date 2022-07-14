package me.austin.wired.Recipes.Tools.Axe;

import me.austin.wired.Utilities.Tools.Axe.StrongAxeUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class StrongAxeRecipe {

    public static void StrongAxeRecipe() {
        ShapedRecipe StrongAxe = new ShapedRecipe(new NamespacedKey(getPlugin(), "StrongAxe"), new ItemStack(StrongAxeUtils.createStrongAxe()));
        StrongAxe.shape("III", "IL ", " L ");
        StrongAxe.setIngredient('L', Material.OAK_LOG);
        StrongAxe.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(StrongAxe);
    }
}
