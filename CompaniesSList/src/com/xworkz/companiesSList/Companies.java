package com.xworkz.companiesSList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Companies {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Microsoft");
		list.add("Amazon");
		list.add("Meta");
		list.add("Oracle");
		list.add("Adobe");
		list.add("Accenture");
		list.add("Cisco");
		list.add("Intuite");
		list.add("Brodcom");
		list.add("Sap");
		list.add("Dell");
		list.add("Infosys");
		list.add("Ibm");
		list.add("Autodesk");
		list.add("Xero");
		list.add("Wipro");
		list.add("Mphasis");
		list.add("Google");
		list.add("Asus");
		
//		for(String str : list) {
//			System.out.println(str);
//		}
//		
	  Comparator<String> cmp = new Comparator<String>() {
		 
		
		@Override
		public int compare(String o1, String o2) {		
			if(o1.length()>o2.length()) {
				return 1;
			}
			return -1;
		}
		
	};

	   // list.sort(cmp);
	  
		Collections.sort(list,cmp);
		for (String ref: list) {
			System.out.println(ref);
		}
	}

}
