//
public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		// (1)使用int变量days保存天数；
		// (2)一星期7天(/)；
		// (3)余几天就是求余(%);
		int days = 59;
		int weeks = days/7;
		int leftDays = days % 7;
		System.out.println(days + "天相当于" + weeks + "星期零" + leftDays + "天");

		// (1)先试用double定义华氏温度
		// (2)根据公式进行计算
		// (3)将得到的结果保存到double 华氏温度中
		double huashi = 234.6;
		double sheshi = 5.0/9 * (huashi - 100);
		System.out.println("华氏温度" + huashi + "对应的摄氏温度=" + sheshi);


	}
}