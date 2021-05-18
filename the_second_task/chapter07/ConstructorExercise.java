public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person();
		System.out.println("p1的信息\t"+p1.name+"\t"+p1.age);
		
		Person p2 = new Person("King", 50);
		System.out.println("p2的信息\t"+p2.name+"\t"+p2.age);

	}
}

class Person{
	String name;
	int age;
	public Person(){
		age = 18;
	}

	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}