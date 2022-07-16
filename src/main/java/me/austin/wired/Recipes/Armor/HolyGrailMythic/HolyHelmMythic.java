package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailHelmet;
import me.austin.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyHelmMythic {
    public static void HolyHelmetRecipe() {
        ShapedRecipe HolyHelm = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyHelmet"), new ItemStack(HolyGrailHelmet.createHolyGrailHelm()));
        HolyHelm.shape("DAD", "DBD", "   ");
        HolyHelm.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyHelm.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyHelm.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyHelm);
    }
}