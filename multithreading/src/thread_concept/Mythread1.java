package thread_concept;


// using Runnable interface create a object
public class Mythread1 implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(2000);

			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i * 2 + " ");
		}
	}

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1();
		Thread t2 = new Thread(t1);
		t2.start();
	}

}
