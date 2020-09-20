package me.dieinsel.brickwars.manager;

import me.dieinsel.brickwars.BrickWars;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    public static File customConfigFile;
    public static FileConfiguration customConfig;

    public static FileConfiguration getCustomConfig() { return ConfigManager.customConfig; }

    public static void createCustomConfig() {
        customConfigFile = new File(BrickWars.getInstance().getDataFolder(), "teams.yml");
        if (!customConfigFile.exists()) {
            customConfigFile.getParentFile().mkdirs();
            BrickWars.getInstance().saveResource("teams.yml", false);
        }

        customConfig = new YamlConfiguration();

        try {
            customConfig.load(customConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static void createTeam(String teamName) {

    }

    public static void setTeamSpawner(SpanwerManager.SpawnerType type, String teamName, Location location) {
        // y = spawner markierung + 2
    }

    public static void setCore(String teamName, Location location) {

    }
}
