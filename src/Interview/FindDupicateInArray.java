package Interview;

import java.util.HashSet;

public class FindDupicateInArray {

	public static void main(String[] args) {
		String arr[] = {"kiran", "srikanth","madhav", "saber","kiran"};
		boolean flag=false;
		/*for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found duplicate " +arr[i]);
					flag=true;
				}
			}
		}*/
		
		HashSet <String> lang = new HashSet();
		for(String l:arr)
		{
			if(lang.add(l)==false)
			{
				System.out.println("Fuond Dupicate Element: " + l);
				flag=true;
			}
		}
		
		
		
		
		
		if(flag==false)
		{
			System.out.println("No duplicate Element");
		}
		
		
		

	}

}
