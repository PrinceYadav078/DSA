import java.util.Scanner;

public class Sumofarray {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first array size");
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter second array size");
        int n2=scn.nextInt();
        int [] arr2=new int[n2];
        inputarr(arr1,1);
        inputarr(arr2, 2);
        int[] sum=new int[n2>n1?n2:n1];
        arrsum(arr1, arr2, sum);
    }

    public static void inputarr(int[]arr, int n){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter "+n+ "array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void arrsum(int[]arr1, int[]arr2, int[]sum){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        int c=0;
        while(k>=0){
            int d=c;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c=d/10;
            d%=10;
            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(c>0){
            System.out.print(c);
        }
        for(int x=0;x<sum.length;x++){
            System.out.print(sum[x]);
        }
    }
}
