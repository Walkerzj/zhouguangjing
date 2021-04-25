//
public class StringtoBasic {
	public static void main(String[] args){

		// 基本数据类型转String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";

		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		String s5 = "1243";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);

		System.out.println(num1);


	}
}