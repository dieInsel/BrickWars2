package me.dieinsel.brickwars.manager;

import org.bukkit.Location;
import java.util.HashMap;


public class CoreManager {
    public static HashMap<String, Location> cores = new HashMap<>();

    public Location getCoreLocation(String name) {
        return cores.get(name);
    }

}
