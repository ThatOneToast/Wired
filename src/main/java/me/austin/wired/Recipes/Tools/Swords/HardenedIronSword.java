package me.austin.wired.Recipes.Tools.Swords;

import me.austin.wired.Utilities.Tools.Swords.HardenedIronSwordUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HardenedIronSword {

    public static void HardenedIronSwordRecipe(){
        ShapedRecipe hardenedIronSword = new ShapedRecipe(new NamespacedKey(getPlugin(), "HardenedIronSword"), new ItemStack(HardenedIronSwordUtils.CreateHardenedIronSword()));
        hardenedIronSword.shape(" D ", " D ", " L ");
        hardenedIronSword.setIngredient('D', Material.IRON_BLOCK);
        hardenedIronSword.setIngredient('L', Material.OAK_LOG);
        Bukkit.addRecipe(hardenedIronSword);
    }

}
