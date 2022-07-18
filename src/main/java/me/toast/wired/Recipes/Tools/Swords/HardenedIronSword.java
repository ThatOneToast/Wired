package me.toast.wired.Recipes.Tools.Swords;

import me.toast.wired.Items.Tools.Swords.HardenedIronSwordUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class HardenedIronSword {

    public static void HardenedIronSwordRecipe(){
        ShapedRecipe hardenedIronSword = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HardenedIronSword"), new ItemStack(HardenedIronSwordUtils.CreateHardenedIronSword()));
        hardenedIronSword.shape(" D ", " D ", " L ");
        hardenedIronSword.setIngredient('D', Material.IRON_BLOCK);
        hardenedIronSword.setIngredient('L', Material.OAK_LOG);
        Bukkit.addRecipe(hardenedIronSword);
    }

}
