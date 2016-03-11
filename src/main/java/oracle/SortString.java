package oracle;


public class SortString {
	public static void main(String[] args) {
		/** sort the given string lower case spaces and upper case, original order remains same
		 ex: string "dsAa bBnmT SwK" after sorting "dsabnmw  ABTSK" */
		String str = "AAdsAa bBnmT SwK";
		System.out.println(str);
		String lowerCase = "";
		String spaces = "";
		String upperCases = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				lowerCase += str.charAt(i);
			}
			if(str.charAt(i) == ' '){
				spaces += str.charAt(i);
			}
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				upperCases += str.charAt(i);
			}
		}
		String s = lowerCase+spaces+upperCases;
		System.out.println(s);
		
		String orderedStr = getOrderedString(str);
		System.out.println(orderedStr);
	}

	private static String getOrderedString(String str) {
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int a = j;
				if(array[i] >= 'A' && array[i] <= 'Z'){
					if(array[j] >= 'a' && array[j] <= 'z'){
						while (a > i) {
							char c = array[a];
							array[a] = array[a - 1];
							array[a - 1] = c;
							a--;
						}
					}
					if(array[j] == ' '){
						while (a > i) {
							char c = array[a];
							array[a] = array[a - 1];
							array[a - 1] = c;
							a--;
						}
					}
				}
				a = j;
				if(array[i] == ' '){
					if(array[j] >= 'a' && array[j] <= 'z'){
						while (a > i) {
							char c = array[a];
							array[a] = array[a - 1];
							array[a - 1] = c;
							a--;
						}
					}
				}
			}
		}
		return String.valueOf(array).toString();
	}
}
