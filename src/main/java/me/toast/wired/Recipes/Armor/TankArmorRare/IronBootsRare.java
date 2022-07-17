package me.toast.wired.Recipes.Armor.TankArmorRare;

import me.toast.wired.Utilities.Armor.TankArmor.IronBootsUtilsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class IronBootsRare {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronBoots"), new ItemStack(IronBootsUtilsRare.createTankBoots()));
        IronBoots.shape("   ", "A A", "A A");
        IronBoots.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronBoots);
    }
}
