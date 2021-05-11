public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {24, 69, 80, 57, 13};
		int temp = 0;
		for(int i = 0; i < 4; i++){
			for (int j = 0; j < (4-i); j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int z = 0; z < arr.length; z++){
			System.out.print(arr[z] + "\t");
		}
		
	}
}