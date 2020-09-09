package com.hervey.app;

public class LotsOfErrors {

	private static void method2() {
		method1();
		System.out.println("I am method 2.");

	}

	private static void method3() {
		method2();
		System.out.println("I am method 3");
		method1();

	}

	private static void method1() {
		System.out.println("I am method 1");
	}

	public static void main(String[] args) {
		method1();
		method3();
		method2();
		method3();

	}

}
