package me.austin.wired.Utilities.Armor.FishermensArmor;

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

public class BootsRare {

    public static ItemStack createFishermensBoot(){
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = boots.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Fishermens Boots");
        List<String> tankBootsLore = new ArrayList<>();
        tankBootsLore.add(ChatColor.DARK_GREEN + "Get Insane Luck With the Fishermans Boots");
        tankBootsLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 1.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_LUCK", 2.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, armor);

        meta.setLore(tankBootsLore);
        boots.setItemMeta(meta);
        return boots;
    }
}
