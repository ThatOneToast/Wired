package me.toast.wired.Recipes.Tools.Pickaxes;

import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class SpeedyPickaxeRecipe {

    public static void SpeedyPickRecipe() {
        ShapedRecipe SpeedyPick = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "SpeedyPickaxe"), new ItemStack(me.toast.wired.Utilities.Tools.Pickaxes.SpeedyPick.createSpeedyPick()));
        SpeedyPick.shape("NDN", " D ", " D ");
        SpeedyPick.setIngredient('N', Material.NETHERITE_BLOCK);
        SpeedyPick.setIngredient('D', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(SpeedyPick);
    }

}
