package me.toast.wired.Recipes.Armor.TankArmorRare;

import me.toast.wired.Items.Armor.TankArmor.IronPantsUtilsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class IronPantsRare {
    public static void IronPantsRecipe() {
        //Iron Pants ( Tank ) ( RARE )
        ShapedRecipe IronPants = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronPants"), new ItemStack(IronPantsUtilsRare.createTankPants()));
        IronPants.shape("AAA", "A A", "A A");
        IronPants.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronPants);
    }
}