package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailBoots;
import me.austin.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyBootsMythic {
    public static void HolyBootsRecipe() {
        ShapedRecipe HolyBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyBoots"), new ItemStack(HolyGrailBoots.createHolyGrailBoots()));
        HolyBoots.shape("DBD", "BAB", "DBD");
        HolyBoots.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyBoots.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyBoots.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyBoots);
    }
}
