package thread_concept;

public class Mythread2 extends Thread {

	public void run() {
		for (int i = 2; i < 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i * 2 + " ");
		}
	}

	public static void main(String[] args) {
		Mythread2 t2 = new Mythread2();
		t2.start();
	}

}
