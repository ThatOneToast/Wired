package me.austin.wired.Recipes.Armor.FishermensArmorRare;

import me.austin.wired.Utilities.Armor.FishermensArmor.HelmetRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FishermensHat {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(getPlugin(), "FishermensHat"), new ItemStack(HelmetRare.createFishermensHelmet()));
        IronHelmet.shape("AAA", "ASA", "   ");
        IronHelmet.setIngredient('A', Material.LEATHER);
        IronHelmet.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronHelmet);
    }
}