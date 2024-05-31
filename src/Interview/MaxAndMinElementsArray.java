package Interview;

public class MaxAndMinElementsArray {

	public static void main(String[] args) {

		int a[] = { 20, 50, 30, 60,};

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			
		}
		System.out.println(max);
		
		int min=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			
		}
		System.out.println(min);

	}

}
