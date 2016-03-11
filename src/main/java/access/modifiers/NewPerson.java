package access.modifiers;

public class NewPerson extends Person{
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
		
		NewPerson newPerson = new NewPerson();
		newPerson.defaultAge = 10;
		newPerson.publicAge = 10;
		newPerson.protectedAge = 10;
		newPerson.privateAge = 10;// error: we can't access private variables outside of the class
		newPerson.defaultMethod();
		newPerson.publicMethod();
		newPerson.protectedMethod();
		newPerson.privateMethod();// error: we can't access private methods outside of the class
		
		Person person1 = new NewPerson();
		person1.defaultAge = 10;
		person1.publicAge = 10;
		person1.protectedAge = 10;
		person1.privateAge = 10;// error: we can't access private variables outside of the class
		person1.defaultMethod();
		person1.publicMethod();
		person1.protectedMethod();
		person1.privateMethod();// error: we can't access private methods outside of the class
	}
}
