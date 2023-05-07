import java.util.Scanner;
public class differenceofarray {
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
        int[] diff=new int[n2];
        arrdiff(arr1, arr2, diff);
    }
    
    public static void inputarr(int[]arr, int n){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter "+n+ "array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void arrdiff(int[]arr1, int[]arr2, int[]diff){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        int c=0;
        while(k>=0){
            int d=arr2[j]-c;
            if(i>=0){
                d-=arr1[i];
            }
            if(d<0){
                d+=10;
                c=1;
            }else{
                //nothing to do with d
                c=0;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]!=0){
                break;
            }else{
                idx++;
            }
        }
        while(idx<diff.length){
            System.out.print(diff[idx]);
            idx++;
        }
    }
}
