package me.austin.wired.Recipes.Armor.HolyGrailManaMythic;

import me.austin.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailHelmetMana;
import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailHelmet;
import me.austin.wired.Utilities.Other.ManaFragments;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyHelmMythicRecipe {
    public static void HolyHelmetManaRecipe() {
        ShapedRecipe HolyHelm = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyHelmetMana"), new ItemStack(HolyGrailHelmetMana.createHolyGrailHelm()));
        HolyHelm.shape("BBB", "BDB", "BBB");
        HolyHelm.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailHelmet.createHolyGrailHelm()));
        HolyHelm.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyHelm);
    }
}