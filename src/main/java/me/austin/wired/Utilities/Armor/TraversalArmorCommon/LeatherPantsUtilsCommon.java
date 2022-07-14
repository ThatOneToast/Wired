package me.austin.wired.Utilities.Armor.TraversalArmorCommon;

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

public class LeatherPantsUtilsCommon {

    public static ItemStack createLeatherPants(){
        ItemStack pants = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = pants.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setDisplayName(ChatColor.GRAY + "Traversal Pants");
        lore.add(ChatColor.DARK_GREEN + "Gives you the ability to walk and run faster");
        lore.add(ChatColor.DARK_GREEN + "SPEED +0.0025");
        lore.add(ChatColor.GRAY + "RARITY: COMMON");


        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "GENERIC_MOVEMENT_SPEED", 0.0025, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, speed);

        meta.setLore(lore);
        pants.setItemMeta(meta);
        return pants;


    }
}
