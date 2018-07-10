package com.dp.singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Hello 500 ae");
	}
}
