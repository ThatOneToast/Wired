package me.toast.wired.Listeners.ServerListeners;

import me.toast.wired.PlayerUtils.Mana.Mana;
import me.toast.wired.Wired;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class ManaHealthChange implements Listener {

    @EventHandler
    public static void onHealthChange(EntityRegainHealthEvent event){
        if(event.getEntity() instanceof Player player) {

            new BukkitRunnable() {
                @Override
                public void run() {
                    Player.Spigot spigot = player.spigot();
                    spigot.sendMessage(ChatMessageType.ACTION_BAR,
                            (new TextComponent("❤" + ChatColor.RED + "" + ChatColor.BOLD + Math.round(player.getHealth()) + " " +
                                    ChatColor.AQUA + "\uD83E\uDDEA" + ChatColor.BOLD + Mana.getPlayerMana(player))));

                }


            }.runTaskTimer(Wired.getPlugin(), 0, 20);




            }

        }

    }
