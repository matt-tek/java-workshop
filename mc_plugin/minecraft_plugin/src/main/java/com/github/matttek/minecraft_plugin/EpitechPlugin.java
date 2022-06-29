package com.github.matttek.minecraft_plugin;

import command.EpitechCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class EpitechPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        System.out.println("Disable");
        super.onDisable();
    }
    @Override
    public void onEnable() {
        System.out.println("Enable");
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("epitech").setExecutor(new EpitechCommand());
    }


}
