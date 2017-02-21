package human;

import java.util.HashMap;


public class Player {
	private String name;
	private HashMap<String, String> pkg = new HashMap<String, String>();

	
	public Player() {
		name = "无名氏";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//需要数据库支撑
//	public void useItem(String item) {
//		if (pkg.containsKey(item)){
//			pkg.remove(item);
//			System.out.println("你使用了"+item);
//		}else {
//			System.out.println("你要找的物品不存在");
//		}
//	}
	
	public String showPackage() {
		if(pkg == null){
			return "你的背包是空哒。";
		}else {
			return pkg.toString();	
		}
	}
	
	public void setPackage(String name,String direction) {
		pkg.put(name, direction);
	}
	
	public Boolean hasKey(String key) {
		if(pkg.containsKey(key)) {
			return true;
		}else {
			return false;
		}
	}
}
