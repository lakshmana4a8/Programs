package access.modifiers;

public class OldPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.defaultAge = 10;
		person.publicAge = 10;
		person.protectedAge = 10;
		person.privateAge = 10;// error: we can't access private variables outside of the class
		person.defaultMethod();
		person.publicMethod();
		person.protectedMethod();
		person.privateMethod();// error: we can't access private methods outside of the class
	}
}
