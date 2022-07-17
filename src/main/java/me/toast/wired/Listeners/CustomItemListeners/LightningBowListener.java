package me.toast.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LightningBowListener implements Listener {

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {
        //check to see if it was shot by the Lightning bow
        if (e.getEntity().getShooter() instanceof Player p) {

            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Lightning Bow")) {

                Location location = e.getEntity().getLocation();
                p.getWorld().spawnEntity(location, EntityType.LIGHTNING);
            }
        }
    }


}

