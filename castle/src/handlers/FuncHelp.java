package handlers;

import Map.Map;

public class FuncHelp extends Handler{
	
	public FuncHelp(Map map) {
		super(map);
	}
	@Override
	public void doCmd(String word) {
		System.out.println("���������������:");
		System.out.println();
		System.out.println("�磺\tgo east");
	} 
}
