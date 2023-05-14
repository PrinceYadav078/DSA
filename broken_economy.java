import java.util.Scanner;
public class broken_economy {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Sorted array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void Broken_Economy(int[]arr,int d){
        int st=0, end=arr.length-1, ceil=0,floor=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(d==arr[mid]){
                ceil=floor=mid;
            }else if(d>arr[mid]){
                floor=arr[mid];
                st=mid+1;
            }else{
                ceil=arr[mid];
                end=mid-1;
            }
        }
        System.out.println("Ceil=> "+ceil);
        System.out.println("Floor=> "+floor);

    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter Denomination");
        int d=scn.nextInt();
        Broken_Economy(arr, d);
    }
}
// input 5, 10, 15, 22, 33, 40, 42, 55
// output ceil=33 and floor=22