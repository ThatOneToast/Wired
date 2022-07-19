package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Wired;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;


public class SkeletonSpawnClass implements Listener {

    static Wired plugin;

    public SkeletonSpawnClass(Wired plugin) {
        SkeletonSpawnClass.plugin = plugin;
    }

    @EventHandler
    public static void onSkeletonSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Skeleton) {
            event.setCancelled(true);

        }
    }



}
