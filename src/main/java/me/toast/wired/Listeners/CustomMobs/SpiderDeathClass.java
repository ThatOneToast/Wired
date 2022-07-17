package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Utilities.Other.ManaFragments;
import org.bukkit.ChatColor;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class SpiderDeathClass implements Listener {
    @EventHandler
    public static void onSpiderDeath(EntityDeathEvent event){
        if(event.getEntity() instanceof Spider spider){
            if(spider.getName().equals(ChatColor.DARK_RED + "[30] spider")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 80){
                    event.getDrops().clear();
                    spider.getWorld().dropItem(spider.getLocation(), ManaFragments.createManaFragments());
                }
            }
            if(spider.getName().equals(ChatColor.RED + "[24] spider")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 86){
                    event.getDrops().clear();
                    spider.getWorld().dropItem(spider.getLocation(), ManaFragments.createManaFragments());
                }
            }
            if(spider.getName().equals(ChatColor.GOLD + "[21] spider")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 92){
                    event.getDrops().clear();
                    spider.getWorld().dropItem(spider.getLocation(), ManaFragments.createManaFragments());
                }
            }
            if(spider.getName().equals(ChatColor.GOLD + "[18] spider")){
                //get a random number out of 100
                double random = Math.random() * 100;
                if(random >= 96){
                    event.getDrops().clear();
                    spider.getWorld().dropItem(spider.getLocation(), ManaFragments.createManaFragments());
                }
            }
        }

    }
}
