package Test;

import java.util.Scanner;

public class ShopCalcu {

	public static void main(String[] args) {

//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
//https://www.codesdope.com/practice/java-decide-if-or-else/
		
		int cost,sum=0, discount = 0;
		System.out.println("Enter the item costs : ");
		Scanner sc = new Scanner(System.in);
		int item1 =  sc.nextInt();
		int item2 =  sc.nextInt();
		int item3 =  sc.nextInt();
		int item4 =  sc.nextInt();
		
		sum = item1 + item2 + item3 + item4;
		
		if(sum>=1000) {
			
			discount = (sum*10)/100;
			cost = sum-discount;
			System.out.println("Total Price is :  " +sum + " \ndiscount is : " +discount + " \nAnd Price to pay :" +cost  );
					
		}
		else
			
			System.out.println("Total Price is " +sum);
			
	}

}
