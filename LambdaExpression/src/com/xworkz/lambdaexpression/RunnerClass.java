package com.xworkz.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		
		Watch watch = (name, pri) ->{
			System.out.println(name);
			System.out.println(pri);
			return 10+pri;
		};	
		watch.wristWatch("Dzire", 2000);
	
		
//		Watch watch = (name) ->{
//			System.out.println(name);
//			return 20;
//		};
//		watch.wristWactch("Sonata");
		
		System.out.println("---------------------------------------");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(32);
		list.add(76);
		list.add(55);
		list.add(90);
		list.add(12);
		list.add(8);
		
		list.forEach((li) ->{System.out.println(li);});
		
		System.out.println("---------------------------------------");
		
		MyComparator comp = (o1,o2) ->{
			if(o1>o2) {
				return 1;
			}else {
				return -1;
			}
		};
		
		Collections.sort(list, comp);
		
		list.forEach((i) -> {System.out.println(i);});
		
		
		
	}	

}
