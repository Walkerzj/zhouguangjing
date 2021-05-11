public class ConstructorDetail{
	public static void main(String[] args){
		Person p1 = new Person("King", 40);
		Person p2 = new Person("Tome");
		Dog d1 = new Dog("King");

	}
}

class Person{
	String name;
	int age;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(String pName){
		name = pName;
	}

}

class Dog {
	public Dog(String name){

	}
}