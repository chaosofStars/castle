package handler;

import Map.Map;
import human.Player;

public class HandlerShowPackage extends Handler {

	
	
	public HandlerShowPackage(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String cmd) {
		System.out.println(player.showPackage());
	}

	
}
