package me.austin.wired.Utilities.Tools.Pickaxes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SpeedyPick {

    public static ItemStack createSpeedyPick(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Speedy Diamond Pickaxe");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "Unbreaking +7");
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +7");
        TuffWoodenPickLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");
        meta.setLore(TuffWoodenPickLore);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        meta.addEnchant(Enchantment.DURABILITY, 7, true);
        item.setItemMeta(meta);
        return item;
    }


}
