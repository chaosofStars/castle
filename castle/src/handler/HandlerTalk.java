package handler;

import Map.Map;
import human.Player;

public class HandlerTalk extends Handler{

	
	
	public HandlerTalk(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String cmd) {
		System.out.println(map.npctalk());
	}
	
}
