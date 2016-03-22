package oracle;

public class StringToIntegerConversion {
	public static void main(String[] args) {
		String n = "223";
		System.out.println(Integer.parseInt(n));
		int number = 0;
		for (int i = 0; i < n.length(); i++) {
			number *= 10;
			number += Character.getNumericValue(n.charAt(i));
//			number += n.charAt(i) - '0';
		}
		System.out.println(number);
	}
}
