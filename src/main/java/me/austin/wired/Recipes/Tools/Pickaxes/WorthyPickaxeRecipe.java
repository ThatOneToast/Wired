package me.austin.wired.Recipes.Tools.Pickaxes;

import me.austin.wired.Utilities.Tools.Pickaxes.TuffedWoodenPickaxeUtils;
import me.austin.wired.Utilities.Tools.Pickaxes.WorthyPickaxeUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class WorthyPickaxeRecipe {

    public static void WorthyPickaxeRecipe() {
        ShapedRecipe WorthyPick = new ShapedRecipe(new NamespacedKey(getPlugin(), "WorthyIronPick"), new ItemStack(WorthyPickaxeUtils.createWorthyPickaxe()));
        WorthyPick.shape("LLL", " Q ", " Q ");
        WorthyPick.setIngredient('L', Material.IRON_BLOCK);
        WorthyPick.setIngredient('Q', Material.OAK_LOG);
        Bukkit.addRecipe(WorthyPick);
    }
}
