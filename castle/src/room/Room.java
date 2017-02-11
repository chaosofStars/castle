package room;

import java.util.HashMap;

public class Room {
	private String name;
	private String description;
	private HashMap<String, Room> exits = new HashMap<String, Room>();
	
	public Room(String name,String description) {
		this.name = name;
		this.description = description;
	}
	
	
	public void setExit(String dir, Room room) {
		exits.put(dir, room);
	}

	@Override
	public String toString() {
		return name+":"+description;
	}

	public String getExitDesc() {
		StringBuffer sb = new StringBuffer("现在你可以去");
		for (String dir : exits.keySet()) {
			sb.append(" ");
			sb.append(dir);
		}
		return sb.toString();
	}

	public Room getExit(String direction) {
		return exits.get(direction);
	}
	
	public void showCmd(){
		return ;
	}
	
}
