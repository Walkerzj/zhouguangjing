import java.util.Scanner;
public class Array02 {
	public static void main(String[] args){
		double scores[];
		scores = new double[5];
		for (int i = 0; i < scores.length; i++){
			System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ:");
			Scanner myScanner = new Scanner(System.in);
			scores[i] = myScanner.nextDouble();
			}
		System.out.println("=======��ǰ�����ֵΪ=======");
		for (int i = 0; i < scores.length; i++){
			System.out.println("��"+i+"��Ԫ�ص�ֵΪ��"+ scores[i]);
			}
		}

	}