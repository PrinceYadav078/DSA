package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class removeprime {

    public static boolean isprime(int n){
        boolean prime=true;
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                prime=false;
            }
        }
        return prime;
    }
    public static void solution(ArrayList<Integer> al){
       for(int i=al.size()-1;i>=0;i--){
        if(isprime(al.get(i))){
            al.remove(i);
            
        }
       }
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
    }
}
