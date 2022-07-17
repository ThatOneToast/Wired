package me.toast.wired.Listeners.ServerListeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if(event.getEntity().getKiller() != null) {
            Player killer = event.getEntity().getKiller();
            killer.sendMessage(ChatColor.RED + "You have killed " + event.getEntity().getName());
        }
            event.setDeathMessage(ChatColor.GOLD + event.getEntity().getKiller().getName() + " has killed " + event.getEntity().getName() +
                    "." +
                    ChatColor.RED + event.getEntity().getName() + " has died! " +
                            ChatColor.BOLD + ChatColor.YELLOW +
                            "DeathCords: " + "" + ChatColor.GREEN + ChatColor.BOLD + "" +
                            " X: " + event.getEntity().getLocation().getBlockX() +
                            " Y: " + event.getEntity().getLocation().getBlockY() +
                            " Z: " + event.getEntity().getLocation().getBlockZ()
            );

        Player player = event.getEntity().getPlayer();
        assert player != null;
        event.setDroppedExp(0);
        event.setKeepLevel(true);
        int level = player.getLevel();
        if(level >= 30){
            player.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "You can teleport to your death. with /death");
        }else{
            player.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "You have died your death cords have been shown publicly, Better get to them fast!");
        }

    }

}
