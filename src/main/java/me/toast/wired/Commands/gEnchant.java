package me.toast.wired.Commands;

import me.toast.wired.Items.Enchantments.Enchantments;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class gEnchant implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player){
            if(command.getName().equalsIgnoreCase("gEnchant") && player.isOp()){
                if(args.length == 2){
                }
            }
        }

        return true;
    }
}
