import java.util.Scanner;
public class anybaseadd{
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter base");
        int b=scn.nextInt();
        System.out.println("Enter num1");
        int n1=scn.nextInt();
        System.out.println("Enter num2");
        int n2=scn.nextInt();
        int ans=getSum(b,n1,n2);
        System.out.println("ans is=> "+ans);
    }

    public static int getSum(int b, int n1, int n2){
        int sum=0 , c=0 , tp=1;

        while(n1>0||n2>0||c>0){
            int d1=n1%10;
            n1/=10;

            int d2=n2%10;
            n2/=10;

            int d=d1+d2+c;

            c=d/b;
            d%=b;

            sum+=d*tp;
            tp*=10;
        }
        return sum;

    }
}