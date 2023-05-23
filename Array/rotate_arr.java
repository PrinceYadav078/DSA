import java.util.Scanner;
public class rotate_arr {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void reverse(int[]arr, int st,int end){
        while(st<=end){
            int t=arr[st];
            arr[st]=arr[end];
            arr[end]=t; 
            st++;
            end--;
        }
    }

    public static void rotate(int[]arr, int k){
        reverse(arr, 0, arr.length-1-k);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=scn.nextInt();
        int[]arr=new int[n];
        inputarr(arr);
        System.out.println("enter rotate number");
        int k=scn.nextInt();
        rotate(arr, k);
        display(arr);
    }
}
