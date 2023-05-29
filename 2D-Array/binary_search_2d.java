import java.util.Scanner;

public class binary_search_2d {
    public static void inputarr(int[][] arr) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two_d array Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void B_search_2d(int[][] arr, int key) {
        int i = 0;
        int j = arr[0].length-1;
        while (i < arr.length && j > 0) {
            if (arr[i][j] < key) {
                i++;
            } else if (arr[i][j] > key) {
                j--;
            } else {
                System.out.println("Key Found at => " + i + "," + j + " Position");
                return;
            }
        }
        System.out.println("Key Not Found");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Dimension of Array row and col");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][]arr=new int[n][m];
        inputarr(arr);
        System.out.println("Enter Key for Searching");
        int k= scn.nextInt();
        B_search_2d(arr, k);
    }
}
