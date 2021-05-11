import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		int passNum = 0;
		double totalScore = 0;
		Scanner myScanner = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {	
			double sum = 0;	
			for (int j =1; j <=5; j++){
				System.out.println("请输入第"+ i +"个班的第"+j+"个学生的成绩");
				double score = myScanner.nextDouble();
				if (score >= 60){
					passNum ++;
				}
				sum += score; //累积
				System.out.println("成绩为" + score);
			}
			totalScore += sum;
			System.out.println("sum=" + sum + "平均分=" + (sum/5));
	}
	System.out.println("三个班总分="+totalScore+"平均分="+ (totalScore/15));



	}
}