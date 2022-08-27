package me.toast.wired.Listeners.CustomMobs;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Pillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;

public class PillagerSpawn implements Listener {

    @EventHandler
    public static void onPillagerSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Pillager pillager) {
            pillager.setCustomName(ChatColor.DARK_RED + "[30] Pillager");
            pillager.setCustomNameVisible(true);
            Objects.requireNonNull(pillager.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
            pillager.setHealth(385);
            Objects.requireNonNull(pillager.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);

        }
    }

}
