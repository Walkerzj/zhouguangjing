
//
public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		int i = 1;
		i = i++;
		System.out.println(i);
		
		int j = 1;
		j = ++j;
		System.out.println(j);

		int i1 = 10;
		int i2 = 20;
		int z = i1 ++;
		System.out.println("i="+z);
		System.out.println("i2="+i2);
		z = --i2;
		System.out.println("i="+z);
		System.out.println("i2="+i2);

	}
}