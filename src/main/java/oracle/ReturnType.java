package oracle;

public class ReturnType {
	static int a = 11111;
	public ReturnType(){
		a = a++ + ++a;
        System.out.println("no-args constructor after increment : "+a);
	}
	static{
	       a = a-- - --a;
	       System.out.println("static block after decrement : "+a);
	 }
	    
	{
	        a = a++ + ++a;
	        System.out.println("default constructor after increment : "+a);
	 }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(a);
		
		ReturnType returnType = new ReturnType();
		System.out.println(a);
		
		int i1 = getInt1();
		System.out.println(i1);
		
		int i2 = getInt2();
		System.out.println(i2);
	}

	@SuppressWarnings({ "null", "unused" })
	private static int getInt2() {
		return true ? null : 0;
	}

	@SuppressWarnings("finally")
	private static int getInt1() {
		try{
			return 1;
		}finally{
			return 2222;
		}
	}
}
