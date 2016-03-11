package oracle;

import access.modifiers.Person;

public class NewPerson extends access.modifiers.Person{
	public static void main(String[] args) {
		access.modifiers.Person person = new access.modifiers.Person();
		person.defaultAge = 10;// error: we can't access default variables outside of the package
		person.publicAge = 10;
		person.protectedAge = 10;// error: we can't access protected variables outside of the package
		person.privateAge = 10;// error: we can't access private variables outside of the class
		person.defaultMethod();
		person.publicMethod();
		person.protectedMethod();// error: we can't access protected methods outside of the package
		person.privateMethod();// error: we can't access private methods outside of the class
		
		NewPerson newPerson = new NewPerson();
		newPerson.defaultAge = 10;// error: we can't access default variables outside of the package
		newPerson.publicAge = 10;
		newPerson.protectedAge = 10;// we can access protected variables in child class, outside of package
		newPerson.privateAge = 10;// error: we can't access private variables outside of the class
		newPerson.defaultMethod();// error: we can't access protected methods outside of the package
		newPerson.publicMethod();
		newPerson.protectedMethod();// we can access protected methods in child class
		newPerson.privateMethod();// error: we can't access private methods outside of the class
		
		access.modifiers.Person person1 = new NewPerson();
		person1.defaultAge = 10;// error: we can't access default variables outside of the package
		person1.publicAge = 10;
		person1.protectedAge = 10;// error: we can't access protected variables outside of the package
		person1.privateAge = 10;// error: we can't access private variables outside of the class
		person1.defaultMethod();// error: we can't access default methods outside of the package
		person1.publicMethod();
		person1.protectedMethod();// error: we can't access protected methods outside of the package
		person1.privateMethod();// error: we can't access private methods outside of the class
	}
}
