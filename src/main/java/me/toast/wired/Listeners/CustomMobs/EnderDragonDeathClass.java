package me.toast.wired.Listeners.CustomMobs;

import me.toast.wired.Items.Ores.HolyGrailFragments;
import me.toast.wired.Items.Tools.Shovel.FastShovelUtils;
import me.toast.wired.Items.Tools.Swords.HardenedIronSwordUtils;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;

public class EnderDragonDeathClass implements Listener {


    @EventHandler
    public static void onEnderDragonDeath(EntityDeathEvent event){
        if(event.getEntity() instanceof EnderDragon enderDragon){
            event.getDrops().clear();
            event.setDroppedExp(500000);
            Objects.requireNonNull(enderDragon.getKiller()).getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentMiddlePiece());
            enderDragon.getKiller().getInventory().addItem(HolyGrailFragments.createHolyGrailFragmentSurrounding());

            enderDragon.getKiller().getInventory().addItem(HardenedIronSwordUtils.CreateHardenedIronSword());
            enderDragon.getKiller().getInventory().addItem(FastShovelUtils.createFastShovel());

        }

    }
}
