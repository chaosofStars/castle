package handler;

import Map.Map;
import human.Player;

public class HandlerGO extends Handler {

	

	public HandlerGO(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String direction) {
		map.goRoom(direction);	
	}
}
