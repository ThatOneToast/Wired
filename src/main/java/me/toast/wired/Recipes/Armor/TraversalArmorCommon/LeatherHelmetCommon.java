package me.toast.wired.Recipes.Armor.TraversalArmorCommon;

import me.toast.wired.Items.Armor.TraversalArmorCommon.LeatherHelmetUtilsCommon;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class LeatherHelmetCommon {
    public static void LeatherHelmetRecipe(){
        ShapedRecipe LeatherHelmet = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "LeatherHelmet"), new ItemStack(LeatherHelmetUtilsCommon.createLeatherHelmet()));
        LeatherHelmet.shape("LLL", "LSL", "   ");
        LeatherHelmet.setIngredient('L', Material.LEATHER);
        LeatherHelmet.setIngredient('S', Material.SUGAR);
        Bukkit.addRecipe(LeatherHelmet);

    }
}
