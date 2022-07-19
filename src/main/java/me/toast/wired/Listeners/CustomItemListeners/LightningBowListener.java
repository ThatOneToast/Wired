package me.toast.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class LightningBowListener implements Listener {

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {
        //check to see if it was shot by the Lightning bow
        if (e.getEntity().getShooter() instanceof Player p) {

            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

            if ((itemInMainHand.getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Lightning Bow")) {

                Location location = e.getEntity().getLocation();
                p.getWorld().spawnEntity(location, EntityType.LIGHTNING);
            }
        }
    }


}

