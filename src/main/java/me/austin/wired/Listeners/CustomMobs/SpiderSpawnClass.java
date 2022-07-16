package me.austin.wired.Listeners.CustomMobs;

import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Objects;


public class SpiderSpawnClass implements Listener {

    static Wired plugin;

    public SpiderSpawnClass(Wired plugin) {
        SpiderSpawnClass.plugin = plugin;
    }

    @EventHandler
    public static void onSpiderSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Spider spider) {
            if(spider.getLocation().getBlock().getBiome().equals(Biome.PLAINS)) {
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                spider.setCustomName(ChatColor.GREEN + "[3] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(10);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.SNOWY_PLAINS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                spider.setCustomName(ChatColor.GREEN + "[3] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(10);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.SUNFLOWER_PLAINS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(10);
                spider.setCustomName(ChatColor.GREEN + "[3] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(10);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.DESERT)) {
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                spider.setCustomName(ChatColor.GREEN + "[6] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(27);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.BIRCH_FOREST)) {
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                spider.setCustomName(ChatColor.GREEN + "[6] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(27);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.FLOWER_FOREST)) {
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(27);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(3);
                spider.setCustomName(ChatColor.GREEN + "[6] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(27);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.STONY_SHORE)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                spider.setCustomName(ChatColor.DARK_GREEN + "[9] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(44);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.DARK_FOREST)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                spider.setCustomName(ChatColor.DARK_GREEN + "[9] Zombie");
                spider.setCustomNameVisible(true);
                spider.setHealth(44);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.MANGROVE_SWAMP)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                spider.setCustomName(ChatColor.DARK_GREEN + "[9] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(44);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.FOREST)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(44);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(6);
                spider.setCustomName(ChatColor.DARK_GREEN + "[9] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(44);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.SWAMP)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                spider.setCustomName(ChatColor.YELLOW + "[13] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(105);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.STONY_PEAKS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(105);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(10);
                spider.setCustomName(ChatColor.YELLOW + "[13] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(105);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.MUSHROOM_FIELDS)) {
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                spider.setCustomName(ChatColor.GOLD + "[15] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(145);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.TAIGA)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                spider.setCustomName(ChatColor.GOLD + "[15] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(145);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.JUNGLE)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                spider.setCustomName(ChatColor.GOLD + "[15] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(145);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.SPARSE_JUNGLE)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(145);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(12);
                spider.setCustomName(ChatColor.GOLD + "[15] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(145);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.BAMBOO_JUNGLE)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                spider.setCustomName(ChatColor.GOLD + "[18] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(170);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_HILLS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(170);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(17);
                spider.setCustomName(ChatColor.GOLD + "[18] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(170);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.BEACH)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                spider.setCustomName(ChatColor.GOLD + "[21] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(220);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_GRAVELLY_HILLS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(220);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(20);
                spider.setCustomName(ChatColor.GOLD + "[21] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(220);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.MEADOW)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                spider.setCustomName(ChatColor.RED + "[24] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(270);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.BADLANDS)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(270);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(25);
                spider.setCustomName(ChatColor.RED + "[24] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(270);
            }

            if(spider.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_FOREST)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                spider.setCustomName(ChatColor.DARK_RED + "[30] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(385);
            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.WINDSWEPT_SAVANNA)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                spider.setCustomName(ChatColor.DARK_RED + "[30] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(385);

            }
            if(spider.getLocation().getBlock().getBiome().equals(Biome.SAVANNA)){
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(385);
                Objects.requireNonNull(spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE)).setBaseValue(44);
                spider.setCustomName(ChatColor.DARK_RED + "[30] spider");
                spider.setCustomNameVisible(true);
                spider.setHealth(385);

            }

        }
    }



}
