package me.toast.wired.Items.Enchantments;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Enchantments {


    public static final Enchantment ARMOR = new EnchantmentWrapper("armor", "Armor", 7);

    public static void register(){
        boolean registered = Arrays.stream(Enchantment.values()).toList().contains(ARMOR);
        if(!registered){
            registerEnchantments(ARMOR);
        }
    }
    public static void registerEnchantments(Enchantment enchantment){
        boolean registered = true;
        try{
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        }catch(Exception e){
            registered = false;
            e.printStackTrace();
        }
        if(registered){
            System.out.println("Registered enchantment: " + enchantment.getKey());
        }
    }


}
