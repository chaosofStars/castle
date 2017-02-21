package Map;

import room.Room;
import room.SecretRoom;
import human.Player;
import room.BedRoom;
import room.FoodRoom;
import room.RandomRoom;

public class Map {
    private Room currentRoom;
    private Room outside;
    Player player;
    Room[] rooms;
    
	public Map(Player player) {
		this.player = player;
		Room lobby,entrance,stairs,parlour,study;
		BedRoom  bedroom1,bedroom2,bedroom3,MasterBedroom;
		Room corridor;
		SecretRoom secretRoom1,secretRoom2;
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
	    		"���ǳǱ��Ĳ������㷢�������Ϻ����ж�����");
	    
	    parlour = new Room("����",
	    		"��Ȼ�����ǳǱ����˴��͵ĵط���");
	    
	    pub = new FoodRoom("�ư�",
	    		"�ư������ｻ����������ը�װ�����������𣬵���ֵ�����������ȴ˿�����ܲ�����������"
	    		+ "\n���Ǹ����ܺõķ����أ�����");
	    
	    study = new Room("�鷿",
	    		"��������������鷿");
	    
	    bedroom1 = new BedRoom("����1",
	    		"����һ����ɫ�ķ��䣬����һ�ж�����ɫ�ġ���ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�");
	    
	    bedroom2 = new BedRoom("����2",
	    		"����һ����ɫ�ķ��䣬����һ�ж�����ɫ�ġ�"
	    		+ "��ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�"
	    		+ "\n(��ϸ���ҿ���û�ж���)");
	    
	    bedroom3 = new BedRoom("����3",
	    		"����һ����ɫ�ķ��䣬����һ�ж��Ǻ�ɫ�ġ�"
	    		+ "��ɫ�Ĵ�����ɫ����ͷ����ɫ�Ĺ��ӡ�"
	    		+ "\n(��ϸ���ҿ���û�ж���)");
	    
	    MasterBedroom = new BedRoom("�Ǳ����˵�����",
	    		"���Ǹ������ķ��䣬�����Լ��ķ��䲢û��ʲô��ͬ��"
	    		+ "\n����ǽ�ϵĻ��������������ǳǱ����˵ķ��䡣"
	    		+ "(\n��ϸ���ҿ���û�ж���)");
	    
	    randomRoom = new RandomRoom("�շ���","(��������ҵ�һ�Ѻ�Կ�ף��ٽ������ܻ᲻һ������");
	    
	    secretRoom1 = new SecretRoom("����","��������ܲ�͸�磬����е�һ������");
	    
	    secretRoom2 = new SecretRoom("����2",
	    		"����һ������һģһ�������ȵ�");
	    
	    corridor = new Room("����","�����Ƕ�¥���ȣ��м����������ȥ��");
	    
	    outside = new Room("�Ǳ���","���ܳ��˳Ǳ������Ĵ��Źر��ˡ�\n��������ɽ���жȹ���һҹ��");
	    
	    //	��ʼ������ĳ���
	    entrance.setExit("south", lobby);
	    lobby.setExit("east", diningRoom);
	    lobby.setExit("north", entrance);
	    lobby.setExit("west", parlour);
	    lobby.setExit("south", pub);
	    stairs.setExit("up", corridor);
	    stairs.setExit("down", parlour);
	    kitchen.setExit("east", outside);
	    kitchen.setExit("south", diningRoom);
	    diningRoom.setExit("west", lobby);
	    diningRoom.setExit("north", kitchen);
	    parlour.setExit("east", lobby);
	    parlour.setExit("north", stairs);
	    pub.setExit("north", lobby);
	    study.setExit("out", corridor);
	    MasterBedroom.setExit("out", corridor);
	    MasterBedroom.setExit("south", secretRoom1);	    
	    bedroom1.setExit("out", corridor);
	    bedroom2.setExit("out", corridor);
	    bedroom3.setExit("out", corridor);;
	    randomRoom.setExit("east", secretRoom1);
	    secretRoom1.setExit("out",MasterBedroom);
	    secretRoom1.setExit("east",secretRoom2);
	    secretRoom1.setExit("west",randomRoom);
	    secretRoom2.setExit("out",secretRoom1);
	    corridor.setExit("stairs",stairs);
	    corridor.setExit("bedroom1",bedroom1);
	    corridor.setExit("bedroom2",bedroom2);
	    corridor.setExit("bedroom3",bedroom3);
	    corridor.setExit("study",study);
	    corridor.setExit("MasterBedroom",MasterBedroom);
	    currentRoom = entrance;  //	�����ؿ�ʼ

		//������Ʒ
	    pub.setFood("����", "һ����ͨ�Ŀ��֡�\n������ĥ͸���ݿ�֮ǰ��ֻ�ܿ�������");
	    kitchen.setFood("���", "һ����ͨ�������\n������ĥ͸���ݿ�֮ǰ��ֻ�ܿ�������");
	    diningRoom.setFood("�ɿ���", "���԰ײ���");
	    pub.setFood("��", "�Ⱦ��к�����");
	    bedroom3.setKey("��ɫԿ��");
	    MasterBedroom.setKey("��ɫԿ��");
	    
	    //��������Կ��
	    secretRoom1.SetKey("��ɫԿ��");
	    secretRoom2.SetKey("��ɫԿ��");
	    bedroom2.setKey("��ɫԿ��");
	    
	    //NPC
	    study.setNpc("�Ǳ�����", "������˯�¾���������Բľ���Կ���",
	    		"����Boss������V1.0�治�ܺ��㻥����");
	    parlour.setNpc("�ܼ�", "��ת��ͷ����������",
	    		"�����Ӧ��ȥ���ߵ�¥�����ƣ�¥�ϻ�����Щ�ö���");
	    pub.setNpc("�Ʊ�", "�����ż������ӣ�ҡ����ȥ�������ڡ������ƣ�",
	    		"�����㿴�������������ڵ��ƣ���Ҫʲô�Լ��ã�������Ҳ���ܺ��㻥��");
	    secretRoom2.setNpc("����", "������ȥ�е���������", 
	    		"�����ҵ��ң�˵����Ϸ�Ѿ�����ȫ�����һ���ˣ��������ĵ��˰���"
	    		+ "��취���������Ϸ�ɡ�");

	}

    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        //�ж����Ƿ��ܴ�
        if (nextRoom == null) {
            System.out.println("����û���ţ�");
        }else if (nextRoom instanceof SecretRoom){
        	//�����Ŵ��ж�
	       	if(player.hasKey(((SecretRoom) nextRoom).getKey())) {
	       		currentRoom = nextRoom;
	       	}else {
	        	 System.out.println("��û��Կ�ף����������޷��򿪣��Ͻ�ȥ���Ұ�\n����Ҫ��" 
	        			 + ((SecretRoom) nextRoom).getKey());
	        }
        }else if (nextRoom instanceof RandomRoom){
        	if(player.hasKey("��ɫԿ��")){
        		currentRoom = outside;
        	}else {
        		currentRoom = nextRoom;
        	}
        }else {
	            currentRoom = nextRoom;
	    }
    }
    
	//game����
	public Boolean isOutSide() {
		if(currentRoom.equals(outside)) {
			return true;
		}else {
			return false;
		}
	}
    
	//Handler ����
    public Room getCurrentRoom() {
    	return currentRoom;
    }
    
    
    public String npctalk() {
		return currentRoom.NPCtalk();
	}
    
    public String search() {
    	return currentRoom.Search();
    }
    

}