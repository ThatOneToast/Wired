package me.toast.wired.Listeners.ServerListeners;

import me.toast.wired.PlayerUtils.PlayerUtils.Mana;
import me.toast.wired.Wired;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

public class ManaHealthChange implements Listener {

    @EventHandler
    public static void onHealthChange(EntityRegainHealthEvent event){
        if(event.getEntity() instanceof Player player) {

            if(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(player.getEquipment()).getHelmet()).getItemMeta()).getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Holy Grail Infused Mana Helmet")){
                if(Objects.requireNonNull(Objects.requireNonNull(player.getEquipment().getChestplate()).getItemMeta()).getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Holy Grail Infused Mana ChestPlate")){
                    if(Objects.requireNonNull(Objects.requireNonNull(player.getEquipment().getLeggings()).getItemMeta()).getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Holy Grail Infused Mana Leggings")){
                        if(Objects.requireNonNull(Objects.requireNonNull(player.getEquipment().getBoots()).getItemMeta()).getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Holy Grail Infused Mana Boots")){
                            Mana.MAX_ArcanePower.put(player, 500.0);
                            Mana.MANA_PER_SECOND.put(player, 5.0);
                        }
                    }
                }
            }

            new BukkitRunnable() {
                @Override
                public void run() {
                    Player.Spigot spigot = player.spigot();
                    spigot.sendMessage(ChatMessageType.ACTION_BAR,
                            (new TextComponent("❤" + ChatColor.RED + "" + ChatColor.BOLD + Math.round(player.getHealth()) + " " +
                                    ChatColor.AQUA + "\uD83E\uDDEA" + ChatColor.BOLD + Mana.getPlayerMana(player))));


                }


            }.runTaskTimer(Wired.getPlugin(), 0, 20);
        }
    }
}
