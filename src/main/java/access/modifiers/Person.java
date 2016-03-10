private package access.modifiers;

public class Person {
	int defaultAge;
	public int publicAge;
	private int privateAge;
	protected int protectedAge;
	
	public int getDefaultAge() {
		return defaultAge;
	}

	public void setDefaultAge(int defaultAge) {
		this.defaultAge = defaultAge;
	}

	public int getPublicAge() {
		return publicAge;
	}

	public void setPublicAge(int publicAge) {
		this.publicAge = publicAge;
	}

	public int getPrivateAge() {
		return privateAge;
	}

	public void setPrivateAge(int privateAge) {
		this.privateAge = privateAge;
	}
	
	String defaultMethod(){
		return "defaultMethod";
	}
	
	public String publicMethod(){
		return "publicMethod";
	}
	
	private String privateMethod(){
		return "privateMethod";
	}
	
	protected String protectedMethod(){
		return "protectedMethod";
	}

	@Override
	public String toString() {
		return "Person [defaultAge=" + defaultAge + ", publicAge=" + publicAge
				+ ", privateAge=" + privateAge + "]";
	}
}
