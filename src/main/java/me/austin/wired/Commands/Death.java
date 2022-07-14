package me.austin.wired.Commands;

import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Death implements CommandExecutor {

    public Death(Wired plugin) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            Location lDeath = player.getLastDeathLocation();
            if(lDeath == null){
                player.sendMessage(ChatColor.RED + "You have not died yet.");
            }
            if (player.getLevel() >= 30) {
                int level = player.getLevel();
                player.setLevel(level - 30);
                player.sendMessage(ChatColor.GREEN + "Teleported to your death location.");
                assert lDeath != null;
                player.teleport(lDeath);
            } else {
                player.sendMessage(ChatColor.RED + "You must be level 30 to use this command.");
            }

        }
        return true;
    }
}
