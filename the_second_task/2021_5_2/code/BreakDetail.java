import java.util.Scanner;

public class BreakDetail{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		for (int i =1; i<=3; i++){
			System.out.println("������������");
			String name = myScanner.next();
			System.out.println("���������룺");
			String password = myScanner.next();
			if (name.equals("����") && password.equals("666")){
				System.out.println("��ϲ������½�ɹ��ˣ�");
				break;
			} else{
				System.out.println("��ʣ��" + (3-i) + "�λ���");
			}

		}
	}
}