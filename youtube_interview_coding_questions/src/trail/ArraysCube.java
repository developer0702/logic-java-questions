package trail;

public class ArraysCube {

	public static void main(String[] args) {
		int n []= {2,3,4,1,5};
		for (int i : n) {
			
			if (findMaxNoOfCube(i)>65) {
				System.out.println("max no of cube is "+i);
			}
		}
	}
	private static int findMaxNoOfCube(int i) {
		return i*i*i;
	}
}
