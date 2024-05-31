package Interview;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class SearchingAnElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search: ");
		int num = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.println("Element found");
				flag = true;
				break;

			}
		}
		if (flag == false) {

			System.out.println("Element not found");
		}

	}

}
