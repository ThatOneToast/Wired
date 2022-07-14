package me.austin.wired.Listeners.CustomMobs;

import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;


public class ZombieSpawnClass implements Listener {

    static Wired plugin;

    public ZombieSpawnClass(Wired plugin) {
        ZombieSpawnClass.plugin = plugin;
    }

    @EventHandler
    public static void onZombieSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Zombie zombie) {
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.PLAINS)) {
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                zombie.setCustomName(ChatColor.GREEN + "[3] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(10);
                
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.SNOWY_PLAINS)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                zombie.setCustomName(ChatColor.GREEN + "[3] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(10);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.SUNFLOWER_PLAINS)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                zombie.setCustomName(ChatColor.GREEN + "[3] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(10);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.DESERT)) {
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                zombie.setCustomName(ChatColor.GREEN + "[6] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(27);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.BIRCH_FOREST)) {
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                zombie.setCustomName(ChatColor.GREEN + "[6] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(27);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.FLOWER_FOREST)) {
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                zombie.setCustomName(ChatColor.GREEN + "[6] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(27);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.STONY_SHORE)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(43);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                zombie.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(43);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.DARK_FOREST)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(43);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                zombie.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(43);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.MANGROVE_SWAMP)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(43);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                zombie.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(43);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.SWAMP)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                zombie.setCustomName(ChatColor.YELLOW + "[13] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(105);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.STONY_PEAKS)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                zombie.setCustomName(ChatColor.YELLOW + "[13] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(105);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.MUSHROOM_FIELDS)) {
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                zombie.setCustomName(ChatColor.GOLD + "[15] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(145);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.TAIGA)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                zombie.setCustomName(ChatColor.GOLD + "[15] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(145);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.JUNGLE)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                zombie.setCustomName(ChatColor.GOLD + "[15] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(145);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.SPARSE_JUNGLE)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                zombie.setCustomName(ChatColor.GOLD + "[15] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(145);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.BAMBOO_JUNGLE)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                zombie.setCustomName(ChatColor.GOLD + "[18] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(170);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_HILLS)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                zombie.setCustomName(ChatColor.GOLD + "[18] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(170);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.BEACH)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                zombie.setCustomName(ChatColor.GOLD + "[21] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(220);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_GRAVELLY_HILLS)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                zombie.setCustomName(ChatColor.GOLD + "[21] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(220);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.MEADOW)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                zombie.setCustomName(ChatColor.RED + "[24] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(270);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_FOREST)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                zombie.setCustomName(ChatColor.DARK_RED + "[30] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(385);
            }
            if(zombie.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_SAVANNA)){
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                zombie.setCustomName(ChatColor.DARK_RED + "[30] Zombie");
                zombie.setCustomNameVisible(true);
                zombie.setHealth(385);

            }

        }
    }



}
