package me.austin.wired.Recipes.Tools.Pickaxes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class SpeedyPickaxeRecipe {

    public static void SpeedyPickRecipe() {
        ShapedRecipe SpeedyPick = new ShapedRecipe(new NamespacedKey(getPlugin(), "SpeedyPickaxe"), new ItemStack(me.austin.wired.Utilities.Tools.Pickaxes.SpeedyPick.createSpeedyPick()));
        SpeedyPick.shape("NDN", " D ", " D ");
        SpeedyPick.setIngredient('N', Material.NETHERITE_BLOCK);
        SpeedyPick.setIngredient('D', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(SpeedyPick);
    }

}
