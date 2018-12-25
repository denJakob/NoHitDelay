package de.denjakob.nohitdelay.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.denjakob.nohitdelay.listener.NohitdelayListener;

public class Main extends JavaPlugin {
	
	private static Main plugin;
	
	public void onEnable() {
		plugin = this;
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new NohitdelayListener(), this);
	}
	
	public static Main getPlugin() {
		return plugin;
	}

}
