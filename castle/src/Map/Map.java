package Map;

import room.Room;
import room.Corridor;
import room.BedRoom;
import room.FoodRoom;
import room.RandomRoom;
import room.SercetRoom;

public class Map {
    private Room currentRoom;
    
	public Map() {
		Room outside,lobby,entrance,stairs,parlour,study,MasterBedroom;
		BedRoom  bedroom1,bedroom2,bedroom3;
		Corridor corridor;
		SercetRoom sercetRoom1,sercetRoom2;
		RandomRoom randomRoom;
		FoodRoom pub,kitchen,diningRoom;
		
	    //	���췿��
	    entrance = new Room("����",
	    		"�Ǳ��Ĵ��Źر��ˣ���ֻ��ǰ����");
	    
	    lobby = new Room("����",
	    		"���ǳǱ��Ĵ�����");
	    
	    stairs = new Room("¥��",
	    		"����һ������������¥�ݣ�ͨ��Ǳ��Ķ�¥��");
	    
	    kitchen = new FoodRoom("����",
	    		"���ǳǱ���ʳ�ã���������˸���ʳ�");
	    
	    diningRoom = new FoodRoom("����",
	    		"���ǳǱ��Ĳ�����һλ��ʿ���ڳ���Բ��");
	    
	    parlour = new Room("�����",
	    		"��Ȼ�����ǳǱ����˴��͵ĵط��������˴˿�ȴ�������");
	    
	    pub = new FoodRoom("�ư�",
	    		"�ư������ｻ����������ը�װ�����������𣬵���ֵ�����������ȴ˿�����ܲ�����������"
	    		+ "\n���Ǹ����ܺõķ����أ�����");
	    
	    study = new Room("�鷿",
	    		"�Ǳ����˴�ʱ���������ڿ��顣������û�в������ĵ�����");
	    
	    bedroom1 = new BedRoom("����1",
	    		"����һ����ɫ�ķ��䣬����һ�ж�����ɫ�ġ���ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�");
	    
	    bedroom2 = new BedRoom("����2",
	    		"����һ����ɫ�ķ��䣬����һ�ж�����ɫ�ġ���ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�");
	    
	    bedroom3 = new BedRoom("����3",
	    		"����һ����ɫ�ķ��䣬����һ�ж��Ǻ�ɫ�ġ���ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�");
	    
	    MasterBedroom = new Room("�Ǳ����˵�����",
	    		"���Ǹ������ķ��䣬�����Լ��ķ��䲢û��ʲô��ͬ��"
	    		+ "����ǽ�ϵĻ��������������ǳǱ����˵ķ��䡣");
	    
	    randomRoom = new RandomRoom("������","�������������");
	    
	    sercetRoom1 = new SercetRoom("����","��������ܲ�͸�磬����е�һ������");
	    
	    sercetRoom2 = new SercetRoom("����2",
	    		"������վ��һλ����㷢�Ĵ���û��������ȴĪ�������졣");
	    
	    corridor = new Corridor("����","�����Ƕ�¥���ȣ��м����������ȥ��");
	    
	    outside = new Room("�Ǳ���","���ܳ��˳Ǳ������Ĵ��Źر��ˡ�\n��������ɽ���жȹ���һҹ��");
	    
	    //	��ʼ������ĳ���
	    entrance.setExit("south", lobby);
	    lobby.setExit("east", parlour);
	    lobby.setExit("north", entrance);
	    lobby.setExit("west", diningRoom);
	    lobby.setExit("south", pub);
	    stairs.setExit("up", corridor);
	    stairs.setExit("down", parlour);
	    kitchen.setExit("east", outside);
	    kitchen.setExit("south", diningRoom);
	    diningRoom.setExit("east", lobby);
	    parlour.setExit("east", lobby);
	    parlour.setExit("north", stairs);
	    pub.setExit("east", lobby);
	    study.setExit("south", corridor);
	    MasterBedroom.setExit("north", corridor);
	    bedroom1.setExit("north", corridor);
	    bedroom2.setExit("south", corridor);
	    bedroom3.setExit("north", corridor);;
//	    randomRoom,SercetRoom1,SercetRoom2,
	    corridor.setExit("bedroom1,bedroom2,bedroom3,study,MasterBedroom");
	    currentRoom = entrance;  //	�����ؿ�ʼ
	}
	
	//������Ʒ
	
    private void showPrompt(){
    	System.out.println("����" + currentRoom);
        System.out.print("������: ");
        System.out.print(currentRoom.getExitDesc());
    }
    
    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("����û���ţ�");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
}