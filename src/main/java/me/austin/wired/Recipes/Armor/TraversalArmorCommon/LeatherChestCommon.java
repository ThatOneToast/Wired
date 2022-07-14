package me.austin.wired.Recipes.Armor.TraversalArmorCommon;

import me.austin.wired.Utilities.Armor.TraversalArmorCommon.LeatherChestUtilsCommon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class LeatherChestCommon {

    public static void LeatherChestRecipe(){
        ShapedRecipe LeatherChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "LeatherChest"), new ItemStack(LeatherChestUtilsCommon.createLeatherChest()));
        LeatherChest.shape("LSL", "LLL", "LLL");
        LeatherChest.setIngredient('L', Material.LEATHER);
        LeatherChest.setIngredient('S', Material.SUGAR);
        Bukkit.addRecipe(LeatherChest);

    }
}
