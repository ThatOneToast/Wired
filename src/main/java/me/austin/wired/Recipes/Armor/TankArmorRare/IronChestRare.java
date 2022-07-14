package me.austin.wired.Recipes.Armor.TankArmorRare;

import me.austin.wired.Utilities.Armor.TankArmor.IronChestUtilsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronChestRare {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronChest"), new ItemStack(IronChestUtilsRare.createTankChestplate()));
        IronChest.shape("A A", "AAA", "AAA");
        IronChest.setIngredient('A', Material.IRON_BLOCK);
        Bukkit.addRecipe(IronChest);
    }
}