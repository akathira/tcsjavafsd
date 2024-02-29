package com.tcs.threads;

public class TestThreads {
	public static void main(String[] args) {
		System.out.println("Started the main()");
		MyThread t1 = new MyThread("T1");
		//t1.setDaemon(true); -> Kills all the thread
		t1.start();
		MyThread t2 = new MyThread("T2");
		//t2.setDaemon(true);
		t2.start();
		try {
			//Thread.currentThread().join(); // All threads runs after main method, then ends before main method completes
		     t2.join(); //main will not complete till t2 is complete
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting the main()");
	}
 
}
