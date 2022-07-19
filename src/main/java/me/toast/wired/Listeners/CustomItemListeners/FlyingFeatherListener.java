package me.toast.wired.Listeners.CustomItemListeners;

import me.toast.wired.PlayerUtils.Mana.Mana;
import me.toast.wired.Listeners.ServerListeners.CombatLog;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class FlyingFeatherListener implements Listener {

    @EventHandler
    public void onFeatherClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying Feather")) {
                if (Mana.getPlayerMana(p) >= 1) {
                    if (e.getAction() == Action.RIGHT_CLICK_AIR) {
                        if (!CombatLog.incombat.contains(p.getName())) {
                            if (p.isFlying()) {
                                p.sendMessage(ChatColor.RED + "You are already flying!");
                            } else {
                                e.getPlayer().setAllowFlight(true);
                                e.getPlayer().setFlying(true);
                                e.getPlayer().sendMessage(ChatColor.GREEN + "You are now flying!");
                                //stop the bukkit runnable

                            }
                            if (CombatLog.incombat.contains(p.getName())) {
                                e.getPlayer().sendMessage(ChatColor.RED + "You can't fly because you are in combat!");
                            }
                        }
                    }
                }
            }

        }

    }
}