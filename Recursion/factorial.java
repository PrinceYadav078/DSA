package Recursion;

import java.util.Scanner;

public class factorial {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f=n*fact(n-1);
        return f;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int n= scn.nextInt();
        System.out.println("Factorial of "+n+" => "+fact(n));
    }
}
