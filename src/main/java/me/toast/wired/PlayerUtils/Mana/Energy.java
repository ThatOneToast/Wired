package me.toast.wired.PlayerUtils.Mana;


import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;

public class Energy {

    public static HashMap<Player, Double> ENERGY_LEVEL = new HashMap<>();
    public static HashMap<Player, Double> MAX_EnergyLevel = new HashMap<>();
    public static HashMap<Player, Double> ENERGY_PER_SEC = new HashMap<>();



    public static Double getPlayerMaxEnergy(Player player){
        if (MAX_EnergyLevel.get(player) != null){
            return MAX_EnergyLevel.get(player);
        } else {
            MAX_EnergyLevel.put(player, 0.0);
        }
        return 0.0;
    }

    @NonNull
    public static Double getPlayerEnergy(Player player) {

        if (ENERGY_LEVEL.get(player) != null) {
            return ENERGY_LEVEL.get(player);
        } else {
            ENERGY_LEVEL.put(player, 0.0);
        }
        return 0.0;
    }
    public static boolean hasMaxEnergy(Player p){
        getPlayerEnergy(p);
        return true;
    }
    public static void addEnergy(Player p, double amount) {
        Double original = getPlayerEnergy(p);
        Double now = original + amount;
        if (amount != 0) {
            ENERGY_LEVEL.put(p, now);
        }

    }

    public static void removeEnergy(Player p, double amount){
        double playerMana = getPlayerEnergy(p);
        if (!(amount <= 0)) {
            if (getPlayerEnergy(p) - amount >= 0){
                ENERGY_LEVEL.put(p, (playerMana-amount));
            }
        }
    }

    public static void addEnergyPerSec(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Wired.getPlugin(), () -> {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (!(hasMaxEnergy(p))) {
                    continue;
                }
                if (getPlayerEnergy(p) < MAX_EnergyLevel.get(p)){
                    addEnergy(p, ENERGY_PER_SEC.get(p));
                }
            }
        }, 0L, 20L);
    }


}
