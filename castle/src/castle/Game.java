package castle;

import java.util.Scanner;

import Map.Map;

public class Game {
	Scanner in = new Scanner(System.in);

    private void printWelcome() {
        System.out.println();
        System.out.println("这是城堡游戏V1.0。");
        System.out.println("输入Yes，开始游戏。输入No，退出。");
    	String str = in.next();
    	if(str.equals("Yes"))
    	{
    		play();
    	}
    	if(str.equals("No"))
    	{
            System.out.println("感谢您的光临。再见！");
    	}
    }
    
    public void play() {
        System.out.println("你迷路了。\n幸运的是，你在天黑之前找到一个城堡。\n是否要进入？(Yes/No)");
    	String str = in.next();
    	if(str.equals("Yes"))
    	{
    		Map m = new Map();
    		while ( true ) {
    	        System.out.println();
    	        System.out.println();    	        
    	        System.out.println("你现在可以做的指令有");
        		String line = in.nextLine();
        		String[] words = line.split(" ");
        	}
    	}
    	if(str.equals("No"))
    	{
            System.out.println("“还是不进去了吧，这个城堡有点奇怪。”\n你这样想着，离开了城堡。\n game over");
    	}
    }
    
	public static void main(String[] args) {	
		Game game = new Game();
		game.printWelcome();
		in.close();
	}
	
}
