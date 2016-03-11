package oracle;


public class SubStrings {
	public static void main(String[] args) {
		//find longest valid substring from the given list of strings..
		String[] strings = {"interviewer","baybest","keyboard"};
		
		for (String string : strings) {
			String subString = "";
			for (int i = 0; i < string.length(); i++) {
				StringBuilder s = new StringBuilder();
				s.append(string.charAt(i));
				for (int j = i+1; j < string.length(); j++) {
					s.append(string.charAt(j));
					if(isValid(s.toString()) && s.toString().length() > subString.length()){
						subString = s.toString();
					}
				}
				if(i == string.length() - 1){
					System.out.println(subString+" : "+subString.length());
				}
			}
		}
	}

	private static boolean isValid(String string) {
		//consider you have dictionary to check valid string or not..
		if(string.equalsIgnoreCase("in") || string.equalsIgnoreCase("inter") || string.equalsIgnoreCase("view") || string.equalsIgnoreCase("interview") || 
				string.equalsIgnoreCase("bay") || string.equalsIgnoreCase("best") || 
				string.equalsIgnoreCase("key") || string.equalsIgnoreCase("board")){
			return true;
		}
		return false;
	}
}
