package me.toast.wired.Utilities.Tools.Axe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class StrongAxeUtils {

    public static ItemStack createStrongAxe(){
        ItemStack StrongAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta meta = StrongAxe.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GREEN + "Strong Axe");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +3");
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "Unbreaking +3");
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "Rarity: UNCOMMON");
        meta.setLore(TuffWoodenPickLore);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
        StrongAxe.setItemMeta(meta);
        return StrongAxe;
    }
}
