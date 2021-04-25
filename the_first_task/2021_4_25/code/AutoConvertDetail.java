
public class AutoConvertDetail{
	public static void main(String[] args){
		int n1 = 10;
		double d1 = n1 + 1.1;

		byte b2 = 1; // byte:-128-127

		short s1 = 1;

		int s2 = b2 + s1;

		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double b5 = b4+s3+num200+num300;

		System.out.println(b5);

	}
}