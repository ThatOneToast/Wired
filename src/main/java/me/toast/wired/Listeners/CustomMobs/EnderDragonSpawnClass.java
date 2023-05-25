package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Items.Ores.HolyGrailFragments;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class EnderDragonSpawnClass implements Listener {
    @EventHandler
    public static void onEnderDragonSpawn(CreatureSpawnEvent event){
        if(event.getEntity() instanceof EnderDragon enderdragon){
            if(enderdragon.getLocation().getBlock().getBiome().equals(Biome.THE_END)){
                Objects.requireNonNull(enderdragon.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(4000);
                enderdragon.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 255, false, false));
                enderdragon.setCustomName(ChatColor.DARK_RED + "[140] EnderDragon");
                enderdragon.setCustomNameVisible(true);
                enderdragon.setHealth(2048);

            }
        }
    }

    // if the Ender Dragon damages a player, multiply that damage by 4
    @EventHandler
    public static void onEnderDragonDamage(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof EnderDragon enderdragon){
            if(event.getDamager() instanceof org.bukkit.entity.Player player){
                event.setDamage(event.getDamage() * 4);
            }
        }
    }

}
