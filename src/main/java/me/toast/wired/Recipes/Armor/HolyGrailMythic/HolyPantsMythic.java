package me.toast.wired.Recipes.Armor.HolyGrailMythic;

import me.toast.wired.Items.Armor.HolyGrailMythic.HolyGrailLeggings;
import me.toast.wired.Items.Ores.HolyGrailFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class HolyPantsMythic {
    public static void HolyPantsRecipe() {
        ShapedRecipe HolyPants = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyPants"), new ItemStack(HolyGrailLeggings.createHolyGrailPants()));
        HolyPants.shape("DBD", "BBB", "DAD");
        HolyPants.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyPants.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyPants.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyPants);
    }
}