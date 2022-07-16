package me.austin.wired.Recipes.Armor.FishermensArmorRare;

import me.austin.wired.Utilities.Armor.FishermensArmor.ChestRare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FishermensJacket {

    public static void IronChestRecipe() {
        //Iron Chest ( Tank ) ( RARE )
        ShapedRecipe IronChest = new ShapedRecipe(new NamespacedKey(getPlugin(), "FishermensChest"), new ItemStack(ChestRare.createFishermensChest()));
        IronChest.shape("ASA", "AAA", "AAA");
        IronChest.setIngredient('A', Material.LEATHER);
        IronChest.setIngredient('S', Material.IRON_INGOT);
        Bukkit.addRecipe(IronChest);
    }
}