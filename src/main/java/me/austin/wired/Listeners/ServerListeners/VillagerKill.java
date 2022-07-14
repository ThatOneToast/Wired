package me.austin.wired.Listeners.ServerListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class VillagerKill implements Listener {
    @EventHandler
    public static void onVillagerKill(EntityDeathEvent event){
        if(event.getEntity() instanceof Villager){
            Player killer = event.getEntity().getKiller();
            ItemStack Villager = new ItemStack(Material.VILLAGER_SPAWN_EGG);
            assert killer != null;
            killer.getInventory().addItem(Villager);
        }
    }
}

