package me.toast.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;

public class TeleportBowListener implements Listener {

    @EventHandler
    public void onArrowShoot(ProjectileLaunchEvent e) {

        if (e.getEntity().getShooter() instanceof Player p) {
            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Teleport Bow")) {
                e.getEntity().setGlowing(true);
            }
            }
        }

            
    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {


        if (e.getEntity().getShooter() instanceof Player p) {

            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Teleport Bow")) {

                Location location = e.getEntity().getLocation();
                if(e.getEntity().isGlowing()){
                    p.teleport(location);
                    p.getWorld().playSound(location, Sound.ENTITY_ENDERMAN_TELEPORT, (float)0.25, 1);
                    p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 1));
                }
            }

        }
    }


    
}

