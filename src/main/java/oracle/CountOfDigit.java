package oracle;

public class CountOfDigit {
	/**
	 * How many 1's in a number is 11 power of N(0 - 1000)
	 */
	public static void main(String[] args) {
		int n = 3;
		int number = power(11,n);
		System.out.println("number : "+number);
		int count = 0;
		while (number != 0) {
			int rem = number % 10;
			number = number / 10;
			if(rem == 1){
				count++;
			}
		}
		System.out.println("count : "+count);
	}

	private static int power(int i, int n) {
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return i;
		}
		return i * power(i,n-1);
	}
}
