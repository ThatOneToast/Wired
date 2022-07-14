package me.austin.wired.Recipes.Armor.TankArmorRare;

import me.austin.wired.Utilities.Armor.TankArmor.IronBootsUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronBootsRare {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronBoots"), new ItemStack(IronBootsUtilsRare.createTankBoots()));
        IronBoots.shape("   ", "A A", "A A");
        IronBoots.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronBoots);
    }
}
