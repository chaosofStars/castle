package handler;
import Map.Map;
import human.Player;

public class HandlerSearch extends Handler {

	
	
	public HandlerSearch(Map map, Player player) {
		super(map, player);
	}

	@Override
	public void doCmd(String cmd) {
		if(!map.search().equals("��û���ҵ��κζ���")){
			String[] words = map.search().split(" ");
			for(int i=0; i<words.length; i=i+2) {
				System.out.println("��õ���" + words[i]);
				player.setPackage(words[i], words[i+1]);
			}
		}else {
			System.out.println("��û���ҵ��κζ���");
		}
	}

}
