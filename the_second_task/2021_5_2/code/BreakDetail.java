import java.util.Scanner;

public class BreakDetail{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		for (int i =1; i<=3; i++){
			System.out.println("请输入姓名：");
			String name = myScanner.next();
			System.out.println("请输入密码：");
			String password = myScanner.next();
			if (name.equals("丁真") && password.equals("666")){
				System.out.println("恭喜您，登陆成功了！");
				break;
			} else{
				System.out.println("还剩余" + (3-i) + "次机会");
			}

		}
	}
}