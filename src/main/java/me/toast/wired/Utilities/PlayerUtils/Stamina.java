package me.toast.wired.Utilities.PlayerUtils;

import me.toast.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;

public class Stamina {

    public static HashMap<Player, Double> STAMINA = new HashMap<>();
    public static HashMap<Player, Double> MAX_STAMINA = new HashMap<>();
    public static HashMap<Player, Double> STAMINA_PER_SECOND = new HashMap<>();



    @NonNull
    public static Double getStamina(Player player) {

        if (STAMINA.get(player) != null) {
            return STAMINA.get(player);
        } else {
            STAMINA.put(player, 0.0);
        }
        return 0.0;
    }
    public static boolean hasMaxStamina(Player p){
        getStamina(p);
        return true;
    }
    public static void addStamina(Player p, double amount) {
        Double original = getStamina(p);
        Double now = original + amount;
        if (amount != 0) {
            STAMINA.put(p, now);
        }

    }

    public static void removeStamina(Player p, double amount){
        double playerMana = getStamina(p);
        if (!(amount <= 0)) {
            if (getStamina(p) - amount >= 0){
                STAMINA.put(p, (playerMana-amount));
            }
        }
    }

    public static void addStaminaPerSeconded(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Wired.getPlugin(), () -> {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (!(hasMaxStamina(p))) {
                    continue;
                }
                if (getStamina(p) < MAX_STAMINA.get(p)){
                    addStamina(p, STAMINA_PER_SECOND.get(p));
                }
            }
        }, 0L, 20L);
    }
}
