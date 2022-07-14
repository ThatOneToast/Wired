package me.austin.wired.Recipes.Armor.TraversalArmorCommon;

import me.austin.wired.Utilities.Armor.TraversalArmorCommon.LeatherHelmetUtilsCommon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class LeatherHelmetCommon {
    public static void LeatherHelmetRecipe(){
        ShapedRecipe LeatherHelmet = new ShapedRecipe(new NamespacedKey(getPlugin(), "LeatherHelmet"), new ItemStack(LeatherHelmetUtilsCommon.createLeatherHelmet()));
        LeatherHelmet.shape("LLL", "LSL", "   ");
        LeatherHelmet.setIngredient('L', Material.LEATHER);
        LeatherHelmet.setIngredient('S', Material.SUGAR);
        Bukkit.addRecipe(LeatherHelmet);

    }
}
