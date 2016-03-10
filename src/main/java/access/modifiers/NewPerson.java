package access.modifiers;

public class NewPerson extends Person{
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
		
		NewPerson newPerson = new NewPerson();
		newPerson.defaultAge = 10;
		newPerson.publicAge = 10;
		newPerson.protectedAge = 10;
		newPerson.privateAge = 10;
		newPerson.defaultMethod();
		newPerson.publicMethod();
		newPerson.protectedMethod();
		newPerson.privateMethod();
		
		Person person1 = new NewPerson();
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
