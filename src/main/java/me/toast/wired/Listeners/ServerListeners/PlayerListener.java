package me.toast.wired.Listeners.ServerListeners;

import me.toast.wired.PlayerUtils.Mana.Energy;
import me.toast.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerEvent;
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
    public void onPlayerMove(PlayerEvent event) {
        if (event instanceof Player player){
            if(player.isSprinting()){
                // check if the player has enough energy to sprint
                if(Energy.ENERGY_LEVEL.get(player) < 0.5){
                    player.setSprinting(false);
                    player.sendMessage(ChatColor.RED + "--- You're exhausted! ---");
                } else {
                    Energy.removeEnergy(player, 0.5);
                }
            }
            else if (player.isSneaking()) {
                // check if the player has enough energy to sneak
                if(Energy.ENERGY_LEVEL.get(player) < 0.5){
                    player.setSneaking(false);
                    player.sendMessage(ChatColor.RED + "--- Being sneaky can hurt your back. ---");
                } else {
                    Energy.removeEnergy(player, 0.175);
                }
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
