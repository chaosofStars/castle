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
		System.out.println("����V1.0��û�м�ƣ��ֵ��˯��Ҳ�ǰ�˯��\n��������ҪǮ������˯һ���~(�R���Q)/��");
	}
	
	//Key
	@Override
	public void setKey(String keyName) {
		KeyName = keyName;
	}
	
	@Override
	public String Search() {
		return KeyName +" "+"���Խ�����򲻿��ķ���" ;
	}
	
}
