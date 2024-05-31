package Interview;

public class ResverseString {

	public static void main(String[] args) {
		
		String str = "KIRAN";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		//StringBuffer sb = new StringBuffer(str);
		//StringBuffer rev = sb.reverse();
		
		
		
		
		System.out.println(rev);



	}

}
