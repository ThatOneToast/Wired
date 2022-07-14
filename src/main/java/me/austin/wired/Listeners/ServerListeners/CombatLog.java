package me.austin.wired.Listeners.ServerListeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;
import java.util.Objects;

public class CombatLog implements Listener {

    public static ArrayList<String> incombat = new ArrayList<>();



    @EventHandler
    public void playerLog(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player player && event.getEntity() instanceof Player target){
            if(!incombat.contains(player.getName()) && !incombat.contains(target.getName())){
                incombat.add(player.getName());
                incombat.add(target.getName());
                player.sendMessage(ChatColor.RED + "You have logged combat with " + "" + ChatColor.GOLD + target.getName());
                target.sendMessage( ChatColor.GOLD + player.getName() + ChatColor.RED + " has logged combat with you");
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Objects.requireNonNull(Bukkit.getPluginManager().getPlugin("Wired")), () -> {
                    incombat.remove(player.getName());
                    incombat.remove(target.getName());
                    player.sendMessage(ChatColor.GREEN + " You are no longer in combat");
                    target.sendMessage(ChatColor.GREEN + " You are no longer in combat");
                }, 20 * 60);
            }

            if (incombat.contains(player.getName()) && incombat.contains(target.getName())){
                player.setAllowFlight(false);
                target.setAllowFlight(false);
            }
        }

    }
    @EventHandler
    public void onCombatQuit(PlayerQuitEvent event){
        if(incombat.contains(event.getPlayer().getName())){
            event.getPlayer().damage(1000);
            Bukkit.broadcastMessage(ChatColor.GOLD + event.getPlayer().getName() + "" + ChatColor.RED + " has left While in combat");
        }
    }
}
