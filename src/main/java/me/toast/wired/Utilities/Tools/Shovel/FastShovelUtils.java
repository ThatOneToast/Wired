package me.toast.wired.Utilities.Tools.Shovel;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FastShovelUtils {

    public static ItemStack createFastShovel(){
        ItemStack fastShovel = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta meta = fastShovel.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Fast Shovel");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +6");
        TuffWoodenPickLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setLore(TuffWoodenPickLore);
        meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        fastShovel.setItemMeta(meta);
        return fastShovel;
    }
}
