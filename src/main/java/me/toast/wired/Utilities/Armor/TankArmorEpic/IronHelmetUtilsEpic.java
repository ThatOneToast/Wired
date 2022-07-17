package me.toast.wired.Utilities.Armor.TankArmorEpic;

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

public class IronHelmetUtilsEpic {

    public static ItemStack createIronHelmet(){
        ItemStack tankHelmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = tankHelmet.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Helm Epic");
        List<String> tankHelmetLore = new ArrayList<>();
        tankHelmetLore.add(ChatColor.DARK_GREEN + "Helmet granting you a 35% increased max health");
        tankHelmetLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 2.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);



        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.setUnbreakable(true);
        meta.setLore(tankHelmetLore);
        tankHelmet.setItemMeta(meta);
        return tankHelmet;
    }
}
