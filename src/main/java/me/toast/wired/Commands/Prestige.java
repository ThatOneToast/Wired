package me.toast.wired.Commands;

import me.toast.wired.PlayerUtils.Mana.Energy;
import me.toast.wired.PlayerUtils.Mana.Mana;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Prestige implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            if (Energy.MAX_EnergyLevel.get(player) == 400) {

                /*
                Prestige 1.
                 */
                if (player.getLevel() >= 150) {
                    player.setLevel(player.getLevel() - 150);
                    /* Upgrade player health */
                    int mHealth = (int) player.getMaxHealth();
                    player.setMaxHealth(mHealth + 100);

                    /* Upgrade player mana */
                    Double mMana = Mana.MAX_ArcanePower.get(player);
                    Mana.MAX_ArcanePower.put(player, mMana + 50);

                    /* Upgrade player energy */
                    Double mEnergy = Energy.MAX_EnergyLevel.get(player);
                    Energy.MAX_EnergyLevel.put(player, mEnergy + 100);

                    player.sendMessage(ChatColor.GREEN + "You have prestiged to level 1.");
                    player.sendMessage(ChatColor.RED + "Since you have Prestiged, you will have amplified Mana and Energy regen speeds.");

                    Mana.MANA_PER_SECOND.put(player, Mana.MANA_PER_SECOND.get(player) + 0.5);
                    Energy.ENERGY_PER_SEC.put(player, Energy.ENERGY_PER_SEC.get(player) + 0.5);


                }
                /*
                Prestige 2.
                 */
                else if (player.getLevel() >= 300) {
                    player.setLevel(player.getLevel() - 300);

                    /* Upgrade player health */
                    int mHealth = (int) player.getMaxHealth();
                    player.setMaxHealth(mHealth + 200);

                    /* Upgrade player mana */
                    Double mMana = Mana.MAX_ArcanePower.get(player);
                    Mana.MAX_ArcanePower.put(player, mMana + 100);

                    /* Upgrade player energy */
                    Double mEnergy = Energy.MAX_EnergyLevel.get(player);
                    Energy.MAX_EnergyLevel.put(player, mEnergy + 200);

                    player.sendMessage(ChatColor.GREEN + "You have prestiged to level 2.");
                    player.sendMessage(ChatColor.RED + "Since you have Prestiged, you will have amplified Mana and Energy regen speeds.");

                    Mana.MANA_PER_SECOND.put(player, Mana.MANA_PER_SECOND.get(player) + 1);
                    Energy.ENERGY_PER_SEC.put(player, Energy.ENERGY_PER_SEC.get(player) + 0.3);
                }

                /*
                Prestige 3.
                 */
                else if (player.getLevel() >= 400){
                    player.setLevel(player.getLevel() - 400);

                    /* Upgrade player health */
                    int mHealth = (int) player.getMaxHealth();
                    player.setMaxHealth(mHealth + 300);

                    /* Upgrade player mana */
                    Double mMana = Mana.MAX_ArcanePower.get(player);
                    Mana.MAX_ArcanePower.put(player, mMana + 150);

                    /* Upgrade player energy */
                    Double mEnergy = Energy.MAX_EnergyLevel.get(player);
                    Energy.MAX_EnergyLevel.put(player, mEnergy + 300);

                    player.sendMessage(ChatColor.GREEN + "You have prestiged to level 3.");
                    player.sendMessage(ChatColor.RED + "Since you have Prestiged, you will have amplified Mana and Energy regen speeds.");

                    Mana.MANA_PER_SECOND.put(player, Mana.MANA_PER_SECOND.get(player) + 2);
                    Energy.ENERGY_PER_SEC.put(player, Energy.ENERGY_PER_SEC.get(player) + 1.2);

                }

                else{
                    player.sendMessage(ChatColor.RED + "You must be level 150 to use this command.");
                }
            }

        }
        return false;
    }
}
