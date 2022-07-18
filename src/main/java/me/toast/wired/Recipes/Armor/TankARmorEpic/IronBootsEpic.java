package me.toast.wired.Recipes.Armor.TankARmorEpic;

import me.toast.wired.Items.Armor.TankArmorEpic.IronBootsUtilsEpic;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class IronBootsEpic {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronBootsEpic"), new ItemStack(IronBootsUtilsEpic.createTankBoots()));
        IronBoots.shape("AAA", "ABA", "AAA");
        IronBoots.setIngredient('A', Material.IRON_BLOCK);
        IronBoots.setIngredient('B', Material.IRON_BOOTS);
        Bukkit.addRecipe(IronBoots);
    }
}
