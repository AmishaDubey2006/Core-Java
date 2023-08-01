package com.rays.thread;

public class WithoutThread {
	public String name = null;
	public WithoutThread(String name) {
		this.name=name;
	}
	public void run() {
		//while (true){
		for ( int i=1; i<=5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i+" " + name);
		}
	}

}
