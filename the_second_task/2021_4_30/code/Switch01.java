import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-e)");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a':
			System.out.println("今天星期一");
			break;
			case 'b':
			System.out.println("今天星期二");
			break;
			case 'c':
			System.out.println("今天星期三");
			break;
			case 'd':
			System.out.println("今天星期四");
			break;
			default:
			System.out.println("今天星期五");
		}
		System.out.println("退出！");
	}
}