import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//��ʾ�û�������
		// 1. ����Scanner�����ڵİ�
		// 2. ����Scanner����
		
		Scanner myScanner = new Scanner(System.in);

		// 3. �����û����룬ʹ����صķ���
		System.out.println("����������");
		String name = myScanner.next();  //�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();  //�����û�����Int
		System.out.println("������нˮ");
		double sallary = myScanner.nextDouble();  //�����û�����Double
		System,out.println("name=" + name + "����=" + age + "нˮ=" + sallary);
	}
}