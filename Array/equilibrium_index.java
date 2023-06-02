import java.util.Scanner;
public class equilibrium_index {
    public static int findEquilibrium(int arr[], int n)
    {
     
      int ls=0;
      int rs=0;
      for(int p=1;p<n;p++){
          rs+=arr[p];
      }
      if(ls==rs){
          return 0;
      }
      
      for(int i=1;i<n;i++){
          ls=ls+arr[i-1];
          rs=rs-arr[i];
          if(ls==rs){
              return i;
          }
      }
      return -1;
    }

    public static void inputarr(int[]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=scn.nextInt();
        int []arr=new int[n];
        inputarr(arr);
        int res=findEquilibrium(arr, n);
        if(res!=-1){
            System.out.println("Eqilibrium Index => "+res);
        }else{
            System.out.println("Eqilibrium Index not found");
        }

    }
}
