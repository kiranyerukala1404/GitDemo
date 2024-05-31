package Interview;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr number:");
		int num = sc.nextInt();
		/*int rev=0;
		while(num!=0) 
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("The Reversed number is " +rev);*/
		
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("The Reversed number is " +rev);
		
		
	}

}
