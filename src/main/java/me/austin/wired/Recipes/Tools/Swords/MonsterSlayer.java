package me.austin.wired.Recipes.Tools.Swords;

import me.austin.wired.Utilities.Tools.Swords.MonsterSlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static me.austin.wired.Wired.getPlugin;

public class MonsterSlayer {

    public static void MonsterSlayerRecipe() {
        //Diamond Sword ( Skull Crusher ) ( Legendary )
        ShapedRecipe MonsterSlayer = new ShapedRecipe(new NamespacedKey(getPlugin(), "MonsterSlayer"), new ItemStack(MonsterSlayerUtils.createMonsterSlayer()));
        MonsterSlayer.shape(" D ", "ADA", " D ");
        MonsterSlayer.setIngredient('D', Material.DIAMOND_BLOCK);
        MonsterSlayer.setIngredient('A', Material.DIAMOND);
        Bukkit.addRecipe(MonsterSlayer);
    }


}
