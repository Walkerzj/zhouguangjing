
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
				// System.out.println("余额不足，禁止通行！");
				break;
			}

		}
		System.out.println("剩余"+money + "可以通过" + count + "次！");
	}
}