package room;
import item.Bed;
import item.Key;

public  class BedRoom extends Room implements Bed,Key {
	
	public BedRoom(String name,String description) {
		super(name,description);
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getKey() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setKey() {
		// TODO Auto-generated method stub
		
	}
}
