package me.austin.wired.Utilities.Tools.Bows;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static me.austin.wired.Wired.getPlugin;

public class BowUtils {

    public static ItemStack createTeleportBow(){
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta meta = bow.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_PURPLE + "Teleport Bow");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.DARK_GREEN + "Teleport to your arrow's location");
        lore.add("Rarity: Epic");
        meta.setLore(lore);
        bow.setItemMeta(meta);
        return bow;



    }

}

