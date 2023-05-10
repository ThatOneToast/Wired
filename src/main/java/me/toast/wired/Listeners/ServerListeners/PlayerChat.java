package me.toast.wired.Listeners.ServerListeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {

    @EventHandler
    public static void onPlayerChat(AsyncPlayerChatEvent event){
        if(event.getPlayer().getName().equals("ToastARG")){
            event.setFormat(ChatColor.RED + "[OP] [DEV] " + ChatColor.GOLD + "" + event.getFormat());
        }
        else if(event.getPlayer().getName().equals("SpanglesLUL")) {
            event.setFormat(ChatColor.RED + "[OP] " + ChatColor.BLUE+"[TEXTURES] " + ChatColor.LIGHT_PURPLE + "" + event.getFormat());
        } else if(event.getPlayer().getName().equals("MusicZae")){
            event.setFormat(ChatColor.RED + "[OP] " + ChatColor.LIGHT_PURPLE + "[GUINEAPIG] " + ChatColor.AQUA + "" + event.getFormat());
        }else if(event.getPlayer().getName().equals("Bubbak984")){
            event.setFormat(ChatColor.RED + "[OP] [DEV] " + ChatColor.GOLD + "" + event.getFormat());
        }else if(event.getPlayer().getName().equals("ArcanicSHI")){
            event.setFormat(ChatColor.RED + "[OP] " + ChatColor.GOLD + "" + event.getFormat());
        }
        else{
            event.setFormat(ChatColor.GREEN + "[Human] " + ChatColor.GRAY +  "" + event.getFormat());
        }


    }

}
