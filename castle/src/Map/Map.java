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
		
	    //	制造房间
	    entrance = new Room("玄关",
	    		"城堡的大门关闭了，你只能前进。");
	    
	    lobby = new Room("大厅",
	    		"这是城堡的大厅。");
	    
	    stairs = new Room("楼梯",
	    		"这是一个向上盘旋的楼梯，通向城堡的二楼。");
	    
	    kitchen = new FoodRoom("厨房",
	    		"这是城堡的食堂，里面放满了各种食物。");
	    
	    diningRoom = new FoodRoom("餐厅",
	    		"这是城堡的餐厅，一位绅士正在吃汤圆。");
	    
	    parlour = new Room("会客厅",
	    		"显然，这是城堡主人待客的地方。但主人此刻却不在这里。");
	    
	    pub = new FoodRoom("酒吧",
	    		"酒吧里觥筹交错，音乐声如炸雷般在你耳边响起，但奇怪的是在外面你却丝毫感受不到音乐声。"
	    		+ "\n真是隔音很好的房间呢，你想");
	    
	    study = new Room("书房",
	    		"城堡主人此时正静静的在看书。他好像并没有察觉到你的到来。");
	    
	    bedroom1 = new BedRoom("卧室1",
	    		"这是一个绿色的房间，里面一切都是绿色的。绿色的床，绿色的枕头，绿色的柜子。");
	    
	    bedroom2 = new BedRoom("卧室2",
	    		"这是一个蓝色的房间，里面一切都是蓝色的。蓝色的床，蓝色的枕头，蓝色的柜子。");
	    
	    bedroom3 = new BedRoom("卧室3",
	    		"这是一个红色的房间，里面一切都是红色的。红色的床，红色的枕头，红色的柜子。");
	    
	    MasterBedroom = new Room("城堡主人的卧室",
	    		"这是个正常的房间，和你自己的房间并没有什么不同。"
	    		+ "除了墙上的画像，它表明了这是城堡主人的房间。");
	    
	    randomRoom = new RandomRoom("传送门","啊，这个房间是");
	    
	    sercetRoom1 = new SercetRoom("密室","这个房间密不透风，让你感到一点胸闷");
	    
	    sercetRoom2 = new SercetRoom("密室2",
	    		"房间里站着一位姑娘，你发誓从来没见过她，却莫名的眼熟。");
	    
	    corridor = new Corridor("走廊","这里是二楼走廊，有几个房间可以去。");
	    
	    outside = new Room("城堡外","你跑出了城堡，身后的大门关闭了。\n所以你在山岭中度过了一夜。");
	    
	    //	初始化房间的出口
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
	    currentRoom = entrance;  //	从玄关开始
	}
	
	//放置物品
	
    private void showPrompt(){
    	System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.print(currentRoom.getExitDesc());
    }
    
    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
}