package me.toast.wired.Utilities;

import me.toast.wired.Wired;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class HomeFiles {

    private final Wired plugin;
    public HomeFiles(Wired plugin) {
        this.plugin = plugin;
    }

    public void init() {
        File homeFile = new File(plugin.getDataFolder(), "homes.yml");
        if (homeFile.exists()) {
            YamlConfiguration homeConfig = YamlConfiguration.loadConfiguration(homeFile);
            for (String s : homeConfig.getKeys(false)) {
                UUID id = UUID.fromString(s);
                Location home = homeConfig.getLocation(s);
                plugin.addHome(id, home);
            }
        }
    }
    public void terminate() throws IOException {
        File homeFile = new File(plugin.getDataFolder(), "homes.yml");
        if(!homeFile.exists()){
            try{
                homeFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        YamlConfiguration homeConfig = YamlConfiguration.loadConfiguration(homeFile);

        for(UUID id : plugin.getHomes().keySet()){
            homeConfig.set(id.toString(), plugin.getHome(id));
        }
        homeConfig.save(homeFile);
    }

    public void addHome(UUID id, Location location){
        File homeFile = new File(plugin.getDataFolder(), "homes.yml");

        if(!homeFile.exists()){
            try{
                homeFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        YamlConfiguration homeConfig = YamlConfiguration.loadConfiguration(homeFile);
        homeConfig.set(id.toString(), location);

        try{
            homeFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
