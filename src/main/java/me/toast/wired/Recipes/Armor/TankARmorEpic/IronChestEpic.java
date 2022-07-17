package me.toast.wired.Recipes.Armor.TankARmorEpic;

import me.toast.wired.Utilities.Armor.TankArmorEpic.IronChestUtilsEpic;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class IronChestEpic {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronChestEpic"), new ItemStack(IronChestUtilsEpic.createTankChestplate()));
        IronChest.shape("ACA", "AAA", "AAA");
        IronChest.setIngredient('A', Material.IRON_BLOCK);
        IronChest.setIngredient('C', Material.IRON_CHESTPLATE);
        Bukkit.addRecipe(IronChest);
    }
}