package GJZhou.homework0518.homework_fei;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("请输入>=1数字：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        A a = new A();
        a.fi(n, arr);
        System.out.println(Arrays.toString(arr));
    }
}


class A{
    public int fi(int n, int[] arr){
        if (n == 1||n == 2){
            return arr[n-1] = 1;
        }
        else{
            return arr[n-1] = fi(n-1,arr) + fi(n-2,arr);
        }
    }
}
