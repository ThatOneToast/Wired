package me.toast.wired.Commands;

import me.toast.wired.Items.Spells.FIreBall;
import me.toast.wired.Items.Spells.Familiar;
import me.toast.wired.Items.Spells.ManaRestore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class giveSpell implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (player.hasPermission("wired.giveSpell")) {

                if (command.getName().equalsIgnoreCase("giveSpell") && player.isOp()) {
                    //get a second argument to set the max mana to
                    if (args.length == 1) {
                        if (args[0].equalsIgnoreCase("FireBall")) {
                            player.getInventory().addItem(FIreBall.FireBallSpell());
                        } else if (args[0].equalsIgnoreCase("ManaRestore")) {
                            player.getInventory().addItem(ManaRestore.ManaRestoreSpell());
                        } else if (args[0].equalsIgnoreCase("Familiar")) {
                            player.getInventory().addItem(Familiar.FamiliarSpell());
                        }

                        else {
                            player.sendMessage(ChatColor.RED + "Invalid spell!");
                        }

                        }
                    }
                }
            } else {
                sender.sendMessage("You must be a player to use this command.");
            }
        return false;
    }

}