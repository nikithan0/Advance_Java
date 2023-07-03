package com.xworkz.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class RunnerClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Bengaluru Urban");
		list.add("Udupi");
		list.add("Shivamogga");
		list.add("Vijayapura");
		list.add("Belagavi");
		list.add("Kodagu");
		list.add("Dakshina Kannada");
		list.add("Kalaburagi");
		list.add("Ballari");
		list.add("Haveri");
		list.add("Chikkamagaluru");
		list.add("Chitradurga");
		list.add("Hassan");
		list.add("Davanagere");
		list.add("Dharwad");
		list.add("Bidar");
		list.add("Uttara Kannada");
		list.add("Mandya");
		list.add("Chikkaballapura");
		list.add("Raichur");
		
		List<String> stream = list.stream().filter((city)-> city.contains("i")).collect(Collectors.toList());
		stream.forEach((c)-> {System.out.println(c);});
		
		System.out.println("------------------------------------");
		
		List<String> stream1 = list.stream().filter((city)-> city.contains(" ")).collect(Collectors.toList());
		stream1.forEach((c)->{System.out.println(c);});
		
		System.out.println("------------------------------------");
		
		List<String> stream2 = list.stream().filter((city)->!city.equals(" ")).collect(Collectors.toList());
		stream2.forEach((c)->{System.out.println(c);});
		
		System.out.println("------------------------------------");
		
		List<String> stream3 = list.stream().filter((city)->city.contains("B") || city.contains("C") || city.contains("D") || city.contains("K") ||
				city.contains("H") || city.contains("M") || city.contains("R") || city.contains("S") || city.contains("U") || city.contains("V")).collect(Collectors.toList());
		stream3.forEach((c)->{System.out.println(c);});
		
		System.out.println("------------------------------------");

		List<String> stream4 = list.stream().map((city)->city.toLowerCase()).collect(Collectors.toList());
		stream4.forEach((c)-> {System.out.println(c);});
		
		System.out.println("------------------------------------");

		List<String> stream5 = list.stream().sorted().collect(Collectors.toList());
		stream5.forEach((c)-> {System.out.println(c);});
		
		System.out.println("------------------------------------");

		List<String> stream6 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		stream6.forEach((c)->{System.out.println(c);});
		
	
		
		
		
	
	}

}
