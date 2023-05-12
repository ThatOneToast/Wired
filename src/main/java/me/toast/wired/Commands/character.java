package me.toast.wired.Commands;

import me.toast.wired.PlayerUtils.Mana.Energy;
import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class character implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            int health = (int) player.getHealth();
            int level = player.getLevel();
            int kills = player.getStatistic(org.bukkit.Statistic.PLAYER_KILLS);
            int deaths = player.getStatistic(org.bukkit.Statistic.DEATHS);
            int kd = kills / deaths;
            int timeplayed = player.getStatistic(org.bukkit.Statistic.PLAY_ONE_MINUTE);
            int actualtimeplayed = timeplayed / 20;

            double mana = Mana.getPlayerMaxMana(player);
            double energy = Energy.getPlayerMaxEnergy(player);

            player.sendMessage(ChatColor.GREEN + "Character Stats:");
            player.sendMessage(ChatColor.RED + "-- ❤: " + health);
            player.sendMessage(ChatColor.BLUE + "-- ✎: " + mana);
            player.sendMessage(ChatColor.GOLD + "-- ✵: " + energy);

            player.sendMessage(ChatColor.WHITE + "Other Stats:");
            player.sendMessage(ChatColor.YELLOW + "-- ⚡: " + level);
            player.sendMessage(ChatColor.LIGHT_PURPLE + "-- ⌚: " + actualtimeplayed);

            player.sendMessage(ChatColor.DARK_AQUA + "Combat Stats:");
            player.sendMessage(ChatColor.DARK_RED + "-- ☠: " + deaths);
            player.sendMessage(ChatColor.DARK_GREEN + "-- ☠: " + kills);
            player.sendMessage(ChatColor.DARK_PURPLE + "-- ☠: " + kd);

        }

        return false;
    }
}
