package me.austin.wired.Listeners.CustomItemListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import static me.austin.wired.Listeners.ServerListeners.CombatLog.incombat;

public class FlyingFeatherListener implements Listener {

    @EventHandler
    public void onFeatherClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying Feather")) {
                if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                    if(!incombat.contains(p.getName())){
                        e.getPlayer().setAllowFlight(true);
                        e.getPlayer().setFlying(true);
                        e.getPlayer().sendMessage(ChatColor.GREEN + "You are now flying!");
                    }
                    if(incombat.contains(p.getName())){
                        e.getPlayer().sendMessage(ChatColor.RED + "You can't fly because you are in combat!");
                    }
                }
                //p.sendMessage(ChatColor.RED + "You cannot use this item!" + ChatColor.BOLD + "" + ChatColor.GOLD + " [Under Construction]");
            }


        }

    }

}