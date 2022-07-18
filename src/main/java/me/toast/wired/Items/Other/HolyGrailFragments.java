package me.toast.wired.Items.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HolyGrailFragments {

    public static ItemStack createHolyGrailFragmentSurrounding(){
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Holy Grail Fragment");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.setCustomModelData(102);
        feederLore.add(ChatColor.DARK_GREEN + "This Item can make the holy grail armor.");
        feederLore.add(ChatColor.LIGHT_PURPLE + "Rarity: Mythic");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack createHolyGrailFragmentMiddlePiece(){
        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Holy Grail Shard");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.setCustomModelData(102);
        feederLore.add(ChatColor.DARK_GREEN + "This Item can make the holy grail armor.");
        feederLore.add(ChatColor.LIGHT_PURPLE + "Rarity: Mythic");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
}
