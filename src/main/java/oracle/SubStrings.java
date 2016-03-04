package oracle;


public class SubStrings {
	public static void main(String[] args) {
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
		if(string.equalsIgnoreCase("interview") || string.equalsIgnoreCase("best") || string.equalsIgnoreCase("board")){
			return true;
		}
		return false;
	}
}
