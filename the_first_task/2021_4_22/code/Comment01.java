// 转义字符作业课堂练习

public class Comment01 {
	public static void main (String[] args) {
		// 这是单行注释
		/* 这是多行注释
		// \n:换行符
		System.out.println("红楼梦\n西游记\n水浒传\n三国演义");
		*/
		// \\:一个\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");

		// \":一个"
		System.out.println("老师说：\"好好锻炼技能！\"");

		// \r:回车键
		// 1.输出  老师说：
		// 2.\r表示回车
		// 3.回车光标放在最前
		System.out.println("老师说：\r好好锻炼技能！");

	}
}