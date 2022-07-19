package me.toast.wired.Listeners.Spells;

import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ManaRestoreListener implements Listener {

    @EventHandler
    public void onManaRestore(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Mana Restore")) {
                if(Mana.getPlayerMana(player) < 50){
                    player.setHealth(player.getHealth() - 45);
                    Mana.addMana(player, Mana.getPlayerMana(player) + 30);
                }else{
                    player.sendMessage(ChatColor.RED + "You do not need to restore mana!");
                }
                if(player.isDead()){
                    Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has died! due to mana restore!");
                }

        }
    }
}
