package Recursion;

public class fraction {
    public static void plusMinus(int[] arr) {
        // Write your code here
        double cp=0,cn=0,cz=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cz++;
            }else if(arr[i]>0){
                cp++;
            }else{
                cn++;
            }
        }
        
        double fcp=cp/arr.length;
        double fcn=cn/arr.length;
        double fcz=cz/arr.length;
        System.out.format("Double Number: %.6f \n", fcp); 
        System.out.format("Double Number: %.6f \n", fcn); 
        System.out.format("Double Number: %.6f \n", fcz); 
    
    }
    
    
    public static void main(String[]args){
        int []arr={1,1,0,-1,-1};
        plusMinus(arr);

    }
}
