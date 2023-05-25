package me.toast.wired.Listeners.CustomMobs;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WitherSpawnDeathClass implements Listener {

    @EventHandler
    public static void onWitherSpawn(CreatureSpawnEvent event){
        if(event.getEntity() instanceof Wither wither){
            wither.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20, 255, false, false));

            if(wither.getLocation().getBlock().getBiome().equals(Biome.BASALT_DELTAS)){
                wither.setCustomName(ChatColor.RED + "[35] Wither");
                wither.setCustomNameVisible(true);
                wither.setHealth(2000);
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(36);
            }

            if(wither.getLocation().getBlock().getBiome().equals(Biome.CRIMSON_FOREST)){
                wither.setCustomName(ChatColor.RED + "[35] Wither");
                wither.setCustomNameVisible(true);
                wither.setHealth(2000);
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(36);
            }

            if(wither.getLocation().getBlock().getBiome().equals(Biome.NETHER_WASTES)){
                wither.setCustomName(ChatColor.RED + "[35] Wither");
                wither.setCustomNameVisible(true);
                wither.setHealth(2000);
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(36);
            }

            if(wither.getLocation().getBlock().getBiome().equals(Biome.SOUL_SAND_VALLEY)){
                wither.setCustomName(ChatColor.RED + "[35] Wither");
                wither.setCustomNameVisible(true);
                wither.setHealth(2000);
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(36);
            }

            if(wither.getLocation().getBlock().getBiome().equals(Biome.WARPED_FOREST)){
                wither.setCustomName(ChatColor.RED + "[35] Wither");
                wither.setCustomNameVisible(true);
                wither.setHealth(2000);
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(36);
            }


            if(wither.getLocation().getBlock().getBiome().equals(Biome.THE_END)){
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(4000);
                wither.setHealth(4000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(72);
                wither.setCustomName(ChatColor.RED + "[70] Wither");
            }
            if(wither.getLocation().getBlock().getBiome().equals(Biome.END_HIGHLANDS)){
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(4000);
                wither.setHealth(4000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(72);
                wither.setCustomName(ChatColor.RED + "[70] Wither");
            }
            if(wither.getLocation().getBlock().getBiome().equals(Biome.END_BARRENS)){
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(4000);
                wither.setHealth(4000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(72);
                wither.setCustomName(ChatColor.RED + "[70] Wither");
            }
            if(wither.getLocation().getBlock().getBiome().equals(Biome.END_MIDLANDS)){
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(4000);
                wither.setHealth(4000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(72);
                wither.setCustomName(ChatColor.RED + "[70] Wither");
            }
            if(wither.getLocation().getBlock().getBiome().equals(Biome.SMALL_END_ISLANDS)){
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(4000);
                wither.setHealth(4000);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(72);
                wither.setCustomName(ChatColor.RED + "[70] Wither");
            }
            else {
                wither.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(950);
                wither.setHealth(950);
                wither.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(22);
                wither.setCustomName(ChatColor.RED + "[25] Wither");
            }

        }
    }
}
