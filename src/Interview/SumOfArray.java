package Interview;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[]= {5,6,3,8,9};
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}