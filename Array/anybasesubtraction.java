import java.util.Scanner;

public class anybasesubtraction {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base");
        int b=scn.nextInt();
        System.out.println("Enter num1");
        int n1=scn.nextInt();
        System.out.println("Enter num2");
        int n2=scn.nextInt();
        
        int ans=getSubt(b,n1,n2);
        System.out.println(ans);
    }

    public static int getSubt(int b, int n1, int n2){
        int diff=0 ,c=0, tp=1;
        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;

            n1/=10;
            n2/=10;

            int d=d2-c-d1;
            if(d<0){
                c=1;
                d+=b;
            }else{
                c=0;
            }

            diff+=d*tp;
            tp*=10;
        }

        return diff;
    }
}
