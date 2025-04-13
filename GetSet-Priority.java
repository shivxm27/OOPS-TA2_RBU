import java.io.*;


public class Main extends Thread
{
	public static void main(String[] args) {
	    Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        
        
		System.out.println("Priority of Thread 1 is : "+t1.getPriority());
		System.out.println("Priority of Thread 2 is : "+t2.getPriority());
		System.out.println("Priority of Thread 3 is : "+t3.getPriority());
		
		
		t1.setPriority(2);
		t2.setPriority(6);
		t3.setPriority(10);
		
		System.out.println("Changing Priorities of Threads...");
		
		System.out.println("New Priority of Thread 1 is : "+t1.getPriority());
		System.out.println("New Priority of Thread 2 is : "+t2.getPriority());
		System.out.println("New Priority of Thread 3 is : "+t3.getPriority());
		
		
	}
}
