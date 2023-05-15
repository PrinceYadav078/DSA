import java.util.Scanner;
public class inverted_barchart {
    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter array element");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static int maxelem(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void Inv_Chart(int[]arr){
        int height=maxelem(arr);
        for(int ht=1;ht<=height;ht++){
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
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        Inv_Chart(arr);
    }
}
