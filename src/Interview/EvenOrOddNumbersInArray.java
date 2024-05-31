package Interview;

public class EvenOrOddNumbersInArray {

	public static void main(String[] args) {

		int a[] = { 5, 8, 9, 6, 7, 4, 2, 1 };

		System.out.println("Even numbers");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("odd numbers");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
