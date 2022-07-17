package me.austin.wired.Recipes.Tools.Shield;

import me.austin.wired.Utilities.Tools.Shield.FortifiedShieldUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class FortifiedShieldRecipe {
    public static void FortifiedShieldRecipe() {
        ShapedRecipe FortifiedShield = new ShapedRecipe(new NamespacedKey(getPlugin(), "FortifiedShield"), new ItemStack(FortifiedShieldUtils.createFortifiedShield()));
        FortifiedShield.shape("III", "ISI", "III");
        FortifiedShield.setIngredient('S', Material.SHIELD);
        FortifiedShield.setIngredient('I', Material.IRON_BLOCK);
        Bukkit.addRecipe(FortifiedShield);
    }
}
