package me.austin.wired.Utilities.Other;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FlyingFeatherUtils {
    public static ItemStack createFlyingFeather(){
        ItemStack flyingFeather = new ItemStack(Material.FEATHER);
        ItemMeta meta = flyingFeather.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying Feather");
        List<String> flyingFeatherLore = new ArrayList<>();
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.setCustomModelData(142);
        flyingFeatherLore.add(ChatColor.DARK_GREEN + "This will make you as light as a feather and let you fly");
        flyingFeatherLore.add(ChatColor.DARK_GREEN + "Right click to fly, right click again to stop flying.");
        flyingFeatherLore.add(ChatColor.DARK_GREEN + "Rarity: UNCOMMON");
        meta.setLore(flyingFeatherLore);
        flyingFeather.setItemMeta(meta);
        return flyingFeather;
    }
}
