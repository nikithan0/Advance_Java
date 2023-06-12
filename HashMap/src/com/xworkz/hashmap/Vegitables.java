package com.xworkz.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Vegitables {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Onion");
		map.put(2, "Tomato");
		map.put(3, "Cucumber");
		map.put(4, "Mushroom");
		map.put(5, "Carrot");
		map.put(6, "Potato");
		map.put(7, "Pumpkin");

		Set<Integer> set = map.keySet();
		for (Integer integer : set) {
			System.out.println(map.get(integer));

		}

	}

}
