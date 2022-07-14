package me.austin.wired.Recipes.Tools.Bows;

import me.austin.wired.Utilities.Tools.Bows.PoisonBowUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class PoisonBow {

    public static void PoisonBowRecipe(){
        ShapedRecipe PoisonBow = new ShapedRecipe(new NamespacedKey(getPlugin(), "PoisonBow"), new ItemStack(PoisonBowUtils.createpoisonbow()));
        PoisonBow.shape("NEN", "DBD", "NDN");
        PoisonBow.setIngredient('N', Material.PUFFERFISH_BUCKET);
        PoisonBow.setIngredient('D', Material.DIAMOND_BLOCK);
        PoisonBow.setIngredient('B', Material.BOW);
        PoisonBow.setIngredient('E', Material.BEACON);
        Bukkit.addRecipe(PoisonBow);
    }
}
