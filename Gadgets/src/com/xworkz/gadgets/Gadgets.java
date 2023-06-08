package com.xworkz.gadgets;


import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Gadgets {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(20,"Camera");
		map.put(21, "Mobile");
		map.put(24, "Microphone");
		map.put(23, "Tablet");
		
		
		
		System.out.println(map.entrySet());
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.get(20));
		
		System.out.println("--------------------------------------------------------");
	
		TreeMap<Integer, String> ref = new TreeMap<Integer, String>();
		
		ref.put(201, "Printer");
		ref.put(202, "Smart watch");
		ref.put(203, "Scanner");
		ref.put(204, "Smart phone");
		ref.put(205, "Mouse");
		
		System.out.println(ref.firstEntry());
		System.out.println(ref.containsKey(205));
		System.out.println(ref.equals(ref));
		System.out.println(ref.values());
	
		
		
		
	
			 
			
		}
		
		
		
	

	}


