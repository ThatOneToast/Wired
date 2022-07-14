package me.austin.wired.Recipes.Armor.TankArmorRare;

import me.austin.wired.Utilities.Armor.TankArmor.IronHelmetUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronHelmRare {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronHelmet"), new ItemStack(IronHelmetUtilsRare.createIronHelmet()));
        IronHelmet.shape("AAA", "A A", "   ");
        IronHelmet.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronHelmet);
    }
}