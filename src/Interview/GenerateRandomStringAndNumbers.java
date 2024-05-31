package Interview;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomStringAndNumbers {

	public static void main(String[] args) {
		
		String str = RandomStringUtils.randomNumeric(5);
		System.out.println(str);
		String nil= RandomStringUtils.randomAlphabetic(5);
		System.out.println(nil);
	}

}
