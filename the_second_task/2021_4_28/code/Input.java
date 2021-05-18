import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//演示用户的输入
		// 1. 引入Scanner类所在的包
		// 2. 创建Scanner对象
		
		Scanner myScanner = new Scanner(System.in);

		// 3. 接收用户输入，使用相关的方法
		System.out.println("请输入名字");
		String name = myScanner.next();  //接收用户输入字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();  //接收用户输入Int
		System.out.println("请输入薪水");
		double sallary = myScanner.nextDouble();  //接收用户输入Double
		System,out.println("name=" + name + "年龄=" + age + "薪水=" + sallary);
	}
}