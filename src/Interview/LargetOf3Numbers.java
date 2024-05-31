package Interview;

import java.util.Scanner;

public class LargetOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd number:");
		int c = sc.nextInt();
		//Ternary operator
		int l = a>b?a:b;
		int l1 = c>l?c:l;
		System.out.println(l1+ "is largest number");
		
	}

}
