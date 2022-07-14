package me.austin.wired.Utilities.Tools.Swords;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HardenedIronSwordUtils {

    public static ItemStack CreateHardenedIronSword(){
        ItemStack HardenedIronSword = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = HardenedIronSword.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Hardened Iron Sword");
        List<String> HardenedIronSwordLore = new ArrayList<>();
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Base Damage +2");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Sharpness +2");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Looting +5");
        HardenedIronSwordLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");
        meta.setLore(HardenedIronSwordLore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);

        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_DAMAGE", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        HardenedIronSword.setItemMeta(meta);
        return HardenedIronSword;
    }
}
