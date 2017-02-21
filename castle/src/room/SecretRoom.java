package room;


public class SecretRoom extends Room{
	private String key;
	
	public SecretRoom(String name, String description) {
		super(name, description);
	}
	
	public void SetKey(String Key) {
		this.key = Key;
	}
	
	public String getKey() {
		return key;
	}
	
	
}
