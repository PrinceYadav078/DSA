// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

import java.util.Scanner;
public class findelem {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter number which you want to find ");
        int num=scn.nextInt();
       
        int res=findnum(arr, num);
        System.out.println(res);
    }

    public static int findnum(int[]arr, int num){
        int atfound=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                atfound=i;
                break;
            }
        }
        return atfound;
        
    }
}

// input arr=> 15 30 40 4 11 9 
// 40=> num
//output=>2