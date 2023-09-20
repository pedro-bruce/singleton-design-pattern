package com.java.singletonexample;

public class DoorSingleton {
	private static DoorSingleton door;
	
	private DoorSingleton() {
	}
	
	public static synchronized DoorSingleton getInstance() {
		if(door == null) {
			door = new DoorSingleton();
		}
		
		return door;
	}
	
	public void open() {
		System.out.println("Opening the door...");
	}
	
	public void close() {
		System.out.println("Closing the door...");
	}
	
	public void lock() {
		System.out.println("Locking the door...");
	}
	
	public void unlock() {
		System.out.println("Unlocking the door...");
	}
}
