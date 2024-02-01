package project;

public class Company {

	int n;
	boolean f = false;

	synchronized public void produced_item(int n) throws Exception {
		if (f) {
			wait();
		}
		this.n = n;
		System.out.println("produced_item " + this.n);
		f = true;
		notify();
	}

	synchronized public int consume_item() throws Exception {
		if (!f) {
			wait();
		}
		System.out.println("consume_item " + n);
		f = false;
		notify();
		return this.n;
	}
}
