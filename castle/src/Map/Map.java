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
	    		"这是城堡的餐厅，你发现桌子上好像有东西。");
	    
	    parlour = new Room("客厅",
	    		"显然，这是城堡主人待客的地方。");
	    
	    pub = new FoodRoom("酒吧",
	    		"酒吧里觥筹交错，音乐声如炸雷般在你耳边响起，但奇怪的是在外面你却丝毫感受不到音乐声。"
	    		+ "\n真是隔音很好的房间呢，你想");
	    
	    study = new Room("书房",
	    		"这是你见过最大的书房");
	    
	    bedroom1 = new BedRoom("卧室1",
	    		"这是一个绿色的房间，里面一切都是绿色的。绿色的床，绿色的枕头，绿色的柜子。");
	    
	    bedroom2 = new BedRoom("卧室2",
	    		"这是一个蓝色的房间，里面一切都是蓝色的。"
	    		+ "蓝色的床，蓝色的枕头，蓝色的柜子。"
	    		+ "\n(仔细找找看有没有东西)");
	    
	    bedroom3 = new BedRoom("卧室3",
	    		"这是一个红色的房间，里面一切都是红色的。"
	    		+ "红色的床，红色的枕头，红色的柜子。"
	    		+ "\n(仔细找找看有没有东西)");
	    
	    MasterBedroom = new BedRoom("城堡主人的卧室",
	    		"这是个正常的房间，和你自己的房间并没有什么不同。"
	    		+ "\n除了墙上的画像，它表明了这是城堡主人的房间。"
	    		+ "(\n仔细找找看有没有东西)");
	    
	    randomRoom = new RandomRoom("空房间","(如果你能找到一把红钥匙，再进来可能会不一样。）");
	    
	    secretRoom1 = new SecretRoom("密室","这个房间密不透风，让你感到一点胸闷");
	    
	    secretRoom2 = new SecretRoom("密室2",
	    		"和上一个密室一模一样……等等");
	    
	    corridor = new Room("走廊","这里是二楼走廊，有几个房间可以去。");
	    
	    outside = new Room("城堡外","你跑出了城堡，身后的大门关闭了。\n所以你在山岭中度过了一夜。");
	    
	    //	初始化房间的出口
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
	    currentRoom = entrance;  //	从玄关开始

		//放置物品
	    pub.setFood("可乐", "一杯普通的可乐。\n在我琢磨透数据库之前你只能看看咯。");
	    kitchen.setFood("面包", "一杯普通的面包。\n在我琢磨透数据库之前你只能看看咯。");
	    diningRoom.setFood("巧克力", "不吃白不吃");
	    pub.setFood("酒", "喝酒有害健康");
	    bedroom3.setKey("紫色钥匙");
	    MasterBedroom.setKey("蓝色钥匙");
	    
	    //设置密室钥匙
	    secretRoom1.SetKey("蓝色钥匙");
	    secretRoom2.SetKey("紫色钥匙");
	    bedroom2.setKey("红色钥匙");
	    
	    //NPC
	    study.setNpc("城堡主人", "他穿着睡衣静静的坐在圆木桌旁看书",
	    		"我是Boss，但是V1.0版不能和你互动了");
	    parlour.setNpc("管家", "他转过头来看向了你",
	    		"你或许应该去北边的楼梯瞧瞧，楼上或许有些好东西");
	    pub.setNpc("酒保", "他对着几个杯子，摇来晃去，或许在……调酒？",
	    		"就像你看到的那样，我在调酒，需要什么自己拿，反正我也不能和你互动");
	    secretRoom2.setNpc("公主", "她看上去有点无所事事", 
	    		"你能找到我，说明游戏已经被你全部玩过一遍了，真是无聊的人啊。"
	    		+ "想办法结束这个游戏吧。");

	}

    public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        //判断门是否能打开
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }else if (nextRoom instanceof SecretRoom){
        	//密室门打开判断
	       	if(player.hasKey(((SecretRoom) nextRoom).getKey())) {
	       		currentRoom = nextRoom;
	       	}else {
	        	 System.out.println("你没有钥匙，这扇门你无法打开，赶紧去找找吧\n你需要：" 
	        			 + ((SecretRoom) nextRoom).getKey());
	        }
        }else if (nextRoom instanceof RandomRoom){
        	if(player.hasKey("红色钥匙")){
        		currentRoom = outside;
        	}else {
        		currentRoom = nextRoom;
        	}
        }else {
	            currentRoom = nextRoom;
	    }
    }
    
	//game调用
	public Boolean isOutSide() {
		if(currentRoom.equals(outside)) {
			return true;
		}else {
			return false;
		}
	}
    
	//Handler 调用
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