package me.austin.wired.Recipes.Armor.HolyGrailManaMythic;

import me.austin.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailChestplateMana;
import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailChestplate;
import me.austin.wired.Utilities.Other.HolyGrailFragments;
import me.austin.wired.Utilities.Other.ManaFragments;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyChestMythicRecipe {

    public static void HolyChestManaRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe HolyChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyChestMana"), new ItemStack(HolyGrailChestplateMana.createHolyGrailManaChestPlate()));
        HolyChest.shape("BBB", "BDB", "BBB");
        HolyChest.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailChestplate.createHolyGrailChestplate()));
        HolyChest.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        Bukkit.addRecipe(HolyChest);
    }
}