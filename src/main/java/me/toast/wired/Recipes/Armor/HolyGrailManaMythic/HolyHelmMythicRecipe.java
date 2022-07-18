package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Items.Armor.HolyGrailManaArmor.HolyGrailHelmetMana;
import me.toast.wired.Items.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class HolyHelmMythicRecipe {
    public static void HolyHelmetManaRecipe() {
        ShapedRecipe HolyHelm = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyHelmetMana"), new ItemStack(HolyGrailHelmetMana.createHolyGrailHelm()));
        HolyHelm.shape("BBB", "BDB", "   ");
        HolyHelm.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        HolyHelm.setIngredient('D', Material.DIAMOND_BLOCK);

        Bukkit.addRecipe(HolyHelm);
    }
}