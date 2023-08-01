package com.rays.thread;

public class ByRunnable implements Runnable {
	String name = null;
	public ByRunnable (String name) {
		this.name = name ;
	}

	@Override
	public void run() {
		for ( int i=1; i<=5; i++);
	    int i= 0;
		System.out.println(i +" " + name);
		
		
	}

}
