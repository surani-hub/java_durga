import java.util.TreeMap;

class TreeMapDemo{
	public static void main(String[] args){
		
		TreeMap t = new TreeMap();
		//t.put(null, "mom");
		
		t.put(100,"sudha");
		t.put(300,"rani");
		t.put(200, "raja");
		t.put(500,"chinni");
		t.put(600,"paaki");
		t.put(400, "pinky");
		
		System.out.println(t);
		
		t.remove(100);
		System.out.println(t);
		
		t.replace(200, "sudha");
		System.out.println(t);
		
		t.replace(200, "sudha", "happiest");
		System.out.println(t);
		
		System.out.println(t.subMap(300,500)); //300=rani,400=pinky
		System.out.println(t.subMap(300, false, 500, true)); // 400=pinky,500=chinni
		
		System.out.println(t.tailMap(300)); // 300=rani,400=pinky,500=chinni,600=paaki
		System.out.println(t.tailMap(300, false )); //400=pinky,500=chinni,600=paaki
		
		/*
		System.out.println(t.keySet());
		
		System.out.println(t.pollFirstEntry()); //100=sudha
		System.out.println(t.pollLastEntry()); //600=paaki
		
		System.out.println(t.navigableKeySet());
		
		System.out.println(t.headMap(300)); //100=sudha,200=raja
		System.out.println(t.headMap(300, true)); //100=sudha,200=raja,300=rani
		
		System.out.println();
		
		System.out.println(t.higherEntry(300)); // 400=pinky
		System.out.println(t.higherEntry(700)); // null
		System.out.println(t.higherEntry(50)); // 100=sudha
		
		System.out.println();
		
		System.out.println(t.lowerEntry(300)); // 200=raja
		System.out.println(t.lowerEntry(700)); // 600=paaki
		System.out.println(t.lowerEntry(50)); // null
		
		System.out.println("**************************************************************");
		
		System.out.println(t.higherKey(300)); // 400
		System.out.println(t.higherKey(700)); // null
		System.out.println(t.higherKey(50)); // 100
		
		System.out.println();
		
		System.out.println(t.lowerKey(300)); // 200
		System.out.println(t.lowerKey(700)); // 600
		System.out.println(t.lowerKey(50)); // null
		
		System.out.println(t.descendingKeySet());
		System.out.println(t.descendingMap());
		
		System.out.println(t.entrySet());
		
		System.out.println(t.firstEntry()); // 100=sudha
		System.out.println(t.lastEntry()); // 600=paaki
		
		System.out.println(t.firstKey()); // 100
		System.out.println(t.lastKey()); // 600
	
		*/
		
		/*
		System.out.println(t.floorKey(300)); // 300
		System.out.println(t.floorKey(700)); // 600
		System.out.println(t.floorKey(50)); // null
		
		System.out.println(t.ceilingKey(300)); // 300
		System.out.println(t.ceilingKey(700)); //  null
		System.out.println(t.ceilingKey(50)); // 100
		*/
		
		/*
		System.out.println(t.floorEntry(300)); // 300=rani
		System.out.println(t.floorEntry(700)); // 600 = paaki
		System.out.println(t.floorEntry(50)); // null
		
		System.out.println(t.ceilingEntry(300)); // 300=rani
		System.out.println(t.ceilingEntry(700)); // // null
		System.out.println(t.ceilingEntry(50)); // 100 = sudha
		//System.out.println(t);
		
		//t.put("unknown", "sweetest"); // keys cann't be heterogeneous
		*/
		
		/*
		t.put(null, "mom to be"); // null pointer exception
		t.put(600,19.982); // values can be heterogeneous
		t.put(400, new StringBuffer("grandPa")); // values can be heterogeneous
		
		t.put(500,null);
		t.put(600,null);
		t.put(400,null);
		*/
		
		
		
	}
}