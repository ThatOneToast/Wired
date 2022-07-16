package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailLeggings;
import me.austin.wired.Utilities.Armor.TankArmor.IronPantsUtilsRare;
import me.austin.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyPantsMythic {
    public static void HolyPantsRecipe() {
        ShapedRecipe HolyPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyPants"), new ItemStack(HolyGrailLeggings.createHolyGrailPants()));
        HolyPants.shape("DAD", "BBB", "DBD");
        HolyPants.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyPants.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyPants.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyPants);
    }
}