//
public class Homework08 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0){
				sum += 1.0/i;
			} else{
				sum -= 1.0/i;
			}
		}
		System.out.println("sum½á¹ûÊÇ£º" + sum);
	} 
	
}