package me.austin.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class FeederListener implements Listener {

    @EventHandler
    public void onFeederClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "" + ChatColor.BOLD + "Feeder")) {
                if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                    if(p.getFoodLevel() < 20){
                        p.setSaturation(20);
                        p.setFoodLevel(20);
                    }else{
                        p.sendMessage(ChatColor.RED + "You are already full food!");
                    }
                }
            }

        }
    }
}
