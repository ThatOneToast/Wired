package me.toast.wired.Items.Spells;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Familiar {

    public static ItemStack FamiliarSpell(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Familiar");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1102);
        feederLore.add(ChatColor.DARK_GREEN + "This spell, will grant you increased damage, damage resistance, and health ");
        feederLore.add(ChatColor.RED + "Mana: -75");
        feederLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }

}
