package me.toast.wired.Recipes.Armor.FishermensArmorRare;

import me.toast.wired.Items.Armor.FishermensArmor.PantsRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
public class FishermensPants {
    public static void IronPantsRecipe() {
        //Iron Pants ( Tank ) ( RARE )
        ShapedRecipe IronPants = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FishermensPants"), new ItemStack(PantsRare.createFishermensPants()));
        IronPants.shape("AAA", "ASA", "ASA");
        IronPants.setIngredient('A', Material.LEATHER);
        IronPants.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronPants);
    }
}