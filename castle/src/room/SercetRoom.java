package room;

public class SercetRoom extends Room{

	public SercetRoom(String name, String description) {
		super(name, description);
	}

	@Override
	public void setExit(String dir, Room room) {
		super.setExit(dir, room);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getExitDesc() {
		return super.getExitDesc();
	}

	@Override
	public Room getExit(String direction) {
		return super.getExit(direction);
	}
	
}
