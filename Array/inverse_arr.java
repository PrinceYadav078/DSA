// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.

// For definition and constraints check this link
// https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number/ojquestion
// The only difference is the range of values is from 0 to n - 1, instead of 1 to n.

import java.util.Scanner;
public class inverse_arr {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static int[] Inverse(int[]arr){
        int []inv=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            inv[arr[i]]=i;
        }
        return inv;
    }
    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int[]arr=new int[n];
        inputarr(arr);
        int []inv=Inverse(arr);
        display(inv);
        
    }
}

//input 5 =>4 0 2 3 1
// Output =>1 4 2 3 0