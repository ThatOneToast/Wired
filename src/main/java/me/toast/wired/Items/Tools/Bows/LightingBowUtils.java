package me.toast.wired.Items.Tools.Bows;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LightingBowUtils {


    public static ItemStack createLightingBow(){
        ItemStack Lbow = new ItemStack(Material.BOW);
        ItemMeta meta = Lbow.getItemMeta();

        meta.setDisplayName(ChatColor.GOLD + "Lightning Bow");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.DARK_GREEN + "Summon Lighting At the Arrow's Location");
        lore.add(ChatColor.DARK_GREEN + "PUNCH +2");
        lore.add(ChatColor.DARK_GREEN + "POWER +7");
        lore.add(ChatColor.DARK_GREEN + "FLAME +2");
        lore.add(ChatColor.GOLD+"Rarity: LEGENDARY");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.ARROW_FIRE, 2, true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 7, true);
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        Lbow.setItemMeta(meta);
        return Lbow;



    }
}
