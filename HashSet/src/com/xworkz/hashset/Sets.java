package com.xworkz.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets {
	public static void main(String[] args) {

   HashSet<String> set = new HashSet<String>();
    
   set.add("Manglore");
   set.add("Banglore");
   set.add("Shivamoga");
   set.add("Davangere");
   set.add("Hassan");
   set.add("Hassan");
   set.addAll(set);
   
  
   for(String str:set) {
	   System.out.println(str);
   }
   
   System.out.println("----------------------------------------------------");
      
   LinkedHashSet<Integer> value = new LinkedHashSet<Integer>();
   value.add(67);
   value.add(100);
   value.add(200);
   value.add(200);
   
   for(Integer num: value) {
	   System.out.println(num);
   }
   
   HashMap<Integer, Boolean> ref = new HashMap<Integer, Boolean>();
    ref.put(101, true);
    ref.put(102, false);
    ref.put(103, false);
    
    System.out.println("----------------------------------------------------");
    
    System.out.println( ref.get(103));
   

	}
}