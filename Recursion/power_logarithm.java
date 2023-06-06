package Recursion;
import java.util.Scanner;
public class power_logarithm {
    
    public static int pow_log(int x, int n){
        if(n==0){
            return 1;
        }
        int xpb2=pow_log(x, n/2);
        int xpn=xpb2*xpb2;
        if(n%2==1){
            xpn=xpn*x;
        }
        return xpn;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number x and power n");
        int x=scn.nextInt();
        int n= scn.nextInt();
        System.out.println(x+" to the power "+n+" is => "+pow_log(x, n));
    }
}
