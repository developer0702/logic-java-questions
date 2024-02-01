package project;

public class Producer extends Thread {

	public Company company;

	public Producer(Company company) {
		super();
		this.company = company;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				this.company.produced_item(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
