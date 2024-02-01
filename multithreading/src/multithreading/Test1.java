package multithreading;

public class Test1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			System.out.println("runnable interface algorithm " +i);
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
	}

	public static void main(String[] args) {

		
		Test1 th = new Test1();
		Test2 th2 = new Test2();
		Thread thread = new Thread(th);
		thread.start();
		th2.start();
	}
}
