package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;


public class SkeletonSpawnClass implements Listener {

    static Wired plugin;

    public SkeletonSpawnClass(Wired plugin) {
        SkeletonSpawnClass.plugin = plugin;
    }

    @EventHandler
    public static void onSkeletonSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Skeleton skeleton) {
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.PLAINS)) {
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                skeleton.setCustomName(ChatColor.GREEN + "[3] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(10);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SNOWY_PLAINS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                skeleton.setCustomName(ChatColor.GREEN + "[3] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(10);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SUNFLOWER_PLAINS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                skeleton.setCustomName(ChatColor.GREEN + "[3] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(10);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.DESERT)) {
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                skeleton.setCustomName(ChatColor.GREEN + "[6] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(27);


            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.BIRCH_FOREST)) {
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                skeleton.setCustomName(ChatColor.GREEN + "[6] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(27);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.FLOWER_FOREST)) {
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                skeleton.setCustomName(ChatColor.GREEN + "[6] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(27);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.STONY_SHORE)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                skeleton.setCustomName(ChatColor.DARK_GREEN + "[9] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(44);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.DARK_FOREST)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                skeleton.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(44);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.FOREST)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                skeleton.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(44);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.MANGROVE_SWAMP)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                skeleton.setCustomName(ChatColor.DARK_GREEN + "[9] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(44);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SWAMP)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                skeleton.setCustomName(ChatColor.YELLOW + "[13] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(105);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.STONY_PEAKS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                skeleton.setCustomName(ChatColor.YELLOW + "[13] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(105);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.MUSHROOM_FIELDS)) {
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                skeleton.setCustomName(ChatColor.GOLD + "[15] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(145);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.TAIGA)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                skeleton.setCustomName(ChatColor.GOLD + "[15] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(145);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.JUNGLE)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                skeleton.setCustomName(ChatColor.GOLD + "[15] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(145);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SPARSE_JUNGLE)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                skeleton.setCustomName(ChatColor.GOLD + "[15] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(145);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.BAMBOO_JUNGLE)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                skeleton.setCustomName(ChatColor.GOLD + "[18] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(170);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_HILLS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                skeleton.setCustomName(ChatColor.GOLD + "[18] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(170);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.BEACH)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                skeleton.setCustomName(ChatColor.GOLD + "[21] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(220);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_GRAVELLY_HILLS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                skeleton.setCustomName(ChatColor.GOLD + "[21] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(220);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.MEADOW)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                skeleton.setCustomName(ChatColor.RED + "[24] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(270);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.BADLANDS)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                skeleton.setCustomName(ChatColor.RED + "[24] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(270);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_FOREST)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                skeleton.setCustomName(ChatColor.DARK_RED + "[30] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(385);
            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_SAVANNA)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                skeleton.setCustomName(ChatColor.DARK_RED + "[30] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(385);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SAVANNA)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                skeleton.setCustomName(ChatColor.DARK_RED + "[30] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(385);

            }
            if(skeleton.getLocation().getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU)){
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                skeleton.setCustomName(ChatColor.DARK_RED + "[30] skeleton");
                skeleton.setCustomNameVisible(true);
                skeleton.setHealth(385);

            }

        }
    }



}
