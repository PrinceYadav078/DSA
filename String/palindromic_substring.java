package String;
import java.util.Scanner;
public class palindromic_substring {

    public static void pal_sub(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i, j);
                boolean ispal=isPalindrome(sub);
                if(ispal){
                    System.out.print(sub+" , ");
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        boolean flag=true;
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;

        }

        return flag;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String");
        String str=scn.nextLine();
        pal_sub(str);
    }
}
