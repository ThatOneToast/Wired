package me.toast.wired.Items.Tools.Swords;

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
        ItemStack HardenedIronSword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = HardenedIronSword.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Hardened Netherite Sword");
        List<String> HardenedIronSwordLore = new ArrayList<>();
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Base Damage +15");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Base Attack Speed +2");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Smite +17");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Sharpness +17");
        HardenedIronSwordLore.add(ChatColor.DARK_GREEN + "Looting +12");
        HardenedIronSwordLore.add(ChatColor.LIGHT_PURPLE + "Rarity: MYTHIC");
        meta.setLore(HardenedIronSwordLore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 17, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 12, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 17, true);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 17, true);
        meta.setCustomModelData(102);

        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_DAMAGE", 15, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        AttributeModifier attackSpeed = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_SPEED", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, attackSpeed);
        HardenedIronSword.setItemMeta(meta);
        return HardenedIronSword;
    }
}
