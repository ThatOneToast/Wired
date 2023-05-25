package me.toast.wired.Listeners.CustomMobs;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;

public class HellSpawnClass implements Listener {

    @EventHandler
    public static void onZombieSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof PigZombie zombie) {
            Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            zombie.setCustomName(ChatColor.RED + "[35] PigZombie");
            zombie.setCustomNameVisible(true);
            zombie.setHealth(15);
        }
        if (event.getEntity() instanceof Blaze blaze) {
            Objects.requireNonNull(blaze.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(blaze.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            blaze.setCustomName(ChatColor.RED + "[35] Blaze");
            blaze.setCustomNameVisible(true);
            blaze.setHealth(15);
        }
        if (event.getEntity() instanceof WitherSkeleton WitherSkeleton) {
            Objects.requireNonNull(WitherSkeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(WitherSkeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            WitherSkeleton.setCustomName(ChatColor.RED + "[35] Wither Skeleton");
            WitherSkeleton.setCustomNameVisible(true);
            WitherSkeleton.setHealth(15);
        }

        if (event.getEntity() instanceof Ghast ghast) {
            Objects.requireNonNull(ghast.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(ghast.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            ghast.setCustomName(ChatColor.RED + "[35] Ghast");
            ghast.setCustomNameVisible(true);
            ghast.setHealth(15);
        }

        if (event.getEntity() instanceof Piglin piglin) {
            Objects.requireNonNull(piglin.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(piglin.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            piglin.setCustomName(ChatColor.RED + "[35] Piglin");
            piglin.setCustomNameVisible(true);
            piglin.setHealth(15);
        }

        if (event.getEntity() instanceof MagmaCube magmaCube) {
            Objects.requireNonNull(magmaCube.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(magmaCube.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            magmaCube.setCustomName(ChatColor.RED + "[35] Magma Cube");
            magmaCube.setCustomNameVisible(true);
            magmaCube.setHealth(15);
        }

        if(event.getEntity() instanceof PiglinBrute piglinBrute){
            Objects.requireNonNull(piglinBrute.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(360);
            Objects.requireNonNull(piglinBrute.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(26);
            piglinBrute.setCustomName(ChatColor.RED + "[35] Piglin Brute");
            piglinBrute.setCustomNameVisible(true);
            piglinBrute.setHealth(15);
        }


    }
}
