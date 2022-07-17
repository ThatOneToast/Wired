package me.austin.wired.Recipes.Armor.HolyGrailManaMythic;

import me.austin.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailLeggingsMana;
import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailLeggings;
import me.austin.wired.Utilities.Other.ManaFragments;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyPantsMythicRecipe {
    public static void HolyPantsManaRecipe() {
        ShapedRecipe HolyPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyPantsMana"), new ItemStack(HolyGrailLeggingsMana.createHolyGrailPants()));
        HolyPants.shape("BBB", "BDB", "BBB");
        HolyPants.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailLeggings.createHolyGrailPants()));
        HolyPants.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyPants);
    }
}