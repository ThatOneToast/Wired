package me.austin.wired.Listeners.CustomMobs;

import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;


public class CreeperSpawnerClass implements Listener {

    static Wired plugin;

    public CreeperSpawnerClass(Wired plugin) {
        CreeperSpawnerClass.plugin = plugin;
    }

    @EventHandler
    public static void onCreeperSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Creeper creeper) {
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.PLAINS)) {
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                creeper.setExplosionRadius(3);
                creeper.setCustomName(ChatColor.GREEN + "[3] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(10);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.SNOWY_PLAINS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                creeper.setExplosionRadius(3);
                creeper.setCustomName(ChatColor.GREEN + "[3] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(10);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.SUNFLOWER_PLAINS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                creeper.setExplosionRadius(3);
                creeper.setCustomName(ChatColor.GREEN + "[3] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(10);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.DESERT)) {
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                creeper.setCustomName(ChatColor.GREEN + "[6] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(27);
                creeper.setExplosionRadius(6);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.BIRCH_FOREST)) {
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                creeper.setCustomName(ChatColor.GREEN + "[6] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(27);
                creeper.setExplosionRadius(6);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.FLOWER_FOREST)) {
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                creeper.setCustomName(ChatColor.GREEN + "[6] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(27);
                creeper.setExplosionRadius(6);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.STONY_SHORE)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                creeper.setCustomName(ChatColor.DARK_GREEN + "[9] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(44);
                creeper.setExplosionRadius(9);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.DARK_FOREST)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                creeper.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(44);
                creeper.setExplosionRadius(9);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.MANGROVE_SWAMP)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                creeper.setCustomName(ChatColor.DARK_GREEN + "[9] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(44);
                creeper.setExplosionRadius(9);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.FOREST)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                creeper.setCustomName(ChatColor.DARK_GREEN + "[9] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(44);
                creeper.setExplosionRadius(9);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.SWAMP)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                creeper.setCustomName(ChatColor.YELLOW + "[13] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(105);
                creeper.setExplosionRadius(13);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.STONY_PEAKS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                creeper.setCustomName(ChatColor.YELLOW + "[13] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(105);
                creeper.setExplosionRadius(13);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.MUSHROOM_FIELDS)) {
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                creeper.setCustomName(ChatColor.GOLD + "[15] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(145);
                creeper.setExplosionRadius(15);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.TAIGA)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                creeper.setCustomName(ChatColor.GOLD + "[15] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(145);
                creeper.setExplosionRadius(15);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.JUNGLE)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                creeper.setCustomName(ChatColor.GOLD + "[15] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(145);
                creeper.setExplosionRadius(15);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.SPARSE_JUNGLE)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                creeper.setCustomName(ChatColor.GOLD + "[15] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(145);
                creeper.setExplosionRadius(15);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.BAMBOO_JUNGLE)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                creeper.setCustomName(ChatColor.GOLD + "[18] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(170);
                creeper.setExplosionRadius(18);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_HILLS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                creeper.setCustomName(ChatColor.GOLD + "[18] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(170);
                creeper.setExplosionRadius(18);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.BEACH)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                creeper.setCustomName(ChatColor.GOLD + "[21] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(220);
                creeper.setExplosionRadius(21);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_GRAVELLY_HILLS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                creeper.setCustomName(ChatColor.GOLD + "[21] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(220);
                creeper.setExplosionRadius(21);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.MEADOW)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                creeper.setCustomName(ChatColor.RED + "[24] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(270);
                creeper.setExplosionRadius(24);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.BADLANDS)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                creeper.setCustomName(ChatColor.RED + "[24] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(270);
                creeper.setExplosionRadius(24);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_FOREST)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                creeper.setCustomName(ChatColor.DARK_RED + "[30] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(385);
                creeper.setExplosionRadius(30);
            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_SAVANNA)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                creeper.setCustomName(ChatColor.DARK_RED + "[30] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(385);
                creeper.setExplosionRadius(30);

            }
            if(creeper.getLocation().getBlock().getBiome().equals(Biome.SAVANNA)){
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(creeper.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                creeper.setCustomName(ChatColor.DARK_RED + "[30] creeper");
                creeper.setCustomNameVisible(true);
                creeper.setHealth(385);
                creeper.setExplosionRadius(30);

            }

        }
    }



}
