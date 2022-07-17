package me.toast.wired.Utilities.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FeederUtils {

    public static ItemStack createFeeder(){
        ItemStack feeder = new ItemStack(Material.WHEAT);
        ItemMeta meta = feeder.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Feeder");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setCustomModelData(312);
        feederLore.add(ChatColor.DARK_GREEN + "This will feed you to full in 1 click");
        feederLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setLore(feederLore);
        feeder.setItemMeta(meta);
        return feeder;
    }

}
