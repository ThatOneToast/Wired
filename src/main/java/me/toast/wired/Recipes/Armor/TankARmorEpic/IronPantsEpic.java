package me.toast.wired.Recipes.Armor.TankARmorEpic;

import me.toast.wired.Utilities.Armor.TankArmorEpic.IronPantsUtilsEpic;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.toast.wired.Wired.getPlugin;

public class IronPantsEpic {
    public static void IronPantsRecipe() {
        //Iron Pants ( Tank ) ( RARE )
        ShapedRecipe IronPants = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "IronPantsEpic"), new ItemStack(IronPantsUtilsEpic.createTankPants()));
        IronPants.shape("AAA", "APA", "A A");
        IronPants.setIngredient('A', Material.IRON_BLOCK);
        IronPants.setIngredient('P', Material.IRON_LEGGINGS);
        Bukkit.addRecipe(IronPants);
    }
}