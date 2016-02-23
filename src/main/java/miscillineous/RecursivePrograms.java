package miscillineous;

import java.util.Arrays;

public class RecursivePrograms {
	public static void main(String[] args) {
		int val = power(2,3);
		System.out.println("Recursion x^y : "+val);
		val = power(2,3,2);
		System.out.println("Recursion x^y^z : "+val);
		System.out.println("\nfactorial of a number 5 :"+factorial(5));
		System.out.println("\nfibonacci series upto number 100 :");
		fibonacciSeries(0,1);
		System.out.println("\ncheck a number 15351 is palindrome or not :"+palindrome(15351));
		System.out.println("\ncheck a number 153512 is palindrome or not :"+palindrome(153512));
		System.out.println("\nReverse a string :"+stringReverse("lakshman"));
		System.out.println("\nReverse a string :"+stringReverse("Hello Lakshman! Hiiiii"));
		System.out.println("\nReverse Each Word Of A String  :"+reverseEachWordInAString("Hello Lakshman! Hiiiii"));
		System.out.println("\nReverse Each Word Of A String by Preserving the Spaces :"+reverseAStringByPreservingSpaces("Hello Lakshman! Hiiiii"));
		System.out.println("\nFind Second Largest Number In An Integer Array :"+findSecondLargestNumberInAnIntegerArray(new int[] {45, 51, 28, 75, 49, 42}));
		System.out.println("\nFind All The Leaders In An Integer Array :");
		findAllTheLeadersInAnIntegerArray(new int[] {45, 51, 28, 75, 49, 42});
		System.out.println("\nFind The Continuous Sub Array In An Array Whose Sum Is Equal To Given Number 11 is :");
		findTheContinuousSubArrayInAnArrayWhoseSumIsEqualToGivenNumber(new int[] {4,5,6,8,2,1,5,6},11);
		System.out.println("\nFind Missing Number In a Contineous Array is: "+findMissingOrRepeatedNumber(new int[] {1,2,3,4,5,7,8},true));
		System.out.println("\nFind Missing Number In a Contineous Array is: "+findMissingOrRepeatedNumber(new int[] {1,2,3,4,5,6,7,7,8},false));
		System.out.println("\nFind Largest Number Less Than Given Number And Without A Given DIgit: "+findLargestNumberLessThanGivenNumberAndWithoutAGivenDIgit(199,9));
	}
	
	private static int findLargestNumberLessThanGivenNumberAndWithoutAGivenDIgit(int number, int digit) {
		char dig = String.valueOf(digit).charAt(0);
		for(int i = number - 1; i > 0; i--){
			if(String.valueOf(i).indexOf(dig) == -1){
				return i;
			}
		}
		return -1;
	}

	private static int findMissingOrRepeatedNumber(int[] inputArr,boolean flag) {
		int sum = findSumOfNNumbers(inputArr[inputArr.length - 1]);
		int tot = 0;
		for (int i = 0; i < inputArr.length; i++) {
			tot = tot + inputArr[i];
		}
		int numberToFind = 0;
		if(flag){
			numberToFind = sum - tot;
		}else{
			numberToFind = tot - sum;
		}
		return numberToFind;
	}

	private static int findSumOfNNumbers(int n) {
		return (n * (n + 1)) / 2;
	}

	private static void findTheContinuousSubArrayInAnArrayWhoseSumIsEqualToGivenNumber(int[] inputArr, int total) {
		int sum = 0;
		for (int j = 0; j < inputArr.length; j++) {
			sum = inputArr[j];
			for (int i = j + 1; i < inputArr.length; i++) {
				sum = sum + inputArr[i];
				if(sum == total){
					for (int k = j; k <= i; k++) {
                        System.out.print(inputArr[k]+" ");
                    }
                    System.out.println();
				}else if(sum < total){
					continue;
				}else if(sum < total){
					break;
				}
			}
		}
	}

	private static void findAllTheLeadersInAnIntegerArray(int[] inputArray) {
		int inputArrayLength = inputArray.length;
        int max = inputArray[inputArrayLength-1];
        System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
        System.out.println(inputArray[inputArrayLength-1]);
        for (int i = inputArray.length-2; i >= 0; i--) {
            if(inputArray[i] > max) {
                System.out.println(inputArray[i]);
                max = inputArray[i];
            }
        }
	}

	private static int findSecondLargestNumberInAnIntegerArray(int[] input) {
		int firstLargest, secondLargest;
        if(input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        }else{
            firstLargest = input[1];
            secondLargest = input[0];
        }
        for (int i = 2; i < input.length; i++) {
            if(input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        return secondLargest;
	}

	private static String reverseAStringByPreservingSpaces(String data) {
		char[] inputArr = data.toCharArray();
		char[] outputArr = new char[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] == ' '){
				outputArr[i] = ' ';
			}
		}
		int j = outputArr.length - 1;
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] != ' '){
				if(outputArr[j] == ' '){
					j--;
				}
				outputArr[j] = inputArr[i];
				j--;
			}
		}
		return String.valueOf(outputArr);
	}

	private static String reverseEachWordInAString(String data) {
		String reverseStr = "";
		String[] words = data.split(" ");
		for (String word : words) {
			reverseStr = reverseStr + stringReverse(word)+" ";
		}
		return reverseStr;
	}

	private static String stringReverse(String str) {
	     if ((null == str) || (str.length() <= 1)) {
	            return str;
	     }
	     return stringReverse(str.substring(1)) + str.charAt(0);
	}
	
	private static Boolean palindrome(int num) {
		int temp = num;
		int sum = 0;
		while(num != 0){
			sum = (sum * 10) + num % 10;
			num = num/10;
		}
		if(temp == sum){
			return true;
		}
		return false;
	}

	private static void fibonacciSeries(int i, int j) {
		if(i == 0){
			System.out.println(i+"\n"+j);
		}
		int sum = i + j;
		if(sum < 100){
			System.out.println(sum);
			i = j;
			j = sum;
			fibonacciSeries(i, j);
		}
	}

	private static int factorial(int x) {
		if(x == 0 || x == 1){
			return 1;
		}
		return x * factorial(x-1);
	}

	private static int power(int x, int y, int z) {
		return power(power(x, y), z);
	}

	private static int power(int x, int y) {
		if(y == 0){
			return 1;
		}
		if(y == 1){
			return x;
		}
		return x * power(x, y-1);
	}
}
