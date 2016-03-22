package oracle;

import java.math.BigInteger;

public class LargetstAndSmallNumbers {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		int minInt = -2147483648;
		System.out.println(minInt);
//		minInt = -2147483649; // error The literal -2147483649 of type int is out of range
		
		System.out.println(Integer.MAX_VALUE);
		int maxInt = 2147483647;
		System.out.println(maxInt);
//		maxInt = 2147483648; // error The literal 2147483648 of type int is out of range
		
		System.out.println(Long.MIN_VALUE);
		long minLong = -9223372036854775808L;
		System.out.println(minLong);
//		minLong = -9223372036854775809L; // error
		
		System.out.println(Long.MAX_VALUE);
		long maxLong = 9223372036854775807L;
		System.out.println(maxLong);
//		maxLong = 9223372036854775809L; // error
		
		System.out.println(Double.MIN_VALUE);
		double minDouble = 4.9E-324D;
		System.out.println(minDouble);
//		minDouble = 4.9E-325D; // error
		
		System.out.println(Double.MAX_VALUE);
		double maxDouble = 1.7976931348623157E308D;
		System.out.println(maxDouble);
//		maxDouble = 1.7976931348623157E309D; // error
		
		System.out.println(Float.MIN_VALUE);
		float minFloat = 1.4E-45F;
		System.out.println(minFloat);
//		minFloat = -1.4E-46F; // error
		
		System.out.println(Float.MAX_VALUE);
		float maxFloat = 3.4028235E38F;
		System.out.println(maxFloat);
//		maxFloat = 3.4028235E39F; // error
		
		BigInteger bi1 = new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); 
		BigInteger bi2 = new BigInteger("30397688987935472645237453792499342222222222222222222222222222222222222222222222222223039768898793547264523745379249934222222222222222222222222222222222"); 

		BigInteger bigSum = bi1.add(bi2);

		BigInteger bigProduct = bi1.multiply(bi2);

		System.out.println("Sum : " + bigSum);
		System.out.println("Product : " + bigProduct);
		
		double d = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999D;
		System.out.println(d);
	}
}
