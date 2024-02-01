package youtube_interview_2;


//find out max no of cude is > 65 array element
public class ArrayElement {

	public static void main(String[] args) {
		int []numbers= {2,3,4,5,1};
		for (int i : numbers) {
			if (calculateSumOfCube(i)>65) {
				System.out.println("elements cube greater than 65 :"+i);
			}
		}
	}
	private static int calculateSumOfCube(int i) {
		return i*i*i;
	}
}
