package me.toast.wired.Items.Armor.FishermensArmor;

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

public class HelmetRare {

    public static ItemStack createFishermensHelmet(){
        ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = helm.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Fishermens Hat");
        List<String> tankHelmetLore = new ArrayList<>();
        tankHelmetLore.add(ChatColor.DARK_GREEN + "Get Insane Luck With the Fishermans Hat");
        tankHelmetLore.add(ChatColor.AQUA + "Rarity: RARE");

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.max_health", 1.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        AttributeModifier armor = new AttributeModifier(UUID.randomUUID(), "GENERIC_LUCK", 2.75, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, armor);



        meta.setLore(tankHelmetLore);
        helm.setItemMeta(meta);
        return helm;
    }
}
