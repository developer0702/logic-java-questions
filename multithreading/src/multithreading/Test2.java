package multithreading;

public class Test2 extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >1; i--) {
			System.out.println("reverse "+i );
			try {
				
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
