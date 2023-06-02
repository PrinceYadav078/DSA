package String;

import java.util.Scanner;

class str_diff_two_cons_char{
    public static String fun(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                char chi=str.charAt(i);
                sb.append(chi);
            }else{
                char chi=str.charAt(i);
                char chip1=str.charAt(i+1);
                sb.append(chi);
                sb.append(chip1 - chi);
            }
        }

        return sb.toString();
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter String");
        String str=scn.nextLine();
        String res= fun(str);
        System.out.println(res);
    }
}