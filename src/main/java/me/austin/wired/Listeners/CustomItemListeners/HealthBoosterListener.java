package me.austin.wired.Listeners.CustomItemListeners;

import me.austin.wired.Utilities.Other.HealthBoosterUtils;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class HealthBoosterListener implements Listener {

    @EventHandler
    public void onAppleEat(PlayerItemConsumeEvent event){
        if (event.getItem().getType() == HealthBoosterUtils.createHealthBooster().getType()){
            Player player = event.getPlayer();
            Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getBaseValue() + 5.5);
            player.sendMessage(ChatColor.GREEN + "You have just consumed 5 hearts.");
        }
    }
    @EventHandler
    public void onAppleClick(PlayerInteractEvent event){
        if(event.getPlayer().getInventory().getItemInMainHand().getType().equals(HealthBoosterUtils.createHealthBooster().getType())){
            if(event.getAction() == Action.LEFT_CLICK_AIR){
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20*2, 255));
            }
        }
    }
}
