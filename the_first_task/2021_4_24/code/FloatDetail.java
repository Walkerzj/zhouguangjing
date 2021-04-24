//
public class FloatDetail{

	public static void main(String[] args){
		float a = 1.2F;
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);

		double c = 5.12e2;
		double d = 5.12e-2;
		System.out.println(c);
		System.out.println(d);

		double num11 = 2.7;
		double num12 = 8.1/3;
		if (num11 == num12){
			System.out.println("相等～");
		}

		if (Math.abs(num11 - num12) < 0.00001){
			System.out.println("近似相等！～");
		}
	}
}