package me.austin.wired.Recipes.Tools.Shovel;

import me.austin.wired.Utilities.Tools.Axe.StrongAxeUtils;
import me.austin.wired.Utilities.Tools.Shovel.FastShovelUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FastShovelRecipe {


    public static void FastShovelRecipe() {
        ShapedRecipe FastShovel = new ShapedRecipe(new NamespacedKey(getPlugin(), "FastShovel"), new ItemStack(FastShovelUtils.createFastShovel()));
        FastShovel.shape(" I ", " L ", " L ");
        FastShovel.setIngredient('L', Material.OAK_LOG);
        FastShovel.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(FastShovel);
    }


}
