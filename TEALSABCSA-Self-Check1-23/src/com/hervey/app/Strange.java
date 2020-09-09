package com.hervey.app;

public class Strange {
	
		private static void first() {
		System.out.println("Inside first method");
		
	}
	
		private static void second() {
		System.out.println("Inside second method");
		first();
		
	}
		
		
	private static void third() {
		System.out.println("Inside third method");
		first();
		second();
		
	}
	
	
	public static void main(String[] args) {
		first();
		third();
		second();
		third();

	}











}
