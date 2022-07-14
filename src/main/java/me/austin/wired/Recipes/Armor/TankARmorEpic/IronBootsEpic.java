package me.austin.wired.Recipes.Armor.TankARmorEpic;

import me.austin.wired.Utilities.Armor.TankArmor.IronBootsUtilsRare;
import me.austin.wired.Utilities.Armor.TankArmorEpic.IronBootsUtilsEpic;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class IronBootsEpic {
    public static void IronBootsRecipe() {
        //Iron Boots ( Tank ) ( RARE )
        ShapedRecipe IronBoots = new ShapedRecipe(new NamespacedKey(getPlugin(), "IronBootsEpic"), new ItemStack(IronBootsUtilsEpic.createTankBoots()));
        IronBoots.shape("AAA", "ABA", "AAA");
        IronBoots.setIngredient('A', Material.IRON_BLOCK);
        IronBoots.setIngredient('B', Material.IRON_BOOTS);
        Bukkit.addRecipe(IronBoots);
    }
}
