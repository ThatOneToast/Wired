package me.austin.wired.Recipes.Tools.Bows;

import me.austin.wired.Utilities.Tools.Bows.BowUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class TeleportBow {
    public static void TeleportBowRecipe(){
        //Bow ( Teleport ) ( EPIC )
        ShapedRecipe tpBow = new ShapedRecipe(new NamespacedKey(getPlugin(), "TeleportBow"), new ItemStack(BowUtils.createTeleportBow()));
        tpBow.shape("AAA", "ABA", "AAA");
        tpBow.setIngredient('A', Material.ENDER_EYE);
        tpBow.setIngredient('B', Material.BOW);
        Bukkit.addRecipe(tpBow);
    }
}
