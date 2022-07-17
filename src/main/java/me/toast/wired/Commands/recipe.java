package me.toast.wired.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class recipe implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            player.sendMessage(ChatColor.GREEN + "Working on giving you all of the recipes!");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "recipe give " + player.getName() + " *");
            player.sendMessage(ChatColor.GREEN + "You have been given all of the recipes!");
            player.sendMessage(ChatColor.YELLOW + "You must re-log to see the recipes.");
        }

        return false;
    }

}

