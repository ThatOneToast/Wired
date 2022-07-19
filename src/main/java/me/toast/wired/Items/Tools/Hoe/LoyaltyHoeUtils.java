package me.toast.wired.Items.Tools.Hoe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LoyaltyHoeUtils {

    public static ItemStack createLoyalHoe(){
        ItemStack LoyalHoe = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = LoyalHoe.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GREEN + "Loyal Hoe");
        List<String> LoyalHoeLore = new ArrayList<>();
        LoyalHoeLore.add(ChatColor.DARK_GREEN + "Loyalty +9001");
        LoyalHoeLore.add(ChatColor.DARK_GREEN + "Unbreaking +3");
        LoyalHoeLore.add(ChatColor.DARK_GREEN + "Rarity: UNCOMMON");
        meta.setLore(LoyalHoeLore);
        meta.setCustomModelData(601);
        meta.addEnchant(Enchantment.LOYALTY, 9001, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
        LoyalHoe.setItemMeta(meta);
        return LoyalHoe;
    }
}
