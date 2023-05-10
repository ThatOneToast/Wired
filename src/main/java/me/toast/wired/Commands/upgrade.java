package me.toast.wired.Commands;

import me.toast.wired.PlayerUtils.Mana.Energy;
import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class upgrade implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            // 400
            if (Energy.MAX_EnergyLevel.get(player) == 400) {
                player.sendMessage(ChatColor.RED + "You have already upgraded your character to the max level. Please Prestiege instead. ");
                return true;
            } else {
                if (player.getLevel() >= 75) {
                    int level = player.getLevel();
                    player.setLevel(level - 75);
                    /* Add 50 to max health */
                    int mHealth = (int) player.getMaxHealth();
                    player.setMaxHealth(mHealth + 50);

                    /* Add 25 to max mana */
                    Double mMana = Mana.MAX_ArcanePower.get(player);
                    Mana.MAX_ArcanePower.put(player, mMana + 25);

                    /* Add 50 to max Energy */
                    Double mEnergy = Energy.MAX_EnergyLevel.get(player);
                    Energy.MAX_EnergyLevel.put(player, mEnergy + 50);

                } else {
                    player.sendMessage(ChatColor.RED + "You must be level 75 to use this command.");
                }

            }
        }
        return false;
    }
}
