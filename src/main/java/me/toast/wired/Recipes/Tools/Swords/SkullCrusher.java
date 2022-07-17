package me.toast.wired.Recipes.Tools.Swords;

import me.toast.wired.Utilities.Tools.Swords.SkullCrusherUtils;
import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class SkullCrusher {
    public static void SkullCrusherRecipe() {
        //Diamond Sword ( Skull Crusher ) ( Legendary )
        ShapedRecipe SkullCrusher = new ShapedRecipe(new NamespacedKey(Wired.getPlugin(), "SkullCrusher"), new ItemStack(SkullCrusherUtils.createSkullCrusher()));
        SkullCrusher.shape(" D ", " D ", "NNN");
        SkullCrusher.setIngredient('D', Material.DIAMOND_BLOCK);
        SkullCrusher.setIngredient('N', Material.NETHERITE_INGOT);
        Bukkit.addRecipe(SkullCrusher);
    }
}
