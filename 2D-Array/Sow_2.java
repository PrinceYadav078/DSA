// State of wakanda 2 Sow-2   this works on square matrix 

import java.util.Scanner;
public class Sow_2 {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Array Elements ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }
    
    public static void SOW_2(int [][]arr){
        for(int g=0;g<arr[0].length;g++){
            for(int i=0,j=g;j<arr.length;j++,i++){
                System.out.print(arr[i][j]+"=>");
            }
        }
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter dimension of array n");
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        inputarr(arr);
        SOW_2(arr);
    }
    
}
