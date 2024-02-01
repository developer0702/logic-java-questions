package Thread_priority;


//use synchronized bloack

public class TheadPriority extends Thread {
	
	String name;

	public TheadPriority(String name) {
		
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i <10; i++) {
			try {
				synchronized (this.name) {
					System.out.print(getPriority()+" ");
					
				}
				Thread.sleep(3000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		TheadPriority priority = new TheadPriority("sanjay");
		TheadPriority priority2 = new TheadPriority("bablu");
		priority.setPriority(1);
		priority2.setPriority(2);
		
		
		priority.start();
		priority2.start();
	}
	
}
