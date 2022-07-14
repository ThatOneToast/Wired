package me.austin.wired.Recipes.Armor.FishermensArmorRare;

import me.austin.wired.Utilities.Armor.FishermensArmor.BootsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FishermensBoots {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "FishermensBoots"), new ItemStack(BootsRare.createFishermensBoot()));
        IronBoots.shape("   ", "ASA", "ASA");
        IronBoots.setIngredient('A', Material.LEATHER);
        IronBoots.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronBoots);
    }
}
