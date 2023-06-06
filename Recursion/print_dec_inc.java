package Recursion;
import java.util.Scanner;
public class print_dec_inc {
    
    public static void pid(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pid(n-1);
        System.out.println(n);
        

    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Number");
        int n=scn.nextInt();
        pid(n);
    }
}
