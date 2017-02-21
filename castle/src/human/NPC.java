package human;

public class NPC {
	private String name;
	private String dress;
	private String action;
	
	
	public NPC(String name, String dress, String action) {
		this.name = name;
		this.dress = dress;
		this.action = action;
	}
	
	public String getName(){
		return name;
	}
	public String doAction(){
		return action;
	}

	@Override
	public String toString() {
		return "ƒ„∑¢œ÷¡À"+name+","+dress;
	}
	
	
}
