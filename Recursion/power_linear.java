package Recursion;
import java.util.Scanner;
public class power_linear {
    
    public static int pow_lin(int x,int n){
        if(n==0){
            return 1;
        }
        int xpn=x*pow_lin(x, n-1);
        return xpn;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number x and power n");
        int x=scn.nextInt();
        int n= scn.nextInt();
        System.out.println(x+" to the power "+n+" is => "+pow_lin(x, n));
    }
}
