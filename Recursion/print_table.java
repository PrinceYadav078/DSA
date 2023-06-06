package Recursion;
import java.util.Scanner;
public class print_table {
    public static int pTable(int x, int n){
        if(n==1){
            return 1;
        }
        int val= x * pTable(x, n-1);
        System.out.println(val);

        return n;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number x and power n");
        int x=scn.nextInt();
        int n= scn.nextInt();
        pTable(x, n+1);
    }
}
