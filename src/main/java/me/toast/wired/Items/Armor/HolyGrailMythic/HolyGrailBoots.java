package me.toast.wired.Items.Armor.HolyGrailMythic;

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

public class HolyGrailBoots {


    public static ItemStack createHolyGrailBoots(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Holy Grail Boots");
        List<String> itemLore = new ArrayList<>();
        itemLore.add(ChatColor.DARK_GREEN + "These Shoes is made of pure holy grail.");
        itemLore.add(ChatColor.LIGHT_PURPLE + "Rarity: Mythic");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 30, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 20, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);


        meta.addEnchant(Enchantment.DURABILITY, 8, true);
        meta.setLore(itemLore);
        item.setItemMeta(meta);
        return item;
    }

}
