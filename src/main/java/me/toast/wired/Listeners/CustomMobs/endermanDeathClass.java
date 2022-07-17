package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Utilities.Other.HolyGrailFragments;
import org.bukkit.ChatColor;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class endermanDeathClass implements Listener {

    @EventHandler
    public static void onEndermanDeath(EntityDeathEvent event) {
        if (event.getEntity() instanceof Enderman enderman) {
            if(enderman.getName().equals(ChatColor.GOLD + "[18] enderman")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 95){
                    event.getDrops().clear();
                    enderman.getWorld().dropItem(enderman.getLocation(), HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
                }
            }
            if(enderman.getName().equals(ChatColor.GOLD + "[21] enderman")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 92){
                    event.getDrops().clear();
                    enderman.getWorld().dropItem(enderman.getLocation(), HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
                }
            }
            if(enderman.getName().equals(ChatColor.RED + "[24] enderman")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 88){
                    event.getDrops().clear();
                    enderman.getWorld().dropItem(enderman.getLocation(), HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
                }
            }
            if(enderman.getName().equals(ChatColor.DARK_RED + "[30] enderman")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 80){
                    event.getDrops().clear();
                    enderman.getWorld().dropItem(enderman.getLocation(), HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
                }
            }
            if(enderman.getName().equals(ChatColor.DARK_RED + "[70] enderman")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 65){
                    event.getDrops().clear();
                    enderman.getWorld().dropItem(enderman.getLocation(), HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
                }
            }
        }
    }
}
