package oracle;


public class OldPerson {
	public static void main(String[] args) {
		access.modifiers.Person person = new access.modifiers.Person();
		person.defaultAge = 10;// error: we can't access default variables outside of the package
		person.publicAge = 10;
		person.protectedAge = 10;// error: we can't access protected variables outside of the package
		person.privateAge = 10;// error: we can't access private variables outside of the class
		person.defaultMethod();// error: we can't access default methods outside of the package
		person.publicMethod();
		person.protectedMethod();// error: we can't access protected methods outside of the package
		person.privateMethod();// error: we can't access private methods outside of the class
	}
}
