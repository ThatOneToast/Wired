package me.toast.wired.Items.Armor.TankArmor;

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

public class IronPantsUtilsRare {

    public static ItemStack createTankPants(){
        ItemStack tankPants = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = tankPants.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Tank Pants");
        List<String> tankPantsLore = new ArrayList<>();
        tankPantsLore.add(ChatColor.DARK_GREEN + "Pants granting you a 35% increased max health");
        tankPantsLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_ARMOR", 2.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, armor);

        meta.setCustomModelData(915);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.setLore(tankPantsLore);
        tankPants.setItemMeta(meta);
        return tankPants;
    }
}
