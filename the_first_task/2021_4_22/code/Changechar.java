//ת���ַ���ʹ��
public class Changechar {
	public static void main (String[] args) {
		// \t:һ���Ʊ�λ��ʵ�ֶ���
		System.out.println("����\t���\t�Ϻ�");

		// \n:���з�
		System.out.println("��¥��\n���μ�\nˮ䰴�\n��������");

		// \\:һ��\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");

		// \":һ��"
		System.out.println("��ʦ˵��\"�úö������ܣ�\"");

		// \r:�س���
		// 1.���  ��ʦ˵��
		// 2.\r��ʾ�س�
		// 3.�س���������ǰ
		System.out.println("��ʦ˵��\r�úö������ܣ�");
	}
}