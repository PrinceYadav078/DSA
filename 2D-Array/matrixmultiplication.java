import java.util.Scanner;
public class matrixmultiplication {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }
    public static void print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void matrmult(int[][]arr1,int[][]arr2, int m1,int n2 ){
        if(m1!=n2){
            System.out.println("Invalid input");
            return;
        }
        int [][]prd=new int[arr1.length][arr2[0].length];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                int val=0;
                for(int k=0;k<n2;k++){
                    val+= arr1[i][k]*arr2[k][j];
                }
                prd[i][j]=val;
            }
        }
        System.out.println("*********************************************");
        print(prd);
        System.out.println("*********************************************");
        
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter arr1 dimension row and col");
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int[][] arr1=new int[n1][m1];
        System.out.println("Enetr arr1 elements");
        inputarr(arr1);

        System.out.println("Enter arr2 dimension row and col");
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int[][] arr2=new int[n2][m2];
        inputarr(arr2);

        matrmult(arr1, arr2,m1,n2);
    }
}
