package me.toast.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class PoisonBowListener implements Listener {


    @EventHandler
    public void onArrowHit(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();

        if (damager instanceof Arrow) { // check if the damager is an arrow


            Entity entityHit = event.getEntity();
            if (entityHit instanceof Player playerHit) {
                Arrow arrow = (Arrow) damager;
                if (arrow.getShooter() instanceof Player player) {
                    if ((player.getInventory().getItemInMainHand().getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Poison Bow")) {
                        playerHit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20*7, 20));
                        playerHit.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20*7, 220));
                    }


                }

            }
        }
    }
}




