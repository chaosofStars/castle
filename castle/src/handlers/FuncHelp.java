package handlers;

import Map.Map;

public class FuncHelp extends Handler{
	
	public FuncHelp(Map map) {
		super(map);
	}
	@Override
	public void doCmd(String word) {
		System.out.println("你可以做的命令有:");
		System.out.println();
		System.out.println("如：\tgo east");
	} 
}
