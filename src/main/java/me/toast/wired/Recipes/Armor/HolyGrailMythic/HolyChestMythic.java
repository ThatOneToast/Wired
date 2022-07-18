package me.toast.wired.Recipes.Armor.HolyGrailMythic;

import me.toast.wired.Items.Armor.HolyGrailMythic.HolyGrailChestplate;
import me.toast.wired.Items.Other.HolyGrailFragments;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;


public class HolyChestMythic {

    public static void HolyChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe HolyChest = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "HolyChest"), new ItemStack(HolyGrailChestplate.createHolyGrailChestplate()));
        HolyChest.shape("DAD", "BBB", "DBD");
        HolyChest.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyChest.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyChest.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyChest);
    }
}