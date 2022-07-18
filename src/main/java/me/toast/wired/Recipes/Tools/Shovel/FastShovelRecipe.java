package me.toast.wired.Recipes.Tools.Shovel;

import me.toast.wired.Items.Tools.Shovel.FastShovelUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class FastShovelRecipe {


    public static void FastShovelRecipe() {
        ShapedRecipe FastShovel = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FastShovel"), new ItemStack(FastShovelUtils.createFastShovel()));
        FastShovel.shape(" I ", " L ", " L ");
        FastShovel.setIngredient('L', Material.OAK_LOG);
        FastShovel.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(FastShovel);
    }


}
