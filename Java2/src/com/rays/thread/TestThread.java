package com.rays.thread;

public class TestThread {
	public static void main(String[] args) {
	//	WithoutThread t1 = new WithoutThread("Amisha");
	//	WithoutThread t2 = new WithoutThread("Priyanshi");
	//	t1.run();
	//	t2.run();
		
	
	//    (WITHOUTTHREAD TEST CLASS AFTER ADDING TRY CATCH METHOD)
		WithThread t1 = new WithThread("Amisha");
		t1.setDaemon(true);
		t1.start ();
		for (int i1=1; i1<=5; i1++);
		String i = null;
		System.out.println(i+"name");
		
	
		
	              
	             	//(WithThread Test Class)
		
	//	WithThread t1 = new WithThread("Amisha");
	//	WithThread t2= new WithThread("Priyanshi");
		
	//	t1.start();
	//	t2.start();
		
		     
		           //(RUNNABLE TEST CLASS )
		
	//	ByRunnable r1 = new ByRunnable ("Amisha");
	//	ByRunnable r2 = new ByRunnable ("Priyanshi");
	//	Thread t1 = new Thread (r1);
	//	Thread t2 = new Thread (r2);
		
		//t1.start();
		//t2.start ();
	//	System.out.println(t1.getPriority());
	//	System.out.println(t2.getPriority());
		
		
	
		
		
	}

}
