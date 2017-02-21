package room;

import java.util.HashMap;

import human.NPC;

public class Room {
	private NPC npc;
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
		if(npc != null){
			return name+"\n"+description+"\n"+npc;
		}else{
			return name+"\n"+description;
		}
	}

	public String getExitDesc() {
		StringBuffer sb = new StringBuffer("");
		for (String dir : exits.keySet()) {
			sb.append(dir);
			sb.append(" ");
		}
		return sb.toString();
	}

	public Room getExit(String direction) {
		return exits.get(direction);
	}
	
	//food & Key
	public String Search(){
		return "你没有找到任何东西";
	};
	
	//npc
	public void setNpc(String name,String dress,String action){
		this.npc = new NPC(name ,dress ,action);
	}
	
	public Boolean HasNPC(){
		if(npc != null){
			return true;
		}else {
			return false;
		}
	}
	
	public String NPCtalk(){
		return npc.getName()+":"+npc.doAction();
	}
	
}
