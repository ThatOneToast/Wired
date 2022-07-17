package me.toast.wired.Recipes.Armor.TraversalArmorCommon;

import me.toast.wired.Utilities.Armor.TraversalArmorCommon.LeatherBootsUtilsCommon;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class LeatherBootsCommon {

    public static void LeatherBootsRecipe(){
        ShapedRecipe LeatherBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "LeatherBoots"), new ItemStack(LeatherBootsUtilsCommon.createLeatherBoots()));
        LeatherBoots.shape("   ", "ABA", "ABA");
        LeatherBoots.setIngredient('A', Material.LEATHER);
        LeatherBoots.setIngredient('B', Material.SUGAR);
        Bukkit.addRecipe(LeatherBoots);

    }
}
