package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailChestplate;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyChestMythic {

    public static void HolyChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe HolyChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyChest"), new ItemStack(HolyGrailChestplate.createHolyGrailChestplate()));
        HolyChest.shape("NDN", "DDD", "DDD");
        HolyChest.setIngredient('N', Material.NETHERITE_BLOCK);
        HolyChest.setIngredient('D', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(HolyChest);
    }
}