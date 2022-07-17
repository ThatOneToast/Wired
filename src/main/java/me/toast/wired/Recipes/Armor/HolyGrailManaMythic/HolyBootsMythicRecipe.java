package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailBootsMana;
import me.toast.wired.Utilities.Armor.HolyGrailMythic.HolyGrailBoots;
import me.toast.wired.Utilities.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;


public class HolyBootsMythicRecipe {
    public static void HolyBootsManaRecipe() {
        ShapedRecipe HolyBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyBootsMana"), new ItemStack(HolyGrailBootsMana.createHolyGrailManaBoots()));
        HolyBoots.shape("BBB", "BDB", "BBB");
        HolyBoots.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailBoots.createHolyGrailBoots()));
        HolyBoots.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyBoots);
    }
}
