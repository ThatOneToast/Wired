package me.toast.wired.Items.Spells;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ManaRestore {

    public static ItemStack ManaRestoreSpell(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Mana Restore");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1201);
        feederLore.add(ChatColor.DARK_GRAY + "This is a dark Spell");
        feederLore.add(ChatColor.DARK_GREEN + "This Item allows you to get more mana for health");
        feederLore.add(ChatColor.RED + "Health: -45");
        feederLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
}
