package de.denjakob.nohitdelay.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class NohitdelayListener implements Listener {
	
	@EventHandler
	public void handleJoin(PlayerJoinEvent e) {
		e.getPlayer().setMaximumNoDamageTicks(0);
	}
	
	@EventHandler
	public void handleRespawn(PlayerRespawnEvent e) {
		e.getPlayer().setMaximumNoDamageTicks(0);
	}

}
