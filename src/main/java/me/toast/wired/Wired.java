package me.toast.wired;

import me.toast.wired.Commands.*;
import me.toast.wired.Listeners.CustomItemListeners.*;
import me.toast.wired.Listeners.CustomMobs.*;
import me.toast.wired.Listeners.ServerListeners.*;
import me.toast.wired.Recipes.Armor.FishermensArmorRare.FishermensJacket;
import me.toast.wired.Recipes.Armor.FishermensArmorRare.FishermensBoots;
import me.toast.wired.Recipes.Armor.FishermensArmorRare.FishermensHat;
import me.toast.wired.Recipes.Armor.FishermensArmorRare.FishermensPants;
import me.toast.wired.Recipes.Armor.HolyGrailManaMythic.HolyBootsMythicRecipe;
import me.toast.wired.Recipes.Armor.HolyGrailManaMythic.HolyChestMythicRecipe;
import me.toast.wired.Recipes.Armor.HolyGrailManaMythic.HolyHelmMythicRecipe;
import me.toast.wired.Recipes.Armor.HolyGrailManaMythic.HolyPantsMythicRecipe;
import me.toast.wired.Recipes.Armor.HolyGrailMythic.HolyBootsMythic;
import me.toast.wired.Recipes.Armor.HolyGrailMythic.HolyChestMythic;
import me.toast.wired.Recipes.Armor.HolyGrailMythic.HolyHelmMythic;
import me.toast.wired.Recipes.Armor.HolyGrailMythic.HolyPantsMythic;
import me.toast.wired.Recipes.Armor.TankARmorEpic.IronBootsEpic;
import me.toast.wired.Recipes.Armor.TankARmorEpic.IronChestEpic;
import me.toast.wired.Recipes.Armor.TankARmorEpic.IronHelmEpic;
import me.toast.wired.Recipes.Armor.TankARmorEpic.IronPantsEpic;
import me.toast.wired.Recipes.Other.*;
import me.toast.wired.Recipes.Tools.Bows.LightningBow;
import me.toast.wired.Recipes.Tools.Bows.PoisonBow;
import me.toast.wired.Recipes.Tools.Bows.TeleportBow;
import me.toast.wired.Recipes.Tools.Axe.StrongAxeRecipe;
import me.toast.wired.Recipes.Tools.Hoe.LoyalHoeRecipe;
import me.toast.wired.Recipes.Tools.Pickaxes.SpeedyPickaxeRecipe;
import me.toast.wired.Recipes.Tools.Pickaxes.TuffedWoodenPickaxe;
import me.toast.wired.Recipes.Tools.Shield.FortifiedShieldRecipe;
import me.toast.wired.Recipes.Tools.Shield.HeavyFortifiedShieldRecipe;
import me.toast.wired.Recipes.Tools.Swords.HardenedIronSword;
import me.toast.wired.Recipes.Tools.Swords.MonsterSlayer;
import me.toast.wired.Recipes.Tools.Swords.SkullCrusher;
import me.toast.wired.Recipes.Armor.TankArmorRare.IronBootsRare;
import me.toast.wired.Recipes.Armor.TankArmorRare.IronChestRare;
import me.toast.wired.Recipes.Armor.TankArmorRare.IronHelmRare;
import me.toast.wired.Recipes.Armor.TankArmorRare.IronPantsRare;
import me.toast.wired.Recipes.Tools.Pickaxes.WorthyPickaxeRecipe;
import me.toast.wired.Recipes.Tools.Shovel.FastShovelRecipe;
import me.toast.wired.Recipes.Armor.TraversalArmorCommon.LeatherBootsCommon;
import me.toast.wired.Recipes.Armor.TraversalArmorCommon.LeatherChestCommon;
import me.toast.wired.Recipes.Armor.TraversalArmorCommon.LeatherHelmetCommon;
import me.toast.wired.Recipes.Armor.TraversalArmorCommon.LeatherPantsCommon;
import me.toast.wired.Utilities.HomeFiles;
import me.toast.wired.Utilities.PlayerUtils.Mana;
import me.toast.wired.Utilities.PlayerUtils.Stamina;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.*;


public class Wired extends JavaPlugin implements Listener {

    private static Wired plugin;

    private HashMap<UUID, Location> homes;
    private HomeFiles files;
    private List<UUID> que;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.homes = new HashMap<>();
        this.files = new HomeFiles(this);
        this.files.init();
        this.que = new ArrayList<>();
        System.out.println("Wired is enabled!");




        //Enchantments

