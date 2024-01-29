package Test;

import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {

//		Take two int values from user and print greatest among them.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no. : ");
		int a = sc.nextInt();
		System.out.println("Enter Second no. : ");
		int b = sc.nextInt();

		if (a > b) {

			System.out.println("This is greater : " + a);

		}

		else

			System.out.println("This is greater : " + b);

	}

}
