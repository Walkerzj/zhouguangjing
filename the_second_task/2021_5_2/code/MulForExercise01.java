import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		int passNum = 0;
		double totalScore = 0;
		Scanner myScanner = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {	
			double sum = 0;	
			for (int j =1; j <=5; j++){
				System.out.println("�������"+ i +"����ĵ�"+j+"��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				if (score >= 60){
					passNum ++;
				}
				sum += score; //�ۻ�
				System.out.println("�ɼ�Ϊ" + score);
			}
			totalScore += sum;
			System.out.println("sum=" + sum + "ƽ����=" + (sum/5));
	}
	System.out.println("�������ܷ�="+totalScore+"ƽ����="+ (totalScore/15));



	}
}