package project;

public class Consumer extends Thread {

	public Company company;

	public Consumer(Company company) {
		super();
		this.company = company;
	}

	public void run() {
		for (int i = 0; i <10; i++) {
			try {
				this.company.consume_item();
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
