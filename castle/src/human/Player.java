package human;

import java.util.HashMap;


public class Player {
	private String name;
	private HashMap<String, String> pkg = new HashMap<String, String>();

	
	public Player() {
		name = "������";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//��Ҫ���ݿ�֧��
//	public void useItem(String item) {
//		if (pkg.containsKey(item)){
//			pkg.remove(item);
//			System.out.println("��ʹ����"+item);
//		}else {
//			System.out.println("��Ҫ�ҵ���Ʒ������");
//		}
//	}
	
	public String showPackage() {
		if(pkg == null){
			return "��ı����ǿ��ա�";
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
