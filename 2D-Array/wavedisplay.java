//STATE OF WAKANDA QUESTION


import java.util.Scanner;
public class wavedisplay {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }

    public static void wavdisp(int[][]arr){
        for(int j=0; j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+"=>");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+"=>");
                }
            }
        }
    }
    
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enetr size of array n and m");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int arr[][]=new int[n][m];
        inputarr(arr);
        wavdisp(arr);

    }
}
