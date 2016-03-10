package oracle;

import access.modifiers.Person;

public class NewPerson extends access.modifiers.Person{
	public static void main(String[] args) {
		access.modifiers.Person person = new access.modifiers.Person();
		person.defaultAge = 10;
		person.publicAge = 10;
		person.protectedAge = 10;
		person.privateAge = 10;
		person.defaultMethod();
		person.publicMethod();
		person.protectedMethod();
		person.privateMethod();
		
		NewPerson newPerson = new NewPerson();
		newPerson.defaultAge = 10;
		newPerson.publicAge = 10;
		newPerson.protectedAge = 10;
		newPerson.privateAge = 10;
		newPerson.defaultMethod();
		newPerson.publicMethod();
		newPerson.protectedMethod();
		newPerson.privateMethod();
		
		access.modifiers.Person person1 = new NewPerson();
		person1.defaultAge = 10;
		person1.publicAge = 10;
		person1.protectedAge = 10;
		person1.privateAge = 10;
		person1.defaultMethod();
		person1.publicMethod();
		person1.protectedMethod();
		person1.privateMethod();
	}
}
