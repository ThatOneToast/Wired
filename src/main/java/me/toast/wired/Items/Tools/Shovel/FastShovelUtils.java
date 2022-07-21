package me.toast.wired.Items.Tools.Shovel;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FastShovelUtils {

    public static ItemStack createFastShovel(){
        ItemStack fastShovel = new ItemStack(Material.NETHERITE_SHOVEL);
        ItemMeta meta = fastShovel.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Fast Shovel");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +6");
        TuffWoodenPickLore.add(ChatColor.LIGHT_PURPLE + "Rarity: MYTHIC");
        meta.setLore(TuffWoodenPickLore);
        meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        meta.setUnbreakable(true);
        meta.setCustomModelData(201);
        fastShovel.setItemMeta(meta);
        return fastShovel;
    }
}
