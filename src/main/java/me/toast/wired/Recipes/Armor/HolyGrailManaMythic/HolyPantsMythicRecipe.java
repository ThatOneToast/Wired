package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailLeggingsMana;
import me.toast.wired.Utilities.Armor.HolyGrailMythic.HolyGrailLeggings;
import me.toast.wired.Utilities.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class HolyPantsMythicRecipe {
    public static void HolyPantsManaRecipe() {
        ShapedRecipe HolyPants = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyPantsMana"), new ItemStack(HolyGrailLeggingsMana.createHolyGrailPants()));
        HolyPants.shape("BBB", "BDB", "BBB");
        HolyPants.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailLeggings.createHolyGrailPants()));
        HolyPants.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyPants);
    }
}