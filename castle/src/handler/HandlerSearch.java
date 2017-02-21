package handler;
import Map.Map;
import human.Player;

public class HandlerSearch extends Handler {

	
	
	public HandlerSearch(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String cmd) {
		if(!map.search().equals("你没有找到任何东西")){
			String[] words = map.search().split(" ");
			for(int i=0; i<words.length; i=i+2) {
				System.out.println("你得到了" + words[i]);
				player.setPackage(words[i], words[i+1]);
			}
		}else {
			System.out.println("你没有找到任何东西");
		}
	}

}
