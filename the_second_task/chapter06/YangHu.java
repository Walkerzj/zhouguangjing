public class YangHu{
	public static void main(String[] args){
		int [][] arr = new int[10][];

		for (int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++){
				if (j == 0 || j == arr[i].length -1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}


		}
		// System.out.println(arr.length);
		for (int a = 0; a < arr.length; a ++){
			for (int s = 0; s < arr[a].length; s ++){
				System.out.print(arr[a][s] + "\t");
			}
			System.out.println();
		}

	}
}