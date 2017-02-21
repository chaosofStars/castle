package room;


public class RandomRoom extends Room {

	public RandomRoom(String name, String description) {
		super(name, description);
	}
	

	public Room choiceRoom(Room[] rooms) {
		int s = (int) (rooms.length * Math.random());
		return rooms[s];
	}
	
}
