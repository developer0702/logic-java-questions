package threadLifeCycle;

public class ThreadOperation {

	public static void main(String[] args) {

		System.out.println("programe started... ");

		int x = 8 + 9;
		
		System.out.println("sum of this: " + x);
		Thread thread = Thread.currentThread();
		String tname = thread.getName();
		thread.setName("my thread");
		String name = thread.getName();
		System.out.println(thread.getName());
		
//		System.out.println("current thread "+tname);
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(thread.getId());
		System.out.println();
		System.out.println("programe ended...");

	}

}
