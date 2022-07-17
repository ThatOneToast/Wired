package me.toast.wired.Recipes.Armor.FishermensArmorRare;

import me.toast.wired.Utilities.Armor.FishermensArmor.ChestRare;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;


public class FishermensJacket {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "FishermensChest"), new ItemStack(ChestRare.createFishermensChest()));
        IronChest.shape("ASA", "AAA", "AAA");
        IronChest.setIngredient('A', Material.LEATHER);
        IronChest.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronChest);
    }
}