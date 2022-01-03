package com.revature.collections;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String> ();
		map.put(1,  "Carl");
		System.out.println(map);
		map.put(-5,  "Carl");
		System.out.println(map);
		map.put(1,  "Pedro");
		System.out.println(map);
		map.put(8,  "Howard");
		System.out.println(map);
		map.put(3,  "Steven");
		System.out.println(map);
		
		System.out.println();
		for(Integer i : map.keySet()) {
			System.out.println(i + "="+map.get(i));
		}
		System.out.println();
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e);
		}
		System.out.println();
		for(String n : map.values()) {
			System.out.println(n);
		}
		System.out.println();
		System.out.println(map.getClass().getName());
		System.out.println(map.values().getClass().getName());
		System.out.println(map.values() instanceof Collection);
		System.out.println(map.values() instanceof List);
		System.out.println(map.values() instanceof Set);
		System.out.println(map.values() instanceof Deque);
		System.out.println(map.values() instanceof Queue);
		
		Map<Integer,String> treeMap = new TreeMap<Integer, String>();
		treeMap.putAll(map);
		System.out.println(treeMap);
	}

}
