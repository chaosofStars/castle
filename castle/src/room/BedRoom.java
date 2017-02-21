package room;
import item.Bed;
import item.Key;

public  class BedRoom extends Room implements Bed,Key {
	private String KeyName;
	
	public BedRoom(String name,String description) {
		super(name,description);
	}

	
	//Sleep
	@Override
	public void sleep() {
		System.out.println("反正V1.0还没有加疲劳值，睡了也是白睡。\n（反正不要钱，多少睡一会儿~(≧▽≦)/）");
	}
	
	//Key
	@Override
	public void setKey(String keyName) {
		KeyName = keyName;
	}
	
	@Override
	public String Search() {
		return KeyName +" "+"可以进入你打不开的房间" ;
	}
	
}
