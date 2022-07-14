package me.austin.wired.Utilities.Armor.FishermensArmor;

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

public class PantsRare {

    public static ItemStack createFishermensPants(){
        ItemStack pants = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = pants.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "Fishermens Pants");
        List<String> tankPantsLore = new ArrayList<>();
        tankPantsLore.add(ChatColor.DARK_GREEN + "Get Insane Luck With the Fishermans Pants");
        tankPantsLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 1.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_LUCK", 2.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, armor);

        meta.setLore(tankPantsLore);
        pants.setItemMeta(meta);
        return pants;
    }
}
