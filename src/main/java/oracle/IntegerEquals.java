package oracle;

public class IntegerEquals {
	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;
		System.out.println("Integer 128 equals to 128 : "+(i1 == i2));
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println("Integer 127 equals to 127 : "+(i3 == i4));
		Integer i5 = 126;
		Integer i6 = 126;
		System.out.println("Integer 126 equals to 126 : "+(i5 == i6));
		Long l1 = 128L;
		Long l2 = 128L;
		System.out.println("Long 128L equals to 128L : "+(l1==l2));
		Long l3 = 127L;
		Long l4 = 127L;
		System.out.println("Long 127L equals to 127L : "+(l3==l4));
		Long l5 = 126L;
		Long l6 = 126L;
		System.out.println("Long 126L equals to 126L : "+(l5==l6));
		Short s1 = 128;
		Short s2 = 128;
		System.out.println("Short 128 equals to 128 : "+(s1==s2));
		Short s3 = 127;
		Short s4 = 127;
		System.out.println("Short 127 equals to 127 : "+(s3==s4));
		Short s5 = 126;
		Short s6 = 126;
		System.out.println("Short 126 equals to 126 : "+(s5==s6));
		
		Integer i = new Integer(null);
		System.out.println(i);
		String s = new String(null);
		System.out.println(s1);
	}
}
