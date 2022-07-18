package me.toast.wired.Items.Tools.Shield;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FortifiedShieldUtils {

    public static ItemStack createFortifiedShield(){
        ItemStack item = new ItemStack(Material.SHIELD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Fortified Shield");
        List<String> itemLore = new ArrayList<>();
        itemLore.add(ChatColor.DARK_GREEN + "UNBREAKING +25");
        itemLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setLore(itemLore);
        meta.addEnchant(Enchantment.DURABILITY, 25, true);
        item.setItemMeta(meta);
        return item;
    }

}
