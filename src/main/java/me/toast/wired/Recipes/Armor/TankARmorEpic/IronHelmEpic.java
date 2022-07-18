package me.toast.wired.Recipes.Armor.TankARmorEpic;

import me.toast.wired.Items.Armor.TankArmorEpic.IronHelmetUtilsEpic;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class IronHelmEpic {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronHelmetEpic"), new ItemStack(IronHelmetUtilsEpic.createIronHelmet()));
        IronHelmet.shape("AAA", "AHA", "   ");
        IronHelmet.setIngredient('A', Material.IRON_BLOCK);
        IronHelmet.setIngredient('H', Material.IRON_HELMET);
        Bukkit.addRecipe(IronHelmet);
    }
}