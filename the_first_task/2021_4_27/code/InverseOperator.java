//! 和 ^的使用

public class InverseOperator{
	public static void main(String[] args){

		System.out.println(60>10);
		System.out.println(!(60>10));
		
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println(b);

	}
}