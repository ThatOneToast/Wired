package me.toast.wired.Recipes.Armor.FishermensArmorRare;

import me.toast.wired.Utilities.Armor.FishermensArmor.BootsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class FishermensBoots {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FishermensBoots"), new ItemStack(BootsRare.createFishermensBoot()));
        IronBoots.shape("   ", "ASA", "ASA");
        IronBoots.setIngredient('A', Material.LEATHER);
        IronBoots.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronBoots);
    }
}
