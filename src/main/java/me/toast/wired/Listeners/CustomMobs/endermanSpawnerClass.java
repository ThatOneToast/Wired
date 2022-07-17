package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Enderman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;


public class endermanSpawnerClass implements Listener {

    static Wired plugin;

    public endermanSpawnerClass(Wired plugin) {
        endermanSpawnerClass.plugin = plugin;
    }

    @EventHandler
    public static void onEndermanSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Enderman enderman) {
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.PLAINS)) {
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                enderman.setCustomName(ChatColor.GREEN + "[3] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(10);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SNOWY_PLAINS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                enderman.setCustomName(ChatColor.GREEN + "[3] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(10);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SUNFLOWER_PLAINS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                enderman.setCustomName(ChatColor.GREEN + "[3] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(10);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.DESERT)) {
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                enderman.setCustomName(ChatColor.GREEN + "[6] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(27);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.BIRCH_FOREST)) {
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                enderman.setCustomName(ChatColor.GREEN + "[6] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(27);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.FLOWER_FOREST)) {
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                enderman.setCustomName(ChatColor.GREEN + "[6] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(27);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.STONY_SHORE)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                enderman.setCustomName(ChatColor.DARK_GREEN + "[9] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(44);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.DARK_FOREST)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                enderman.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(44);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.FOREST)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                enderman.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(44);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.MANGROVE_SWAMP)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                enderman.setCustomName(ChatColor.DARK_GREEN + "[9] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(44);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SWAMP)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                enderman.setCustomName(ChatColor.YELLOW + "[13] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(105);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.STONY_PEAKS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                enderman.setCustomName(ChatColor.YELLOW + "[13] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(105);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.MUSHROOM_FIELDS)) {
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                enderman.setCustomName(ChatColor.GOLD + "[15] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(145);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.TAIGA)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                enderman.setCustomName(ChatColor.GOLD + "[15] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(145);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.JUNGLE)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                enderman.setCustomName(ChatColor.GOLD + "[15] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(145);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SPARSE_JUNGLE)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                enderman.setCustomName(ChatColor.GOLD + "[15] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(145);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.BAMBOO_JUNGLE)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                enderman.setCustomName(ChatColor.GOLD + "[18] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(170);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_HILLS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                enderman.setCustomName(ChatColor.GOLD + "[18] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(170);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.BEACH)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                enderman.setCustomName(ChatColor.GOLD + "[21] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(220);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_GRAVELLY_HILLS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                enderman.setCustomName(ChatColor.GOLD + "[21] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(220);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.MEADOW)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                enderman.setCustomName(ChatColor.RED + "[24] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(270);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.BADLANDS)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                enderman.setCustomName(ChatColor.RED + "[24] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(270);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_FOREST)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                enderman.setCustomName(ChatColor.DARK_RED + "[30] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(385);
            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_SAVANNA)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                enderman.setCustomName(ChatColor.DARK_RED + "[30] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(385);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SAVANNA)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                enderman.setCustomName(ChatColor.DARK_RED + "[30] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(385);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                enderman.setCustomName(ChatColor.DARK_RED + "[30] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(385);

            }
            if(enderman.getLocation().getBlock().getBiome().equals(Biome.THE_END)){
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(575);
                Objects.requireNonNull(enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(75);
                enderman.setCustomName(ChatColor.DARK_RED + "[70] enderman");
                enderman.setCustomNameVisible(true);
                enderman.setHealth(385);

            }

        }
    }



}
