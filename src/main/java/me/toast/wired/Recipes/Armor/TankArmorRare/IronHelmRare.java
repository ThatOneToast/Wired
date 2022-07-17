package me.toast.wired.Recipes.Armor.TankArmorRare;

import me.toast.wired.Utilities.Armor.TankArmor.IronHelmetUtilsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class IronHelmRare {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronHelmet"), new ItemStack(IronHelmetUtilsRare.createIronHelmet()));
        IronHelmet.shape("AAA", "A A", "   ");
        IronHelmet.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronHelmet);
    }
}