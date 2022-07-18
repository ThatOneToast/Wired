package me.toast.wired.Listeners.CustomItemListeners;

import me.toast.wired.Utilities.PlayerUtils.Mana;
import me.toast.wired.Wired;
import me.toast.wired.Listeners.ServerListeners.CombatLog;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

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

                                new BukkitRunnable() {
                                    @Override
                                    public void run() {
                                        if (e.getPlayer().isFlying()) {
                                            Mana.removeMana(p, 1);
                                            if (Mana.getPlayerMana(p) <= 1) {
                                                Bukkit.getScheduler().cancelTask(this.getTaskId());
                                                p.setFlying(false);
                                                p.setAllowFlight(false);
                                                p.sendMessage(ChatColor.RED + "You are out of mana!");
                                            }
                                        }
                                        else{
                                            Bukkit.getScheduler().cancelTask(this.getTaskId());
                                        }
                                    }
                                }.runTaskTimer(Wired.getPlugin(), 0, 20);
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