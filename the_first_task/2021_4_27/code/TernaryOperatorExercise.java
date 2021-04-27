//
public class TernaryOperatorExercise{
	public static void main(String[] args){
		int n1 = 555;
		int n2 = 33;
		int n3 = 123;

		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大值=" + max2);

		int max = (n1 > n2 ? n1 : n2) > 3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大值=" + max);
	}
}