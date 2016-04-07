package oracle;

public class NumberSeries {
	public static void main(String[] args) {
		int number = 1;
		String num = String.valueOf(number);
		System.out.println(num);
		int count = 0;
		while (count < 8) {
			count++;
			String temp = num;
			num = "";
			int numCount = 1;
			for (int i = 0; i < temp.length(); i++) {
				if((temp.length() - 1) == i){
					int n = numCount * 10;
					n += temp.charAt(i) - '0';
//					n += Character.getNumericValue(temp.charAt(i));
					num += n;
					temp = num;
					break;
				}
				for (int j = i + 1; j < temp.length(); j++) {
					if(temp.charAt(i) == temp.charAt(j)){
						numCount++;
					}else{
						int n = numCount * 10;
						n +=  temp.charAt(i) - '0';
//						n += Character.getNumericValue(temp.charAt(i));
						num += n;
						i = j - 1;
						numCount = 1;
						break;
					}
				}
			}
			System.out.println(temp);
		}
	}
}