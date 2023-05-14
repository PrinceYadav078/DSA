import java.util.Scanner;
public class binarySearch {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Sorted array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static int B_Search(int[] arr,int k){
        int foundAt= -1;
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(k==arr[mid]){
                return foundAt=mid+1;
                
            }else if(k>arr[mid]){
                st=mid+1;
            }else if(k<arr[mid]){
                end=mid-1;
            } 
        }
        return foundAt;
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter Key");
        int key=scn.nextInt();
        int res=B_Search(arr, key);
        if(res!=-1){
            System.out.println("key found at "+res+" Position ");
        }else{
            System.out.println("key not found ");
        }

    }
}
