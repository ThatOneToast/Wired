package me.toast.wired.Items.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ExpBottleUtils {
    public static ItemStack ExpBottle(){
        ItemStack item = new ItemStack(Material.EXPERIENCE_BOTTLE);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Holy Exp Bottle");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.setCustomModelData(642);
        feederLore.add(ChatColor.DARK_GREEN + "This Item can give you Exp");
        feederLore.add(ChatColor.GOLD + "Rarity: GOLD");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
}
