package handler;

import java.util.HashMap;
import Map.Map;
import human.Player;

public class Handler {
	private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
    protected Map map;
    protected Player player;
    
	public Handler(Map map,Player player) {
		this.map = map;
		this.player = player;
	}
	
	public boolean isBye() {return false;}

	public void setCmd(Map map) {
    	handlers.put("go", new HandlerGO(map,player));
    	//ȡ��bye����  	
//    	handlers.put("bye", new HandlerBye(map,player));
    	
    	handlers.put("help", new HandlerHelp(map,player));
    	
    	handlers.put("showpackage", new HandlerShowPackage(map,player));
    	
    	handlers.put("search", new HandlerSearch(map,player)); 
    	if(map.getCurrentRoom().HasNPC()){
    		handlers.put("talk", new HandlerTalk(map,player));
    	}
    }
    
    public void doCmd(String cmd) {
    		String words[] = cmd.split(" ");
	    	Handler handler = handlers.get(words[0]);
	    	String value = "";
	    	if(words.length >1 )
	    		value = words[1];
	    	if(handler != null)
	    	{
	    		handler.doCmd(value);
	    	}else {
	    		System.out.println("�������������Ч����������ȷ�����");
	    	}
    }
    

    

	public void showCmd() {
		System.out.println("------------------------------");
		System.out.println("����" + map.getCurrentRoom());
        System.out.print("������: ");
	    System.out.print(map.getCurrentRoom().getExitDesc());
	    System.out.println("\n���������ָ���У�"+ handlers.keySet());
		System.out.println("����help���鿴��ϸ����");
		System.out.println("------------------------------");
	}

	
}
