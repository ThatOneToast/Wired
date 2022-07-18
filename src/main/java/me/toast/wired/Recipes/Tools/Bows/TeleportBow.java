package me.toast.wired.Recipes.Tools.Bows;

import me.toast.wired.Items.Tools.Bows.BowUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TeleportBow {
    public static void TeleportBowRecipe(){
        //Bow ( Teleport ) ( EPIC )
        ShapedRecipe tpBow = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "TeleportBow"), new ItemStack(BowUtils.createTeleportBow()));
        tpBow.shape("AAA", "ABA", "AAA");
        tpBow.setIngredient('A', Material.ENDER_EYE);
        tpBow.setIngredient('B', Material.BOW);
        Bukkit.addRecipe(tpBow);
    }
}
