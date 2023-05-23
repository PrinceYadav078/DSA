// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.
// Input Format
// A base b
// A number n1
// A number n2
// Output Format
// A number of base b equal in value to n2 * n1.

import java.util.Scanner;
public class anybasemult {
    public static int anybasesum(int b, int m1, int m2) {
        int ans = 0, carry = 0, pow = 1;
        while (m1 > 0 || m2 > 0 || carry > 0) {
            int d1 = m1 % 10;
            int d2 = m2 % 10;
            m1 /= 10;
            m2 /= 10;
            int d = d1 + d2 + carry;
            carry = d / b;
            d %= b;
            ans += d * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int singledigitmult(int b, int m1, int d2) {
        int ans = 0, carry = 0, pow = 1;
        while (m1 > 0 || carry > 0) {
            int d1 = m1 % 10;
            m1 /= 10;
            int d = d1 * d2 + carry;
            carry = d / b;
            d %= b;
            ans += d * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int getproduct(int b, int m1, int m2){
        int ans=0,pow=1;
        while(m2>0){
            int d2=m2%10;
            m2/=10;

            int SD_prod=singledigitmult(b, m1, d2);
            ans=anybasesum(b, ans, SD_prod*pow);
            pow*=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter First Number");
        int m1=scn.nextInt();
        System.out.println("Enter Second Number");
        int m2=scn.nextInt();
        System.out.println("Enter Base");
        int b=scn.nextInt();
        int res=getproduct(b, m1, m2);
        System.out.println("\n A number of base "+b+" equal in value to "+m2 +" * "+ m1 +" => "+res);
    }
}

// Input b=5 m1=1220 m2=31
// Output 43320