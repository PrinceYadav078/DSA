import java.util.Scanner;;
public class exitpoint {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Array Elements which consist only 0 and 1");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }
    public static void expoint(int[][]arr){
        // dir 0 for east 1 for south 2 west 3 for north
        int i=0,j=0,dir=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){
                j++;
                if(j==arr[0].length){  // east wall
                    j--;
                    break;
                }
            }else if(dir==1){
                i++;
                if(i==arr.length){ // south wall
                    i--;
                    break;
                }
            }else if(dir==2){
                j--;
                if(j==-1){ //west wall
                    j++;
                    break;
                }
            }else{
                i--;
                if(i==-1){ //north wall
                    i++;
                    break;
                }
            }
        }
        System.out.print("Exit Point is=> "+i+","+j);
    }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enetr size of array row and col");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int arr[][]=new int[n][m];
        inputarr(arr);
        expoint(arr);
    }
}
