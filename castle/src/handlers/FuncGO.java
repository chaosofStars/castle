package handlers;

import Map.Map;

public class FuncGO extends Handler{
	
	public FuncGO(Map map) {
		super(map);
	}
	@Override
	public void doCmd(String word) {
		map.goRoom(word);
	}
}
