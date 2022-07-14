package me.austin.wired.Utilities.Tools.Pickaxes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

public class TuffedWoodenPickaxeUtils {

    public static ItemStack createTuffedWoodenPickaxe(){
        ItemStack TuffWoodenPickaxe = new ItemStack(Material.WOODEN_PICKAXE);
        ItemMeta meta = TuffWoodenPickaxe.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Tuff Wooden Pickaxe");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +7");
        TuffWoodenPickLore.add(ChatColor.GRAY + "Rarity: COMMON");
        meta.setLore(TuffWoodenPickLore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        TuffWoodenPickaxe.setItemMeta(meta);
        return TuffWoodenPickaxe;
    }
}
