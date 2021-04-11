package jav.fileio;

public class ThreadPriority extends Thread {

	public void run() {
		
		System.out.println("Running thread name is: " + Thread.currentThread().getName());
		System.out.println("Running thread priority is: " + Thread.currentThread().getPriority());
		System.out.println("Running thread state is: " + Thread.currentThread().getState());
		System.out.println("The thread group is: " + Thread.currentThread().getThreadGroup()); 
		System.out.println("The thread alive or not?:" + Thread.currentThread().isAlive());
		
	}
	public static void main(String[] args) {
	
		ThreadPriority m1=new ThreadPriority();
		ThreadPriority m2=new ThreadPriority();
		
		m1.setName("Player-1");
	    m2.setName("Player-2");
	    
	    m1.setDaemon(true);
	    
	    m1.setPriority(Thread.NORM_PRIORITY);
	    m2.setPriority(Thread.MIN_PRIORITY);
	    
	    m1.start();
	    m2.start();

	}

}
