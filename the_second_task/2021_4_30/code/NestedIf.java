import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����������");
		double score = myScanner.nextDouble();


		if (score > 8.0){
			System.out.println("���������");
			System.out.println("�������Ա�");
		    char gender = myScanner.next().charAt(0);
			if (gender == '��') {
				System.out.println("����������!");
			} else if (gender == 'Ů') {
				System.out.println("����Ů����!");
			}
		} else {
			System.out.println("����ʧ�ܣ�");
		}


	}
}