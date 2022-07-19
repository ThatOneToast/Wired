package me.toast.wired.Items.Parishables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HealerUtils {

    public static ItemStack createHealer(){
        ItemStack item = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Healer");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setCustomModelData(804);
        feederLore.add(ChatColor.DARK_GREEN + "This will Fill your hunger bar");
        feederLore.add(ChatColor.DARK_GREEN + "Give you regeneration 2 for 1 minute");
        feederLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
}
