package me.toast.wired.Commands;

import me.toast.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.UUID;

public class Home implements CommandExecutor {
    private final Wired plugin;
    public Home(Wired plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player){
            if(player.getLevel() >=5) {
                player.setLevel(player.getLevel() - 5);
                player.sendMessage(ChatColor.GREEN + "You have been charged 5 levels for using this command!");

                UUID id = player.getUniqueId();
                if (!plugin.hasHome(id)) {
                    player.sendMessage(ChatColor.RED + "You do not have a home set.");
                } else {
                    plugin.addQue(id);
                    new BukkitRunnable() {
                        int delay = 5;

                        @Override
                        public void run() {
                            if (plugin.isQued(id)) {
                                if (delay == 0) {
                                    player.teleport(plugin.getHome(id));
                                    player.sendMessage(ChatColor.GREEN + "Teleported to your home.");
                                    plugin.cancelQue(id);
                                    this.cancel();
                                } else {
                                    player.sendMessage(ChatColor.RED + "Teleporting to your home in " + delay-- + " seconds.");
                                }
                            } else {
                                player.sendMessage(ChatColor.RED + "Teleport has been cancelled.");
                                this.cancel();
                            }
                        }
                    }.runTaskTimer(plugin, 0, 20);

                }
            }else{
                player.sendMessage(ChatColor.RED + "You are not high enough level to do this!");
            }
        }
        return true;
    }
}

