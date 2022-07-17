package me.toast.wired.Recipes.Tools.Pickaxes;

import me.toast.wired.Utilities.Tools.Pickaxes.WorthyPickaxeUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class WorthyPickaxeRecipe {

    public static void WorthyPickaxeRecipe() {
        ShapedRecipe WorthyPick = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "WorthyIronPick"), new ItemStack(WorthyPickaxeUtils.createWorthyPickaxe()));
        WorthyPick.shape("LLL", " Q ", " Q ");
        WorthyPick.setIngredient('L', Material.IRON_BLOCK);
        WorthyPick.setIngredient('Q', Material.OAK_LOG);
        Bukkit.addRecipe(WorthyPick);
    }
}
