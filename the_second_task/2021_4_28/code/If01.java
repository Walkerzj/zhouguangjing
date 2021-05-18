import java.util.Scanner;
public class If01 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextIn();
		if (age > 18) {
			System.out.println("年龄大于18岁，需要对自己的行为负责");
		}

		System.out.println("程序继续在执行");

	}
}