package me.toast.wired.Recipes.Armor.FishermensArmorRare;

import me.toast.wired.Utilities.Armor.FishermensArmor.HelmetRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class FishermensHat {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FishermensHat"), new ItemStack(HelmetRare.createFishermensHelmet()));
        IronHelmet.shape("AAA", "ASA", "   ");
        IronHelmet.setIngredient('A', Material.LEATHER);
        IronHelmet.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronHelmet);
    }
}