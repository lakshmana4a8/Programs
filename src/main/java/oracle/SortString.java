package oracle;

public class SortString {
	public static void main(String[] args) {
		/** sort the given string lower case spaces and upper case, original order remains same
		 ex: string "dsAa bBnmT SwK" after sorting "dsabnmw  ABTSK" */
		String str = "dsAa bBnmT SwK";
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
	}
}
