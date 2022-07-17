package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailHelmetMana;
import me.toast.wired.Utilities.Armor.HolyGrailMythic.HolyGrailHelmet;
import me.toast.wired.Utilities.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class HolyHelmMythicRecipe {
    public static void HolyHelmetManaRecipe() {
        ShapedRecipe HolyHelm = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyHelmetMana"), new ItemStack(HolyGrailHelmetMana.createHolyGrailHelm()));
        HolyHelm.shape("BBB", "BDB", "BBB");
        HolyHelm.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailHelmet.createHolyGrailHelm()));
        HolyHelm.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyHelm);
    }
}