package me.austin.wired.Utilities.Tools.Bows;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PoisonBowUtils {
    public static ItemStack createpoisonbow(){
        ItemStack Pbow = new ItemStack(Material.BOW);
        ItemMeta meta = Pbow.getItemMeta();

        meta.setDisplayName(ChatColor.GOLD + "Poison Bow");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_GREEN + "PUNCH +1");
        lore.add(ChatColor.DARK_GREEN + "POWER +3");
        lore.add(ChatColor.DARK_GREEN + "FLAME +5");
        lore.add(ChatColor.DARK_GREEN + "POISON +20");
        lore.add(ChatColor.DARK_GREEN + "HUNGER +220");
        lore.add(ChatColor.GOLD+"Rarity: LEGENDARY");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.ARROW_FIRE, 5, true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
        Pbow.setItemMeta(meta);
        return Pbow;



    }
}
