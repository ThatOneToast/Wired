package me.toast.wired.Listeners.CustomItemListeners;

import me.toast.wired.PlayerUtils.Mana.Mana;
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
                if(Mana.getPlayerMana(p) >= 10){
                    if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                        Mana.removeMana(p, 10);
                        if(p.getFoodLevel() < 20){
                            p.setSaturation(20);
                            p.setFoodLevel(20);
                        }else{
                            p.sendMessage(ChatColor.RED + "You are already full food!");
                        }
                }else{
                    p.sendMessage(ChatColor.RED + "You do not have enough mana to use this item.");
                    }

                }
            }

        }
    }
}
