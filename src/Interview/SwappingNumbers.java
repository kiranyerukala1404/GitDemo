package Interview;

public class SwappingNumbers {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		
		System.out.println("before swapping"+a+ " " +b);
		b= a+b-(a=b);
		System.out.println("after swapping"+a+ " " +b);
		
	}

}
