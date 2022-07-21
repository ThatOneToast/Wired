package me.toast.wired.Items.Armor.TankArmorEpic;

import me.toast.wired.Items.Enchantments.Enchantments;
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

public class IronPantsUtilsEpic {

    public static ItemStack createTankPants(){
        ItemStack tankPants = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = tankPants.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Tank Pants Epic");
        List<String> tankPantsLore = new ArrayList<>();
        tankPantsLore.add(ChatColor.DARK_GREEN + "Pants granting you a 35% increased max health");
        tankPantsLore.add(ChatColor.DARK_PURPLE + "Armor: 7");
        tankPantsLore.add(ChatColor.DARK_PURPLE + "Rarity: EPIC");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        meta.setCustomModelData(911);
        meta.addEnchant(Enchantments.ARMOR, 7, true);
        meta.setUnbreakable(true);
        meta.setLore(tankPantsLore);
        tankPants.setItemMeta(meta);
        return tankPants;
    }
}
