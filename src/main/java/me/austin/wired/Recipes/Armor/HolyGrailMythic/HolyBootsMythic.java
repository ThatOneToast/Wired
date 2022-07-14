package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailBoots;
import me.austin.wired.Utilities.Armor.TankArmor.IronBootsUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyBootsMythic {
    public static void HolyBootsRecipe() {
        ShapedRecipe HolyBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyBoots"), new ItemStack(HolyGrailBoots.createHolyGrailBoots()));
        HolyBoots.shape("DGD", "AIA", "AGA");
        HolyBoots.setIngredient('D', Material.DIAMOND);
        HolyBoots.setIngredient('G', Material.GOLD_BLOCK);
        HolyBoots.setIngredient('I', Material.IRON_BLOCK);
        HolyBoots.setIngredient('A', Material.DIAMOND_BLOCK);

        Bukkit.addRecipe(HolyBoots);
    }
}
