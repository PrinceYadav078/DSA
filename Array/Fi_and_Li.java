import java.util.Scanner;
public class Fi_and_Li {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Sorted array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static int Fi(int[]arr,int key){
        int fi=-1,st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(key==arr[mid]){
                fi=mid;
                end=mid-1;
            }else if(key>mid){
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return fi;
    }
    public static int Li(int[]arr,int key){
        int li=-1,st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(key==arr[mid]){
                li=mid;
                st=mid+1;
            }else if(key>arr[mid]){
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return li;
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        System.out.println("Enter Key");
        int key=scn.nextInt();
        int fi=Fi(arr, key);
        System.out.println("Fi=> "+fi);
        int li=Li(arr, key);
        System.out.println("Li=> "+li);

    }
}


//input 1 5 10 15 22 33 33 33 33 33 40 42 55 66 77  n=15 and key 33
//output fi=5 and li 9
