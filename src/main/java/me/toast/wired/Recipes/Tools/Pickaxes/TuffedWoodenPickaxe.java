package me.toast.wired.Recipes.Tools.Pickaxes;

import me.toast.wired.Utilities.Tools.Pickaxes.TuffedWoodenPickaxeUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class TuffedWoodenPickaxe {

    public static void TuffedWoodenPickaxeRecipe() {
        ShapedRecipe TuffedWoodenPickaxe = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "TuffedWoodenPickaxe"), new ItemStack(TuffedWoodenPickaxeUtils.createTuffedWoodenPickaxe()));
        TuffedWoodenPickaxe.shape("LLL", " Q ", " Q ");
        TuffedWoodenPickaxe.setIngredient('L', Material.OAK_LOG);
        TuffedWoodenPickaxe.setIngredient('Q', Material.COBBLESTONE);
        Bukkit.addRecipe(TuffedWoodenPickaxe);
    }
}
