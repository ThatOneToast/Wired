package me.austin.wired.Recipes.Tools.Bows;

import me.austin.wired.Utilities.Tools.Bows.LightingBowUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class LightningBow {


    public static void LightningBowRecipe(){
        //Bow ( Lighting Bow ) ( LEGENDARY )
        ShapedRecipe LightningBow = new ShapedRecipe(new NamespacedKey(getPlugin(), "LightningBow"), new ItemStack(LightingBowUtils.createLightingBow()));
        LightningBow.shape("NEN", "DBD", "NDN");
        LightningBow.setIngredient('N', Material.NETHERITE_INGOT);
        LightningBow.setIngredient('D', Material.DIAMOND_BLOCK);
        LightningBow.setIngredient('B', Material.BOW);
        LightningBow.setIngredient('E', Material.BEACON);
        Bukkit.addRecipe(LightningBow);
    }
}
