package Interview;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		int even_count=0;
		int odd_count =0;
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("no.of Even numbers are:" + even_count);
		System.out.println("no.of odd numbers are:" + odd_count);

	}

}
