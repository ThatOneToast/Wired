package me.austin.wired.Recipes.Armor.TankARmorEpic;

import me.austin.wired.Utilities.Armor.TankArmor.IronHelmetUtilsRare;
import me.austin.wired.Utilities.Armor.TankArmorEpic.IronHelmetUtilsEpic;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronHelmEpic {
    public static void IronHelmRecipe() {
        //Iron Helmet ( Tank ) ( RARE )
        ShapedRecipe IronHelmet = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronHelmetEpic"), new ItemStack(IronHelmetUtilsEpic.createIronHelmet()));
        IronHelmet.shape("AAA", "AHA", "   ");
        IronHelmet.setIngredient('A', Material.IRON_BLOCK);
        IronHelmet.setIngredient('H', Material.IRON_HELMET);
        Bukkit.addRecipe(IronHelmet);
    }
}