package me.toast.wired.Items.Tools.Swords;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MonsterSlayerUtils implements Listener {

    @EventHandler
    public static ItemStack createMonsterSlayer(){
        ItemStack MonsterSlayer = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = MonsterSlayer.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.GOLD + "Monster Slayer");
        List<String> skullCrusherLore = new ArrayList<>();
        skullCrusherLore.add(ChatColor.DARK_GREEN + "Smite +10");
        skullCrusherLore.add(ChatColor.DARK_GREEN + "Base Attack Speed +0.5");
        skullCrusherLore.add(ChatColor.GOLD + "Rarity: LEGENDARY");
        meta.setLore(skullCrusherLore);
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
        meta.setCustomModelData(101);

        AttributeModifier attackSpeed = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_SPEED", 0.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, attackSpeed);
        AttributeModifier baseDamage = new AttributeModifier(UUID.randomUUID(), "GENERIC_ATTACK_DAMAGE", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, baseDamage);
        MonsterSlayer.setItemMeta(meta);
        return MonsterSlayer;
    }

}
