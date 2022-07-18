package me.toast.wired.Items.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class HealthBoosterUtils {

    public static ItemStack createHealthBooster(){
        ItemStack booster = new ItemStack(Material.APPLE);
        ItemMeta meta = booster.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Health Booster");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setCustomModelData(312);
        feederLore.add(ChatColor.DARK_GREEN + "This will add 5 hearts to your health");
        feederLore.add(ChatColor.GOLD + "Rarity: Legendary");
        meta.setLore(feederLore);
        booster.setItemMeta(meta);
        return booster;
    }
}
