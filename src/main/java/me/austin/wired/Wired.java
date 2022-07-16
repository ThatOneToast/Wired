package me.austin.wired;

import me.austin.wired.Commands.*;
import me.austin.wired.Listeners.CustomItemListeners.*;
import me.austin.wired.Listeners.CustomMobs.*;
import me.austin.wired.Listeners.ServerListeners.*;
import me.austin.wired.Recipes.Armor.FishermensArmorRare.FishermensJacket;
import me.austin.wired.Recipes.Armor.FishermensArmorRare.FishermensBoots;
import me.austin.wired.Recipes.Armor.FishermensArmorRare.FishermensHat;
import me.austin.wired.Recipes.Armor.FishermensArmorRare.FishermensPants;
import me.austin.wired.Recipes.Armor.HolyGrailMythic.HolyBootsMythic;
import me.austin.wired.Recipes.Armor.HolyGrailMythic.HolyChestMythic;
import me.austin.wired.Recipes.Armor.HolyGrailMythic.HolyHelmMythic;
import me.austin.wired.Recipes.Armor.HolyGrailMythic.HolyPantsMythic;
import me.austin.wired.Recipes.Armor.TankARmorEpic.IronBootsEpic;
import me.austin.wired.Recipes.Armor.TankARmorEpic.IronChestEpic;
import me.austin.wired.Recipes.Armor.TankARmorEpic.IronHelmEpic;
import me.austin.wired.Recipes.Armor.TankARmorEpic.IronPantsEpic;
import me.austin.wired.Recipes.Other.Healer;
import me.austin.wired.Recipes.Tools.Bows.LightningBow;
import me.austin.wired.Recipes.Tools.Bows.PoisonBow;
import me.austin.wired.Recipes.Tools.Bows.TeleportBow;
import me.austin.wired.Recipes.Other.Feeder;
import me.austin.wired.Recipes.Other.FlyingFeather;
import me.austin.wired.Recipes.Other.HealthBooster;
import me.austin.wired.Recipes.Tools.Axe.StrongAxeRecipe;
import me.austin.wired.Recipes.Tools.Hoe.LoyalHoeRecipe;
import me.austin.wired.Recipes.Tools.Pickaxes.SpeedyPickaxeRecipe;
import me.austin.wired.Recipes.Tools.Pickaxes.TuffedWoodenPickaxe;
import me.austin.wired.Recipes.Tools.Swords.HardenedIronSword;
import me.austin.wired.Recipes.Tools.Swords.MonsterSlayer;
import me.austin.wired.Recipes.Tools.Swords.SkullCrusher;
import me.austin.wired.Recipes.Armor.TankArmorRare.IronBootsRare;
import me.austin.wired.Recipes.Armor.TankArmorRare.IronChestRare;
import me.austin.wired.Recipes.Armor.TankArmorRare.IronHelmRare;
import me.austin.wired.Recipes.Armor.TankArmorRare.IronPantsRare;
import me.austin.wired.Recipes.Tools.Pickaxes.WorthyPickaxeRecipe;
import me.austin.wired.Recipes.Tools.Shovel.FastShovelRecipe;
import me.austin.wired.Recipes.Armor.TraversalArmorCommon.LeatherBootsCommon;
import me.austin.wired.Recipes.Armor.TraversalArmorCommon.LeatherChestCommon;
import me.austin.wired.Recipes.Armor.TraversalArmorCommon.LeatherHelmetCommon;
import me.austin.wired.Recipes.Armor.TraversalArmorCommon.LeatherPantsCommon;
import me.austin.wired.Utilities.HomeFiles;
import org.bukkit.Location;
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
        getServer().getPluginManager().registerEvents(new HealthChange(), this);
        getServer().getPluginManager().registerEvents(new SkeletonSpawnClass(this), this);
        getServer().getPluginManager().registerEvents(new SpiderSpawnClass(this), this);
        getServer().getPluginManager().registerEvents(new endermanSpawnerClass(this), this);
        getServer().getPluginManager().registerEvents(new CreeperSpawnerClass(this), this);


        // Register our commands
        Objects.requireNonNull(getCommand("sethome")).setExecutor( new SetHome(this));
        Objects.requireNonNull(getCommand("home")).setExecutor( new Home(this));
        Objects.requireNonNull(getCommand("death")).setExecutor( new Death(this));
        Objects.requireNonNull(getCommand("grecipe")).setExecutor(new recipe());
        Objects.requireNonNull(getCommand("vault")).setExecutor(new OpenCommand());
        Objects.requireNonNull(getCommand("rEnchant")).setExecutor(new rEnchant());

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

        //Crafting Materials


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
