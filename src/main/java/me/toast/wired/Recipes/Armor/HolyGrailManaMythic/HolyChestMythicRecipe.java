package me.toast.wired.Recipes.Armor.HolyGrailManaMythic;

import me.toast.wired.Utilities.Armor.HolyGrailManaArmor.HolyGrailChestplateMana;
import me.toast.wired.Utilities.Armor.HolyGrailMythic.HolyGrailChestplate;
import me.toast.wired.Utilities.Other.ManaFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;


public class HolyChestMythicRecipe {

    public static void HolyChestManaRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe HolyChest = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyChestMana"), new ItemStack(HolyGrailChestplateMana.createHolyGrailManaChestPlate()));
        HolyChest.shape("BDB", "BBB", "BBB");
        HolyChest.setIngredient('B', new RecipeChoice.ExactChoice(ManaFragments.createManaFragments()));
        HolyChest.setIngredient('D', Material.DIAMOND_BLOCK);

        Bukkit.addRecipe(HolyChest);
    }
}