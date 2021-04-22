
//这是java的快速入门，演示Java的开发步骤
//对代码的相关说明
//1.public class Hello 表示Hello是一个public公有的类
//2.Hello{}表示一个类的开始和结果
//3.public static void main表示主方法，即程序的入口
//4.main(){}方法的开始和结束
//5.System.out.println("hello,world~")输出“Hello world”到屏幕
//6.";"表示语句结束
public class Hello {
	
	//编写一个main方法
	public static void main(String[] args) {
		System.out.println("G.J.Zhou is studying java!");
	}
}

//一个源文件中最多只能有一个piublic类，其它类的个数不限。
//Dog 是一个类
//编译后，每一个类，都对于一个.class
class Dog {

	public static void main(String[] args) {
		System.out.println("Hello, 小狗狗！");
	}

}
class Tiger {

	public static void main(String[] args) {
		System.out.println("Hello, 小老虎！");
    }

}