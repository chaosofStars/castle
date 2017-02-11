package room;

public class Corridor extends Room{
	private String[] rooms;
	public Corridor(String name, String description) {
		super(name, description);
	}

	public void setExit(String str) {	
		rooms = str.split(" ");
	}

	@Override
	public String getExitDesc() {
		StringBuffer sb = new StringBuffer("现在你在二楼，有这几个房间可以去:");
		for (String dir : rooms) {
			sb.append(" ");
			sb.append(dir);
		}
		return sb.toString();
	}


	@Override
	public Room getExit(String room) {
		return super.getExit(room);
	}
	
}
