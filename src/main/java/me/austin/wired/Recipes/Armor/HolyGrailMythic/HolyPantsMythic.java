package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailLeggings;
import me.austin.wired.Utilities.Armor.TankArmor.IronPantsUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyPantsMythic {
    public static void HolyPantsRecipe() {
        ShapedRecipe HolyPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyPants"), new ItemStack(HolyGrailLeggings.createHolyGrailPants()));
        HolyPants.shape("GNG", "D D", "D D");
        HolyPants.setIngredient('G', Material.GOLD_BLOCK);
        HolyPants.setIngredient('N', Material.NETHERITE_BLOCK);
        HolyPants.setIngredient('D', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyPants);
    }
}