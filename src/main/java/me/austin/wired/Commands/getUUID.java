package me.austin.wired.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class getUUID implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player){
            if(player.hasPermission("wired.getuuid")){
                player.sendMessage(player.getUniqueId().toString());
            }
        }

        return false;
    }
}
