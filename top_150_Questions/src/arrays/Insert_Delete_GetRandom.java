package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomedSet{
	
	List<Integer> list;
	Map<Integer,Integer> map;
	Random rand;
	
	public void RandomizedSet() {
		list  = new ArrayList<>();
		map = new HashMap<>();
	}
	
	public boolean insert(int val) {
		if(map.containsKey(val)) {
			return false;
		}
		list.add(val);
		map.put(val, list.size()-1);
		return true;
	}
	public boolean delet(int val) {
		if(!map.containsKey(val)) {
			return false;
		}
		int index = map.get(val);
		int lastvalue = list.get(list.size()-1);
		list.set(index, lastvalue);
		return true;
	}
	public int getRandome() {
		return list.get(rand.nextInt(list.size()));
	}
}

public class Insert_Delete_GetRandom {
	public static void main(String[] args) {
		RandomedSet r = new RandomedSet();
		
	}
}
