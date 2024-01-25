package Test;

public class MaxNo {

	public static void main(String[] args) {

		int[] ab = { 1, 23, 51, 55, 67, 4 };

		int max = ab[0];

		for (int i = 1; i < ab.length; i++) {

			if (ab[i]>max ) {

				max = ab[i];
			}			
		}
		System.out.println("Max No is :" + max);
	}

}
