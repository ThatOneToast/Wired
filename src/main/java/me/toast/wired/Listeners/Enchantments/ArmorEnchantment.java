package me.toast.wired.Listeners.Enchantments;

import me.toast.wired.Items.Enchantments.Enchantments;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Objects;

public class ArmorEnchantment implements Listener {

    @EventHandler
    public static void onEntityHit(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player player) {

            //START ARMOR ENCHANTMENT
            if (player.getInventory().getHelmet() != null) {
                if (Objects.requireNonNull(player.getInventory().getHelmet().getItemMeta()).hasEnchant(Enchantments.ARMOR)) {
                    event.setDamage(event.getDamage() - (event.getDamage() * (player.getInventory().getHelmet().getItemMeta().getEnchantLevel(Enchantments.ARMOR) * 0.05)));
                }
            }
            if (player.getInventory().getChestplate() != null) {
                if (Objects.requireNonNull(player.getInventory().getChestplate().getItemMeta()).hasEnchant(Enchantments.ARMOR)) {
                    event.setDamage(event.getDamage() - (event.getDamage() * (player.getInventory().getChestplate().getItemMeta().getEnchantLevel(Enchantments.ARMOR) * 0.05)));
                }
            }
            if (player.getInventory().getLeggings() != null) {
                if (Objects.requireNonNull(player.getInventory().getLeggings().getItemMeta()).hasEnchant(Enchantments.ARMOR)) {
                    event.setDamage(event.getDamage() - (event.getDamage() * (player.getInventory().getLeggings().getItemMeta().getEnchantLevel(Enchantments.ARMOR) * 0.05)));
                }
            }
            if (player.getInventory().getBoots() != null) {
                if (Objects.requireNonNull(player.getInventory().getBoots().getItemMeta()).hasEnchant(Enchantments.ARMOR)) {
                    event.setDamage(event.getDamage() - (event.getDamage() * (player.getInventory().getBoots().getItemMeta().getEnchantLevel(Enchantments.ARMOR) * 0.05)));
                }
            }
            //END ARMOR ENCHANTMENT







        }

    }
}