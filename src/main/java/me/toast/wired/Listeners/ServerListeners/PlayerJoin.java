package me.toast.wired.Listeners.ServerListeners;

import me.toast.wired.Items.Armor.Starter.StarterBoots;
import me.toast.wired.Items.Armor.Starter.StarterChest;
import me.toast.wired.Items.Armor.Starter.StarterHelm;
import me.toast.wired.Items.Armor.Starter.StarterPants;
import me.toast.wired.PlayerUtils.Mana.Mana;
import me.toast.wired.PlayerUtils.PlayerVaults.VaultUtils;
import me.toast.wired.Wired;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        ChatColor color = ChatColor.GREEN;
        boolean hasPlayer = event.getPlayer().hasPlayedBefore();
        Player player = event.getPlayer();
        if (!hasPlayer) {
            event.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + "[Wired] " + color + "" + event.getPlayer().getName() + color + " has joined the server for the first time!");
            Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).getBaseValue() + 20);
            player.sendMessage(ChatColor.GREEN + "You have been given 20 additional health!");
            player.getInventory().addItem(new ItemStack(StarterBoots.createTankBoots()));
            player.getInventory().addItem(new ItemStack(StarterChest.createTankChestplate()));
            player.getInventory().addItem(new ItemStack(StarterPants.createTankPants()));
            player.getInventory().addItem(new ItemStack(StarterHelm.createIronHelmet()));
            player.sendMessage(ChatColor.GREEN + "You have been given a starter gear set!");
            player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
            player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE));
            player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 32));
            Mana.MAX_ArcanePower.put(event.getPlayer(), 100.0);
            Mana.MANA_PER_SECOND.put(event.getPlayer(), 0.5);
        }else{
            Mana.MAX_ArcanePower.put(event.getPlayer(), 100.0);
            Mana.MANA_PER_SECOND.put(event.getPlayer(), 0.5);
            event.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + "[Wired] " + color + "Welcome Back " + event.getPlayer().getName() + color + "!");
        }

        new BukkitRunnable() {
            @Override
            public void run() {
                if (event.getPlayer().isFlying()) {
                    if (Mana.getPlayerMana(player) <= 1) {
                        player.setFlying(false);
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.RED + "You are out of mana!");
                    } else{
                        Mana.removeMana(player, 1);
                    }
                }
                else{
                    Mana.removeMana(player, 0);
                }
            }
        }.runTaskTimer(Wired.getPlugin(), 0, 20);


        Player p = event.getPlayer();
        p.setHealthScaled(true);
        p.setHealthScale(20.0D);
        p.setHealth(20.00);
        PersistentDataContainer data = p.getPersistentDataContainer();

        if (!data.has(new NamespacedKey(Wired.getPlugin(), "vault"), PersistentDataType.STRING)){
            data.set(new NamespacedKey(Wired.getPlugin(), "vault"), PersistentDataType.STRING, "");


        }

    }
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e){

        Player p = (Player) e.getPlayer();

        if (e.getView().getTitle().equalsIgnoreCase("Your Personal Vault")){

            ArrayList<ItemStack> prunedItems = new ArrayList<>();

            Arrays.stream(e.getInventory().getContents())
                    .filter(Objects::nonNull)
                    .forEach(prunedItems::add);

            System.out.println("size: " + prunedItems.size());

            VaultUtils.storeItems(prunedItems, p);

        }

    }

}

