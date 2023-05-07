import java.util.Scanner;
public class subarray {
    public static void main (String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int[]arr=new int[n];
        inputarr(arr);  
        subarr(arr);      

    }
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void subarr(int[] arr){
        for(int si=0;si<arr.length;si++){
            for(int ei=si;ei<arr.length;ei++){
                for(int i=si;i<=ei;i++){
                    System.out.print(arr[i]+"  ");
                }
                System.out.println();
            }
        }
    }
}
