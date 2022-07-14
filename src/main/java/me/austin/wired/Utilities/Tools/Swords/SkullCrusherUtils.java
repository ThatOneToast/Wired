package me.austin.wired.Utilities.Tools.Swords;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SkullCrusherUtils {

    @EventHandler
    public static ItemStack createSkullCrusher(){
        ItemStack skullCrusher = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = skullCrusher.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Skull Crusher");
        List<String> skullCrusherLore = new ArrayList<String>();
        skullCrusherLore.add(ChatColor.DARK_GREEN + "Base Damage +10");
        skullCrusherLore.add(ChatColor.DARK_GREEN + "Base Attack Speed +0.5");
        skullCrusherLore.add(ChatColor.GOLD + "Rarity: LEGENDARY");
        meta.setLore(skullCrusherLore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);

        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_DAMAGE", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        AttributeModifier attackSpeed = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_SPEED", 0.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, attackSpeed);
        skullCrusher.setItemMeta(meta);
        return skullCrusher;
    }

}
