package Recursion;

import java.util.Scanner;

public class print_decreasing {
    
    public static void pd(int n){
        if(n==0){
            return;
        }
        // epectation => pd(5) => 5 4 3 2 1
        //faith => pd(4) => 4 3 2 1
        //E Weds F=> 5 4 3 2 1
        System.out.println(n);
        pd(n-1);
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Number");
        int n=scn.nextInt();
        pd(n);
    }
}
