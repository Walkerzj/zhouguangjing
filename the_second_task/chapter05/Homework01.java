
public class Homework01{
	public static void main(String[] args){
		double money = 100000;
		int count = 0;
		while (true){
			if (money > 50000){
				money *= 0.95;
				count += 1;
			}
			else if (money > 1000) {
				money -= 1000;
				count += 1;
			}
			else{
				// System.out.println("���㣬��ֹͨ�У�");
				break;
			}

		}
		System.out.println("ʣ��"+money + "����ͨ��" + count + "�Σ�");
	}
}