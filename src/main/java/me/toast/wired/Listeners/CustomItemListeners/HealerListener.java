package me.toast.wired.Listeners.CustomItemListeners;

import me.toast.wired.PlayerUtils.PlayerUtils.Mana;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static me.toast.wired.Listeners.ServerListeners.CombatLog.incombat;

public class HealerListener implements Listener {

    @EventHandler
    public void onHealerClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Healer")) {
                if (Mana.getPlayerMana(p) >= 30) {
                    Mana.removeMana(p, 30);
                    if (incombat.contains(p.getName())) {
                        p.sendMessage(ChatColor.RED + "Since you are in combat, the affect of this item is lowered.");
                        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 10, 0));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 10, 0));

                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 60, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 60, 1));
                    }
                }else{
                    p.sendMessage(ChatColor.RED + "You do not have enough mana to use this item.");
                }

            }
            }

        }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player p = event.getPlayer();
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() != null) {
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Healer")) {
                event.setCancelled(true);
            }
        }
    }


}