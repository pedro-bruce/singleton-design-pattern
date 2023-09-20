package com.java.singletonexample;

public class SingletonExample {
	
	public static void main(String args[]) {
		DoorSingleton door = DoorSingleton.getInstance();
		
		door.open();
		door.close();
		door.lock();
		door.unlock();
		
		DoorSingleton test = DoorSingleton.getInstance();
		
		if(door == test) {
			System.out.println("They point to the same object.");
		}
	}
}
