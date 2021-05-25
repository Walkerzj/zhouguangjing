package GJZhou.homework0525.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 15, 100);
        persons[2] = new Student("smith", 18, 100);
        persons[3] = new Teacher("Tome", 30, 20000);
        persons[4] = new Teacher("Tome", 50, 25000);

        for (int i = 0; i < persons.length; i++) {
            //编译类型是person,运行内存是等号右边的
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }else if(persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }else {
                System.out.println("类型有误，请检查...");
            }
        }



    }
}
