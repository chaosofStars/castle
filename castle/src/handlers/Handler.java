package handlers;

import java.util.HashMap;
import Map.Map;

public class Handler {
	private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
    protected Map map;
    
    public Handler(Map map) {
    	this.map = map;
    }
    
	public void doCmd(String word) {}
	
	public boolean isBye() {return false;}
	
}
