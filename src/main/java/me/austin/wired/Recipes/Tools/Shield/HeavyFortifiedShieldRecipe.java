package me.austin.wired.Recipes.Tools.Shield;

import me.austin.wired.Utilities.Tools.Shield.FortifiedShieldUtils;
import me.austin.wired.Utilities.Tools.Shield.HeavyFortifiedShieldUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class HeavyFortifiedShieldRecipe {

    public static void HeavyFortifiedShieldRecipe() {
        ShapedRecipe FortifiedShield = new ShapedRecipe(new NamespacedKey(getPlugin(), "HeavyFortifiedShield"), new ItemStack(HeavyFortifiedShieldUtils.createHeavyFortifiedShield()));
        FortifiedShield.shape("III", "ISI", "III");
        FortifiedShield.setIngredient('S', Material.SHIELD);
        FortifiedShield.setIngredient('I', Material.DIAMOND_BLOCK);
        Bukkit.addRecipe(FortifiedShield);
    }

}
