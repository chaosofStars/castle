package room;

import item.Food;

public class FoodRoom extends Room implements Food{
	private String[] foods;
	public FoodRoom(String name, String description) {
		super(name, description);
	}

	@Override
	public void getfood() {
		
	}


	@Override
	public String search() {
		StringBuffer sb = new StringBuffer();
		for(String i: foods ){
			sb.append(i);
			sb.append(" ");
		}
		return sb.toString();
	}

	@Override
	public void setFood(String food) {
		foods = food.split(" ");
	}
	
}
