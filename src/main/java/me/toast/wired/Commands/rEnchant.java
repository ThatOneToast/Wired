package me.toast.wired.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import java.util.Map;

public class rEnchant implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player) {

            if (player.getLevel() >= 50) {
                player.setLevel(player.getLevel() - 50);
                player.sendMessage(ChatColor.GREEN + "50 Levels have been removed from your account.");

                ItemStack mainHand = player.getInventory().getItemInMainHand();
                Map<Enchantment, Integer> enchants = mainHand.getEnchantments();
                for (Map.Entry<Enchantment, Integer> entry : enchants.entrySet()) {
                    Enchantment enchantment = entry.getKey();
                    Integer level = entry.getValue();
                    mainHand.removeEnchantment(enchantment);

                    ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
                    EnchantmentStorageMeta bookMeta = (EnchantmentStorageMeta) book.getItemMeta();
                    System.out.println(bookMeta);

                    if (bookMeta != null) {
                        bookMeta.addStoredEnchant(enchantment, level, true);
                    }

                    book.setItemMeta(bookMeta);
                    player.getInventory().addItem(book);
                    System.out.println(bookMeta);
                }
            }else{
                player.sendMessage(ChatColor.RED + "You need 50 levels to use this command!");
            }
        }else{
            sender.sendMessage("You must be a player to use this command!");
        }
        return true;
    }
}
