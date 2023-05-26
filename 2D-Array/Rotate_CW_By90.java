import java.util.Scanner;
public class Rotate_CW_By90 {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transpose(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public static void reverse(int[][]arr){
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    
    public static void rotateby90(int[][]arr){
        transpose(arr);
        reverse(arr);
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter dimension of array n x n");
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        inputarr(arr);
        System.out.println("---------------------------------------");
        System.out.println("Before Rotate");
        display(arr);
        System.out.println("---------------------------------------");

        rotateby90(arr);
        System.out.println("---------------------------------------");
        System.out.println("After Rotate");
        display(arr);
        System.out.println("---------------------------------------");

    }
}
