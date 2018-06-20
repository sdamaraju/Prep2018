package collections.myOwnArrayList.hashmapimpl;

import java.util.HashMap;

public class HashMapImpl {

	public static void main(String[] args) {
		Words word1 = new Words("ABCD");
		Words word2 = new Words("abcd");
		Words word3 = new Words("C");
		Words word4 = new Words("D");
		Words word5 = new Words("A");
		System.out.println(word1.hashCode());
		System.out.println(word2.hashCode());
		System.out.println(word3.hashCode());
		System.out.println(word4.hashCode());
		System.out.println(word5.hashCode());
		
		HashMap map = new HashMap();
		if((map.get(word1)) != null){
			map.put(word1, (int)map.get(word1) + 1);
		}else{
			map.put(word1, 1);
		}
		if((map.get(word2)) != null){
			map.put(word2, (int)map.get(word2) + 1);
		}else{
			map.put(word2, 1);
		}
		if((map.get(word3)) != null){
			map.put(word3, (int)map.get(word3) + 1);
		}else{
			map.put(word3, 1);
		}
		if((map.get(word4)) != null){
			map.put(word4, (int)map.get(word4) + 1);
		}else{
			map.put(word4, 1);
		}
		if((map.get(word5)) != null){
			map.put(word5, (int)map.get(word5) + 1);
		}else{
			map.put(word5, 1);
		}
		System.out.println(map);
		
		System.out.println(word1==word2);
		HashMap map1 = new HashMap();
		
		System.out.println("A".hashCode());
		System.out.println("B".hashCode());
		System.out.println("C".hashCode());
		System.out.println("D".hashCode());
		System.out.println("E".hashCode());
		
		if((map1.get("A")) != null){
			map1.put("A", (int)map1.get("A") + 1);
		}else{
			map1.put("A", 1);
		}
		if((map1.get("B")) != null){
			map1.put("B", (int)map1.get("B") + 1);
		}else{
			map1.put("B", 1);
		}
		if((map1.get("C")) != null){
			map1.put("C", (int)map1.get("C") + 1);
		}else{
			map1.put("C", 1);
		}
		if((map1.get("A")) != null){
			map1.put("A", (int)map1.get("A") + 1);
		}else{
			map1.put("A", 1);
		}
		if((map1.get("D")) != null){
			map1.put("D", (int)map1.get("D") + 1);
		}else{
			map1.put("D", 1);
		}
		System.out.println(map1);
		
	}
}
