//演示算术运算符的使用
public class ArithmeticOperator{
	public static void main (String[] args){
		// /的使用
		System.out.println(10/4);
		System.out.println(10.0/4);
		double d = 10/4;
		System.out.println(d);
		// 取余
		System.out.println(10 % 4);
		//在%的本质 看一个公式 a%b = a- a/b *b
		
		System.out.println(-10%3);

		System.out.println(10%-3);

		System.out.println(-10%-3);

		// ++的使用
		int i = 10;
		i++;
		System.out.println("i=" + i);

		
	}
}