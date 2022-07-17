package me.toast.wired.Recipes.Armor.TraversalArmorCommon;

import me.toast.wired.Utilities.Armor.TraversalArmorCommon.LeatherPantsUtilsCommon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class LeatherPantsCommon {
    public static void LeatherPantsRecipe(){
        ShapedRecipe LeatherPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "LeatherPants"), new ItemStack(LeatherPantsUtilsCommon.createLeatherPants()));
        LeatherPants.shape("LLL", "LSL", "LSL");
        LeatherPants.setIngredient('L', Material.LEATHER);
        LeatherPants.setIngredient('S', Material.SUGAR);
        Bukkit.addRecipe(LeatherPants);

    }
}
