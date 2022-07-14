package me.austin.wired.Recipes.Armor.TraversalArmorCommon;

import me.austin.wired.Utilities.Armor.TraversalArmorCommon.LeatherBootsUtilsCommon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class LeatherBootsCommon {

    public static void LeatherBootsRecipe(){
        ShapedRecipe LeatherBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "LeatherBoots"), new ItemStack(LeatherBootsUtilsCommon.createLeatherBoots()));
        LeatherBoots.shape("   ", "ABA", "ABA");
        LeatherBoots.setIngredient('A', Material.LEATHER);
        LeatherBoots.setIngredient('B', Material.SUGAR);
        Bukkit.addRecipe(LeatherBoots);

    }
}
