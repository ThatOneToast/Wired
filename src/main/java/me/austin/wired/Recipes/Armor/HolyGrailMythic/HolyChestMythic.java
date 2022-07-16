package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailChestplate;
import me.austin.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyChestMythic {

    public static void HolyChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe HolyChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyChest"), new ItemStack(HolyGrailChestplate.createHolyGrailChestplate()));
        HolyChest.shape("DAD", "BBB", "DBD");
        HolyChest.setIngredient('D', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentSurrounding()));
        HolyChest.setIngredient('A', new RecipeChoice.ExactChoice(HolyGrailFragments.createHolyGrailFragmentMiddlePiece()));
        HolyChest.setIngredient('B', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyChest);
    }
}