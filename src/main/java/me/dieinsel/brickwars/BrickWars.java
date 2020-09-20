package me.dieinsel.brickwars;

import me.dieinsel.brickwars.manager.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class BrickWars extends JavaPlugin {

    public static BrickWars instance;


    @Override
    public void onEnable() {
        BrickWars.instance = this;
        ConfigManager.createCustomConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static BrickWars getInstance() { return instance; }
}
