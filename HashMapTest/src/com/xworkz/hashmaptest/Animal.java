package com.xworkz.hashmaptest;

import java.util.HashMap;

public class Animal {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(1,"Dog");
		obj.put(2,"Cat");
		obj.put(3,"Cow");
		obj.put(4,"Lion");
		obj.put(5,"Tiger");
		obj.put(6,"Panda");
		
		for (int i=0; i<.6; i++) {
			System.out.println(obj);		
		}
		System.out.println(obj.get(1));
		
		
		
		

	}

}
