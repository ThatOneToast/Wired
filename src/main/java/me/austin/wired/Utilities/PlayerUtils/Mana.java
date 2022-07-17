package me.austin.wired.Utilities.PlayerUtils;

import me.austin.wired.Wired;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;

public class Mana {

    public static HashMap<Player, Double> ARCANE_POWER = new HashMap<>();
    public static HashMap<Player, Double> MAX_ArcanePower = new HashMap<>();
    public static HashMap<Player, Double> MANA_PER_SECOND = new HashMap<>();



    @NonNull
    public static Double getPlayerMana(Player player) {

        if (ARCANE_POWER.get(player) != null) {
            return ARCANE_POWER.get(player);
        } else {
            ARCANE_POWER.put(player, 0.0);
        }
        return 0.0;
    }
    public static boolean hasMaxMana(Player p){
        getPlayerMana(p);
        return true;
    }
    public static void addMana(Player p, double amount) {
        Double original = getPlayerMana(p);
        Double now = original + amount;
        if (amount != 0) {
            ARCANE_POWER.put(p, now);
        }

    }

    public static void removeMana(Player p, double amount){
        int playerMana = (int) Math.round(getPlayerMana(p));
        if (!(amount <= 0)) {
            if (getPlayerMana(p) - amount >= 0){
                ARCANE_POWER.put(p, (playerMana-amount));
            }
        }
    }

    public static void addManaPerSecond(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Wired.getPlugin(), () -> {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (!(hasMaxMana(p))) {
                    continue;
                }
                if (getPlayerMana(p) < MAX_ArcanePower.get(p)){
                    addMana(p, MANA_PER_SECOND.get(p));
                }
            }
        }, 0L, 20L);
    }



}
