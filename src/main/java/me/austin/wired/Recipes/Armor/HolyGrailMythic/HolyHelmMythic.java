package me.austin.wired.Recipes.Armor.HolyGrailMythic;

import me.austin.wired.Utilities.Armor.HolyGrailMythic.HolyGrailHelmet;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HolyHelmMythic {
    public static void HolyHelmetRecipe() {
        ShapedRecipe HolyHelm = new ShapedRecipe(new NamespacedKey(getPlugin(), "HolyHelmet"), new ItemStack(HolyGrailHelmet.createHolyGrailHelm()));
        HolyHelm.shape("NDN", "DGD", "   ");
        HolyHelm.setIngredient('G', Material.NETHERITE_BLOCK);
        HolyHelm.setIngredient('D', Material.DIAMOND);
        HolyHelm.setIngredient('N', Material.GOLD_BLOCK);
        Bukkit.addRecipe(HolyHelm);
    }
}