package lambda_ex_functional_interface;

public class Main {

	public static void main(String[] args) {

		MyInterfaceImpl impl = new MyInterfaceImpl();
		impl.sayHello();

		MyInterface myinterface = new MyInterface() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub

				System.out.println("this is my annonamus class");

			}
		};
		myinterface.sayHello();

		// using our interface with the help of lambda
		MyInterface interface1 = () -> System.out.println("this is first time i am using lambda");

		interface1.sayHello();

		SumInterface sumInterface = (int a, int b) -> a + b;

		System.out.println(sumInterface.sum(12, 14));
		System.out.println(sumInterface.sum(5, 7));

		LengthInterface lengthInterface = str -> str.length();
		System.out.println("length of the string : " + lengthInterface.getLength("bangalore city"));

	}
}
