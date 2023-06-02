package String;

public class String_interning {
    public static void main(String[]args){
        String s1="hello";
        String s2="hello"; //INTERNING S2 IS REFER THE ADDRESS OF S1
        String s3=new String("hello"); // interning s3 allocate new address in stack and that address point to s1 shell address
        String s4=s1; // ref copy

        System.out.println(s1==s2);
        System.out.println(s1==s3);  // == just check on stack and not the content 
        System.out.println(s1.equals(s2));  // eqals check first stack if stack return false then its check content
        System.out.println(s1.equals(s3));

    }
}
