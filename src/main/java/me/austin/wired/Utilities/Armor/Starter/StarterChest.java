package me.austin.wired.Utilities.Armor.Starter;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StarterChest {

    public static ItemStack createTankChestplate(){
        ItemStack tankChestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = tankChestplate.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Starter Chestplate");
        List<String> tankChestplateLore = new ArrayList<String>();

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        meta.setLore(tankChestplateLore);
        tankChestplate.setItemMeta(meta);
        return tankChestplate;
    }
}
