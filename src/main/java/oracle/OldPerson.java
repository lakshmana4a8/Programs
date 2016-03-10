package oracle;

import access.modifiers.Person;

public class OldPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.defaultAge = 10;
		person.publicAge = 10;
		person.protectedAge = 10;
		person.privateAge = 10;
		person.defaultMethod();
		person.publicMethod();
		person.protectedMethod();
		person.privateMethod();
	}
}
