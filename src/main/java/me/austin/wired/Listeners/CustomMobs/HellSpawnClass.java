package me.austin.wired.Listeners.CustomMobs;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;

public class HellSpawnClass implements Listener {

    @EventHandler
    public static void onZombieSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof PigZombie zombie) {
            Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
            Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(22);
            zombie.setCustomName(ChatColor.GOLD + "[18] Zombie Pigmen");
            zombie.setCustomNameVisible(true);
            zombie.setHealth(10);
        }
        if (event.getEntity() instanceof Enderman enderman) {
            Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
            Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(22);
            enderman.setCustomName(ChatColor.GOLD + "[18] Enderman");
            enderman.setCustomNameVisible(true);
            enderman.setHealth(10);
        }
        if(event.getEntity() instanceof Blaze blaze){
            Objects.requireNonNull(blaze.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
            Objects.requireNonNull(blaze.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(22);
            blaze.setCustomName(ChatColor.GOLD + "[18] Blaze");
            blaze.setCustomNameVisible(true);
            blaze.setHealth(10);
        }
        if(event.getEntity() instanceof WitherSkeleton WitherSkeleton){
            Objects.requireNonNull(WitherSkeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
            Objects.requireNonNull(WitherSkeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(22);
            WitherSkeleton.setCustomName(ChatColor.GOLD + "[18] Wither Skeleton");
            WitherSkeleton.setCustomNameVisible(true);
            WitherSkeleton.setHealth(10);
        }

    }
}
