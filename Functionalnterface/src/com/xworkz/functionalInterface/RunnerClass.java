package com.xworkz.functionalInterface;

public class RunnerClass {

	public static void main(String[] args) {
		Bank bank = () ->{
			System.out.println("One can save money");
		};
		
		Dictionary dictionary = () ->{
			System.out.println("Used to find the meaning of word");
		};
		
		Watch watch = () ->{
			System.out.println("Shows time");
		};
		
		bank.savings();
		dictionary.helpsToFindTheMeaning();
		watch.showsTime();
	}
}
