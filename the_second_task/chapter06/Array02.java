import java.util.Scanner;
public class Array02 {
	public static void main(String[] args){
		double scores[];
		scores = new double[5];
		for (int i = 0; i < scores.length; i++){
			System.out.println("请输入第"+(i+1)+"个元素的值:");
			Scanner myScanner = new Scanner(System.in);
			scores[i] = myScanner.nextDouble();
			}
		System.out.println("=======当前数组的值为=======");
		for (int i = 0; i < scores.length; i++){
			System.out.println("第"+i+"个元素的值为："+ scores[i]);
			}
		}

	}