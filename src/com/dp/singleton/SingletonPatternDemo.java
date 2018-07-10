package com.dp.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		SingleObject instance = SingleObject.getInstance();
		instance.doSomething();
	}
}
