//
public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		// (1)ʹ��int����days����������
		// (2)һ����7��(/)��
		// (3)�༸���������(%);
		int days = 59;
		int weeks = days/7;
		int leftDays = days % 7;
		System.out.println(days + "���൱��" + weeks + "������" + leftDays + "��");

		// (1)������double���廪���¶�
		// (2)���ݹ�ʽ���м���
		// (3)���õ��Ľ�����浽double �����¶���
		double huashi = 234.6;
		double sheshi = 5.0/9 * (huashi - 100);
		System.out.println("�����¶�" + huashi + "��Ӧ�������¶�=" + sheshi);


	}
}