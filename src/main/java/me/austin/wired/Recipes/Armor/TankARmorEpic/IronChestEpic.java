package me.austin.wired.Recipes.Armor.TankARmorEpic;

import me.austin.wired.Utilities.Armor.TankArmor.IronChestUtilsRare;
import me.austin.wired.Utilities.Armor.TankArmorEpic.IronChestUtilsEpic;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronChestEpic {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronChestEpic"), new ItemStack(IronChestUtilsEpic.createTankChestplate()));
        IronChest.shape("ACA", "AAA", "AAA");
        IronChest.setIngredient('A', Material.IRON_BLOCK);
        IronChest.setIngredient('C', Material.IRON_CHESTPLATE);
        Bukkit.addRecipe(IronChest);
    }
}