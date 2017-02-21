package castle;

import java.util.Scanner;
import Map.Map;
import handler.Handler;
import human.Player;

public class Game {
	private Map map;
	private Handler handler;
	private Player player;
	Scanner in = new Scanner(System.in);
	
	public Game(){
	    player = new Player();
		this.map = new Map(player);
    	handler = new Handler(map,player);
        System.out.println("游戏载入完毕。这是城堡游戏V1.0。");
        System.out.println("欢迎试玩。");
	}    
	
    public void play() {
    	//创建玩家
	    System.out.println("给自己起个名字吧。\n(虽然在这个版本用不上，下个版本就不一定咯)");
	    String line = in.nextLine();
	    player.setName(line);
	    //游戏开始
    	System.out.println(line + ",你迷路了。"
      		+ "\n幸运的是，你在天黑之前找到一个城堡。\n是否要进入？(yes/No)");
    	line = in.nextLine();
    	
		if(line.equals("yes"))
		{  
    		//游戏主体
	    	while(true) {
	    		handler.setCmd(map);
			    handler.showCmd();
			    line = in.nextLine();
			    handler.doCmd(line);
				if (map.isOutSide()) {
					System.out.println("你在"+map.getCurrentRoom());
				    break;
			    }
			   
	    	}
		}else {
	        System.out.println("“还是不进去了吧，这个城堡有点奇怪。”\n你这样想着，离开了城堡。");
	        in.close();
		}
    }
    
	public static void main(String[] args) {	
		Game game = new Game();
		game.play();
		System.out.println("谢谢试玩。\ngame over");
	}
	
}
