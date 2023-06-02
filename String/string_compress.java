package String;

import java.util.Scanner;

public class string_compress {
    public static String compr1(String str){
        String ans="";
        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                ans+=str.charAt(i);
            }
        }
        ans+=str.charAt(str.length()-1);
        return ans;
    }
    public static String compr2(String str){
        String ans="";
        int count=1;
        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                ans+=str.charAt(i);
                if(count>1){
                    ans+=count;
                    count=1;
                }
               
            }
        }
        ans+=str.charAt(str.length()-1);
        if(count>1){
            ans+=count;
            count=1;
        }
        return ans;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String");
        String str=scn.nextLine();
        String ans1=compr1(str);
        System.out.println(ans1);
        String ans2=compr2(str);
        System.out.println(ans2);
    }
}
