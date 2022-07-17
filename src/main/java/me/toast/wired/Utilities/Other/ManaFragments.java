package me.toast.wired.Utilities.Other;

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
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mana Fragment");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.setCustomModelData(642);
        feederLore.add(ChatColor.DARK_GREEN + "This Item can be used to infuse Holy Grail Armor.");
        feederLore.add(ChatColor.RED + "Beware upon doing so, you will lose all enchants on your armor.");
        feederLore.add(ChatColor.GOLD + "Rarity: GOLD");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }

}
