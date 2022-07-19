package me.toast.wired.Items.Armor.TraversalArmorCommon;

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

public class LeatherHelmetUtilsCommon {

    public static ItemStack createLeatherHelmet(){
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = helmet.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setDisplayName(ChatColor.GRAY + "Traversal Helmet");
        lore.add(ChatColor.DARK_GREEN + "Gives you the ability to walk and run faster");
        lore.add(ChatColor.DARK_GREEN + "SPEED +0.0025");
        lore.add(ChatColor.GRAY + "RARITY: COMMON");


        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "GENERIC_MOVEMENT_SPEED", 0.0025, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        meta.setCustomModelData(917);
        meta.setLore(lore);
        helmet.setItemMeta(meta);
        return helmet;
    }
}
