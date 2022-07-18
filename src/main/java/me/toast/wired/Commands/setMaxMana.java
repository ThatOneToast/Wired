package me.toast.wired.Commands;

import me.toast.wired.PlayerUtils.PlayerUtils.Mana;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setMaxMana implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (command.getName().equalsIgnoreCase("setMaxMana") && player.isOp()) {
                //get a second argument to set the max mana to
                if (args.length == 2) {
                    //first arguement is the player second argument is the mana
                    Player p = player.getServer().getPlayer(args[0]);
                    int mana = Integer.parseInt(args[1]);
                    Mana.MAX_ArcanePower.put(p, (double) mana);
                    assert p != null;
                    sender.sendMessage("Max mana set to " + mana + " for " + p.getName());
                }
            }
        }else{
            sender.sendMessage("You must be a player to use this command.");
        }


        return true;
    }
}