        // Register our event listeners
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new deathListener(), this);
        getServer().getPluginManager().registerEvents(new TeleportBowListener(), this);
        getServer().getPluginManager().registerEvents(new LightningBowListener(), this);
        getServer().getPluginManager().registerEvents(new FlyingFeatherListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerListener(plugin), this);
        getServer().getPluginManager().registerEvents(new FeederListener(), this);
        getServer().getPluginManager().registerEvents(new HealthBoosterListener(), this);
        getServer().getPluginManager().registerEvents(new PoisonBowListener(), this);
        getServer().getPluginManager().registerEvents(new ZombieSpawnClass(this), this);
        getServer().getPluginManager().registerEvents(new CombatLog(), this);
        getServer().getPluginManager().registerEvents(new VillagerKill(), this);
        getServer().getPluginManager().registerEvents(new HealerListener(), this);
        getServer().getPluginManager().registerEvents(new SkeletonSpawnClass(this), this);
        getServer().getPluginManager().registerEvents(new SpiderSpawnClass(this), this);
        getServer().getPluginManager().registerEvents(new endermanSpawnerClass(this), this);
        getServer().getPluginManager().registerEvents(new CreeperSpawnerClass(this), this);
        getServer().getPluginManager().registerEvents(new ZombieDeathClass(), this);
        getServer().getPluginManager().registerEvents(new endermanDeathClass(), this);
        getServer().getPluginManager().registerEvents(new EnderDragonSpawnClass(), this);
        getServer().getPluginManager().registerEvents(new HellSpawnClass(), this);
        getServer().getPluginManager().registerEvents(new ManaHealthChange(), this);
        getServer().getPluginManager().registerEvents(new SpiderDeathClass(), this);


        // Register our commands
        Objects.requireNonNull(getCommand("sethome")).setExecutor( new SetHome(this));
        Objects.requireNonNull(getCommand("home")).setExecutor( new Home(this));
        Objects.requireNonNull(getCommand("death")).setExecutor( new Death());
        Objects.requireNonNull(getCommand("grecipe")).setExecutor(new recipe());
        Objects.requireNonNull(getCommand("vault")).setExecutor(new OpenCommand());
        Objects.requireNonNull(getCommand("rEnchant")).setExecutor(new rEnchant());
        Objects.requireNonNull(getCommand("setMaxMana")).setExecutor(new setMaxMana());
        Objects.requireNonNull(getCommand("setManaRegen")).setExecutor(new SetRegenMana());

        //Custom Weapons
        LightningBow.LightningBowRecipe();
        TeleportBow.TeleportBowRecipe();
        SkullCrusher.SkullCrusherRecipe();
        HardenedIronSword.HardenedIronSwordRecipe();
        PoisonBow.PoisonBowRecipe();
        MonsterSlayer.MonsterSlayerRecipe();

        //Tank Armor Rare
        IronChestRare.IronChestRecipe();
        IronPantsRare.IronPantsRecipe();
        IronHelmRare.IronHelmRecipe();
        IronBootsRare.IronBootsRecipe();

        //Tank Armor Epic
        IronBootsEpic.IronBootsRecipe();
        IronChestEpic.IronChestRecipe();
        IronHelmEpic.IronHelmRecipe();
        IronPantsEpic.IronPantsRecipe();

        //Traversal Armor Common
        LeatherChestCommon.LeatherChestRecipe();
        LeatherPantsCommon.LeatherPantsRecipe();
        LeatherHelmetCommon.LeatherHelmetRecipe();
        LeatherBootsCommon.LeatherBootsRecipe();

        //Fishermens Armor Rare
        FishermensBoots.IronBootsRecipe();
        FishermensHat.IronHelmRecipe();
        FishermensPants.IronPantsRecipe();
        FishermensJacket.IronChestRecipe();

        //Holy Grail Armor Mythic
        HolyBootsMythic.HolyBootsRecipe();
        HolyChestMythic.HolyChestRecipe();
        HolyHelmMythic.HolyHelmetRecipe();
        HolyPantsMythic.HolyPantsRecipe();

        //Holy Grail Mana Armor Mythic
        HolyBootsMythicRecipe.HolyBootsManaRecipe();
        HolyChestMythicRecipe.HolyChestManaRecipe();
        HolyHelmMythicRecipe.HolyHelmetManaRecipe();
        HolyPantsMythicRecipe.HolyPantsManaRecipe();


        //Shields
        FortifiedShieldRecipe.FortifiedShieldRecipe();
        HeavyFortifiedShieldRecipe.HeavyFortifiedShieldRecipe();


        //Usable Items
        FlyingFeather.FlytingFeatherRecipe();
        Feeder.FeederRecipe();
        HealthBooster.HealthBoosterRecipe();
        Healer.HealerRecipe();

        //Axes
        StrongAxeRecipe.StrongAxeRecipe();

        //Pickaxes
        TuffedWoodenPickaxe.TuffedWoodenPickaxeRecipe();
        WorthyPickaxeRecipe.WorthyPickaxeRecipe();
        SpeedyPickaxeRecipe.SpeedyPickRecipe();

        //Shovels
        FastShovelRecipe.FastShovelRecipe();

        //Hoes
        LoyalHoeRecipe.LoyalHoeRecipe();

        //Exp Bottle
        ExperienceBottle.ExperienceBottleRecipe();




        for(Player player : Bukkit.getServer().getOnlinePlayers()){
            Mana.ARCANE_POWER.put(player, Mana.MAX_ArcanePower.get(player));
            player.setHealth(40);
            player.setSaturation(20);
            player.setFoodLevel(20);
            Mana.MANA_PER_SECOND.put(player, 0.5);
            Mana.MAX_ArcanePower.put(player, 100.0);
        }
        Mana.addManaPerSecond();
        Stamina.addStaminaPerSeconded();



    }

    @Override
    public void onDisable(){
        try {
            this.files.terminate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Wired getPlugin() {
        return plugin;
    }

    public void addHome(UUID id, Location location){
        this.homes.put(id, location);
    }
    public Location getHome(UUID id){
        return this.homes.get(id);
    }
    public boolean hasHome(UUID id){
        return this.homes.containsKey(id);
    }
    public HashMap<UUID, Location> getHomes() {
        return homes;
    }

    public HomeFiles getFiles(){
        return files;
    }
    public void addQue(UUID id){
        this.que.add(id);
    }
    public boolean isQued(UUID id){
        return this.que.contains(id);
    }
    public void cancelQue(UUID id){
        this.que.remove(id);
    }
}
