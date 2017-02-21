package handler;


import Map.Map;
import human.Player;

public class HandlerHelp extends Handler {


	

	public HandlerHelp(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String cmd) {		
		System.out.println("------------我是V1.0帮助------------");
		System.out.println("go命令包含方向：go[空格][出口名称]\n其他命令直接输入即可。");
		System.out.println("------------我是V1.0帮助------------");
	}
}
