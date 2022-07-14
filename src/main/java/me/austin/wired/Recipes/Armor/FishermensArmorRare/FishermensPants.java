package me.austin.wired.Recipes.Armor.FishermensArmorRare;

import me.austin.wired.Utilities.Armor.FishermensArmor.PantsRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FishermensPants {
    public static void IronPantsRecipe() {
        //Iron Pants ( Tank ) ( RARE )
        ShapedRecipe IronPants = new ShapedRecipe(new NamespacedKey(getPlugin(), "FishermensPants"), new ItemStack(PantsRare.createFishermensPants()));
        IronPants.shape("AAA", "ASA", "ASA");
        IronPants.setIngredient('A', Material.LEATHER);
        IronPants.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronPants);
    }
}