package me.toast.wired.Items.Spells;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FIreBall {

    public static ItemStack FireBallSpell(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Fire Ball");
        List<String> feederLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1101);
        feederLore.add(ChatColor.DARK_GREEN + "This Item allows you to use your mana");
        feederLore.add(ChatColor.DARK_GREEN + "to shoot a fireball at your target");
        feederLore.add(ChatColor.RED + "Mana: -35");
        feederLore.add(ChatColor.DARK_GREEN + "Rarity: UNCOMMON");
        meta.setLore(feederLore);
        item.setItemMeta(meta);
        return item;
    }
}
