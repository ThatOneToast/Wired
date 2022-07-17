package me.toast.wired.Recipes.Armor.TankArmorRare;

import me.toast.wired.Utilities.Armor.TankArmor.IronChestUtilsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class IronChestRare {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronChest"), new ItemStack(IronChestUtilsRare.createTankChestplate()));
        IronChest.shape("A A", "AAA", "AAA");
        IronChest.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronChest);
    }
}