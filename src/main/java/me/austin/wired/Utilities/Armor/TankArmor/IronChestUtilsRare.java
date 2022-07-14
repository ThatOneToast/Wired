package me.austin.wired.Utilities.Armor.TankArmor;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static me.austin.wired.Wired.getPlugin;

public class IronChestUtilsRare {

    public static ItemStack createTankChestplate(){
        ItemStack tankChestplate = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = tankChestplate.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Tank Chestplate");
        List<String> tankChestplateLore = new ArrayList<String>();
        tankChestplateLore.add(ChatColor.DARK_GREEN + "Chestplate granting you a 35% increased max health");
        tankChestplateLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 7.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);


        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.setLore(tankChestplateLore);
        tankChestplate.setItemMeta(meta);
        return tankChestplate;
    }
}
