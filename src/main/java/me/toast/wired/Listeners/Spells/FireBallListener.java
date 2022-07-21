package me.toast.wired.Listeners.Spells;

import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class FireBallListener implements Listener {

    @SuppressWarnings("unused")
    @EventHandler
    public static void onPlayerSpell(PlayerInteractEvent event){
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
                if((Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta())).getDisplayName().equals(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Fire Ball")){
                    if(Mana.getPlayerMana(event.getPlayer()) >= 35){
                        event.getPlayer().launchProjectile(Fireball.class);
                        Mana.removeMana(event.getPlayer(), 35);
                    }else{
                        event.getPlayer().sendMessage(ChatColor.RED + "You do not have enough mana to cast this spell!");
                        }

            }

        }
    }
    @EventHandler
    public static void onFireBallHit(ProjectileHitEvent event){
        if(event.getEntity().getType() == EntityType.FIREBALL){
            event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 4);
        }
    }

}
