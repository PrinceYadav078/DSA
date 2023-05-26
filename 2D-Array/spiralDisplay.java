import java.util.Scanner;
public class spiralDisplay {
    public static void inputarr(int[][]arr){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }
   
   public static void spi_disp(int[][]arr,int n,int m){
    int minr=0;
    int maxr=arr.length-1;
    int minc=0;
    int maxc=arr[0].length-1;
    int total=n*m , count=1;

    while(count<=total){
        for(int i=minr;i<=maxr&&count<=total;i++){
            System.out.print(arr[i][minc]+"=>");
            count++;
        }
        minc++;
        for(int j=minc;j<=maxc&&count<=total;j++){
            System.out.print(arr[maxr][j]+"=>");
            count++;
        }
        maxr--;
        for(int i=maxr;i>=minr&&count<=total;i--){
            System.out.print(arr[i][maxc]+"=>");
            count++;
        }
        maxc--;
        for(int j=maxc;j>=minc&&count<=total;j--){
            System.out.print(arr[minr][j]+"=>");
            count++;
        }
        minr++;
    }
   }
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the Dimension of array row and col");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        inputarr(arr);
        spi_disp(arr, n, m);
    }
}
