package oracle;

public class SwapObject {
	public static void main(String[] args) {
		Person a = new Person("lakshman1", 25);
		Person b = new Person("lakshman2", 24);
		System.out.println("1111 : "+a.name+" : "+a.age);
		System.out.println("1111 : "+b.name+" : "+b.age);
		swap(a,b);
		System.out.println();
		System.out.println("6666 : "+a.name+" : "+a.age);
		System.out.println("6666 : "+b.name+" : "+b.age);
	}
	private static void swap(Person a, Person b) {
		a.name = "la";
		a.age = 2;
		System.out.println();
		System.out.println("2222 : "+a.name+" : "+a.age);
		System.out.println("2222 : "+b.name+" : "+b.age);
		Person temp = a;
		a = b;
		System.out.println();
		System.out.println("3333 : "+a.name+" : "+a.age);
		System.out.println("3333 : "+b.name+" : "+b.age);
		b = temp;
		System.out.println();
		System.out.println("4444 : "+a.name+" : "+a.age);
		System.out.println("4444 : "+b.name+" : "+b.age);
		b.name = "la1";
		b.age = 21;
		System.out.println();
		System.out.println("5555 : "+a.name+" : "+a.age);
		System.out.println("5555 : "+b.name+" : "+b.age);
	}
}
