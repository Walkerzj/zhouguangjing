import java.util.Scanner;
public class If03 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������÷�(1-100)��");
		int grade = myScanner.nextInt();

		if(grade == 100) {
			System.out.println("���ü��ã�");
		} else if (grade > 80 && grade <= 99) {
			System.out.println("�������㣡");
		} else if (grade >= 60 && grade <= 90) {
			System.out.println("����һ�㣡");
		} else{
			System.out.println("���ò�����");
		}
	}
}