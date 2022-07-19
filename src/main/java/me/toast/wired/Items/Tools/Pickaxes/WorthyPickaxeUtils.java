package me.toast.wired.Items.Tools.Pickaxes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class WorthyPickaxeUtils {

    public static ItemStack createWorthyPickaxe(){
        ItemStack WorthyPick = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta = WorthyPick.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Worthy Iron Pickaxe");
        List<String> TuffWoodenPickLore = new ArrayList<>();
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "Unbreaking +5");
        TuffWoodenPickLore.add(ChatColor.DARK_GREEN + "EFFICIENCY +4");
        TuffWoodenPickLore.add(ChatColor.AQUA + "Rarity: RARE");
        meta.setCustomModelData(503);
        meta.setLore(TuffWoodenPickLore);
        meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        WorthyPick.setItemMeta(meta);
        return WorthyPick;
    }
}
