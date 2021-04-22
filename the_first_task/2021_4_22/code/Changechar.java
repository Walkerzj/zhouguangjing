//转义字符的使用
public class Changechar {
	public static void main (String[] args) {
		// \t:一个制表位，实现对齐
		System.out.println("北京\t天津\t上海");

		// \n:换行符
		System.out.println("红楼梦\n西游记\n水浒传\n三国演义");

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