// Saddle price=> Minimum element i row and maximum in column

import java.util.Scanner;
public class Saddle_price {
    public static void inputarr(int[][] arr) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two_d array Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void sadd_price(int[][]arr){
        for(int i=0; i<arr.length;i++){
            int min =arr[i][0];
            int pos=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    pos=j;
                }
            }

            boolean isSaddle=true;
            for(int i2=0;i2<arr.length;i2++){
                if(arr[i2][pos]>min){
                    isSaddle=false;
                }
            }
            if(isSaddle){
                System.out.println("Saddle price is=> "+min);
                return;
            }
        }
        System.out.println("No Saddle Price Found");
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Dimension of Array row and col");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        inputarr(arr);
        sadd_price(arr);
    }
}
