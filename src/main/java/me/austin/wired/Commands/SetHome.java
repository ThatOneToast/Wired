package me.austin.wired.Commands;

import me.austin.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SetHome implements CommandExecutor {
    private final Wired plugin;

    public SetHome(Wired plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (sender instanceof Player player) {
            if (player.getLevel() >= 25) {
                player.sendMessage(ChatColor.GREEN + "You have been charged 25 levels for using this command!");
                player.setLevel(player.getLevel() - 25);

                UUID id = player.getUniqueId();

                Location location = player.getLocation();

                if (plugin.hasHome(id)) {
                    player.sendMessage(ChatColor.RED + "Previous home location has been overwritten.");
                }
                plugin.addHome(id, location);
                player.sendMessage(ChatColor.GREEN + "Home set!");
                plugin.getFiles().addHome(id, location);


            }else{
                player.sendMessage(ChatColor.RED + "You need 25 levels to use this command");
            }
        }
        return true;
    }
}
