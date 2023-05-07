import java.util.Scanner;
public class barchart {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter elemets");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        barchart(arr);
    }
    public static void barchart(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int ht=max;ht>=1;ht--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=ht){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

