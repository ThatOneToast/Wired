package me.austin.wired.Recipes.Armor.HolyGrailManaMythic;

import me.austin.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailBootsMana;
import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailBoots;
import me.austin.wired.Utilities.Other.ManaFragments;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyBootsMythicRecipe {
    public static void HolyBootsManaRecipe() {
        ShapedRecipe HolyBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyBootsMana"), new ItemStack(HolyGrailBootsMana.createHolyGrailManaBoots()));
        HolyBoots.shape("BBB", "BDB", "BBB");
        HolyBoots.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailBoots.createHolyGrailBoots()));
        HolyBoots.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyBoots);
    }
}
