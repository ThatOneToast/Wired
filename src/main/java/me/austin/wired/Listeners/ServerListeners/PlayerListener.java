package me.austin.wired.Listeners.ServerListeners;

import me.austin.wired.Wired;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Objects;
import java.util.UUID;

public class PlayerListener implements Listener {
    private final Wired plugin;
    public PlayerListener(Wired plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        if(!event.getFrom().getBlock().equals(Objects.requireNonNull(event.getTo()).getBlock())){
            Player player = event.getPlayer();
            UUID id = player.getUniqueId();
            if(plugin.isQued(id)){
                plugin.cancelQue(id);
            }
        }
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event){
        if(event.getEntity() instanceof Player player){
            UUID id = player.getUniqueId();
            if(plugin.isQued(id)){
                plugin.cancelQue(id);
            }
        }
    }


}
