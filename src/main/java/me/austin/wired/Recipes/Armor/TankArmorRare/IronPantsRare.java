package me.austin.wired.Recipes.Armor.TankArmorRare;

import me.austin.wired.Utilities.Armor.TankArmor.IronPantsUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronPantsRare {
    public static void IronPantsRecipe() {
        //Iron Pants ( Tank ) ( RARE )
        ShapedRecipe IronPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronPants"), new ItemStack(IronPantsUtilsRare.createTankPants()));
        IronPants.shape("AAA", "A A", "A A");
        IronPants.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronPants);
    }
}