package me.austin.wired.Listeners.ServerListeners;

import me.austin.wired.Wired;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.scheduler.BukkitRunnable;



public class HealthChange implements Listener {


    @EventHandler
    public static void onHealthChange(EntityRegainHealthEvent event) {

        new BukkitRunnable() {

            @Override
            public void run() {
                if (event.getEntity() instanceof Player player) {
                    Player.Spigot spigot = player.spigot();
                    spigot.sendMessage(ChatMessageType.ACTION_BAR,
                            new TextComponent("❤" + ChatColor.RED + "" + ChatColor.BOLD + Math.round(player.getHealth())));
                }
            }


        }.runTaskTimer(Wired.getPlugin(), 0,5);
    }

}
