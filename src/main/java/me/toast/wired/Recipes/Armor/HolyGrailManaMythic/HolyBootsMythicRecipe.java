package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailBootsMana;
import me.toast.wired.Utilities.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;


public class HolyBootsMythicRecipe {
    public static void HolyBootsManaRecipe() {
        ShapedRecipe HolyBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyBootsMana"), HolyGrailBootsMana.createHolyGrailManaBoots());
        HolyBoots.shape("   ", "BDB", "BDB");
        HolyBoots.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        HolyBoots.setIngredient('D', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyBoots);
    }

}
