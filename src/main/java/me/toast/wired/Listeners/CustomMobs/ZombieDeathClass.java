package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.ChatColor;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;


public class ZombieDeathClass implements Listener {
    @EventHandler
    public static void onZombieDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof Zombie zombie) {
            if(zombie.getName().equals(ChatColor.GOLD + "[18] Zombie")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 95){
                    event.getDrops().clear();
                    zombie.getWorld().dropItem(zombie.getLocation(), HolyGrailFragments.createHolyGrailFragmentSurrounding());
                }
            }
            if(zombie.getName().equals(ChatColor.GOLD + "[21] Zombie")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 92){
                    event.getDrops().clear();
                    zombie.getWorld().dropItem(zombie.getLocation(), HolyGrailFragments.createHolyGrailFragmentSurrounding());
                }
            }
            if(zombie.getName().equals(ChatColor.RED + "[24] Zombie")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 88){
                    event.getDrops().clear();
                    zombie.getWorld().dropItem(zombie.getLocation(), HolyGrailFragments.createHolyGrailFragmentSurrounding());
                }
            }
            if(zombie.getName().equals(ChatColor.DARK_RED + "[30] Zombie")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 80){
                    event.getDrops().clear();
                    zombie.getWorld().dropItem(zombie.getLocation(), HolyGrailFragments.createHolyGrailFragmentSurrounding());
                }
            }
        }
    }
}
