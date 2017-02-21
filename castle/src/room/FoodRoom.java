package room;

import java.util.HashMap;
import java.util.Map.Entry;

import item.Food;

public class FoodRoom extends Room implements Food{
	private HashMap<String, String> foods = new HashMap<String, String>();
	public FoodRoom(String name, String description) {
		super(name, description);
	}
	
	@Override
	public String Search(){
		StringBuffer sb = new StringBuffer();
		for (Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey().toString());
			sb.append(" ");
			sb.append(entry.getValue().toString());
			sb.append(" ");
		}
		return sb.toString();
	};
	
	@Override
	public void setFood(String food, String direction) {
		foods.put(food, direction);
	}
	
}
