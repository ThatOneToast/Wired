package me.austin.wired.Utilities.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ManaFragments {

    public static ItemStack createManaFragments(){
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Holy Grail Fragment");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.setCustomModelData(642);
        feederLore.add(ChatColor.DARK_GREEN + "This Item can make the Mana armor");
        feederLore.add(ChatColor.GOLD + "Rarity: GOLD");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }

}
