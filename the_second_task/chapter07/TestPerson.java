public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("King", 18);
		System.out.println(p1.compareTo(p1));

	}
}

class Person {
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age == p.age;
	}
}