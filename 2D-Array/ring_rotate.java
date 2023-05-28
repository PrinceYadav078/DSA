import java.util.Scanner;

public class ring_rotate {

    public static void inputarr(int[][] arr) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two_d array Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int[] fill_1darr(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int idx = 0;
        int sz = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;
        int one_d[] = new int[sz];

        for (int i = minr, j = minc; i <= maxr; i++) {
            one_d[idx] = arr[i][j];
            idx++;
        }
        minc++;
        for (int i = maxr, j = minc; j <= maxc; j++) {
            one_d[idx] = arr[i][j];
            idx++;
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            one_d[idx] = arr[i][j];
            idx++;
        }
        maxc--;
        for (int i = minr, j = maxc; j >= minc; j--) {
            one_d[idx] = arr[i][j];
            idx++;
        }
        minr++;
        return one_d;
    }

    public static void  rotate(int[] one_d, int r) {
        r = r % one_d.length;
        if (r < 0) {
            r += one_d.length;
        }
        rev_1d_arr(one_d, 0, one_d.length - r - 1);
        rev_1d_arr(one_d, one_d.length - r, one_d.length - 1);
        rev_1d_arr(one_d, 0, one_d.length - 1);
        
    }

    public static void rev_1d_arr(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[end];
            arr[end] = arr[st];
            arr[st] = temp;
            st++;
            end--;
        }
    }

    public static int[][] fill_2darr(int[] one_d, int[][] two_d, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = two_d.length - s;
        int maxc = two_d[0].length - s;
        int idx = 0;

        for (int i = minr, j = minc; i <= maxr; i++) {
            two_d[i][j] = one_d[idx];
            idx++;
        }
        minc++;
        for (int i = maxr, j = minc; j <= maxc; j++) {
            two_d[i][j] = one_d[idx];
            idx++;
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            two_d[i][j] = one_d[idx];
            idx++;
        }
        maxc--;
        for (int i = minr, j = maxc; j >= minc; j--) {
            two_d[i][j] = one_d[idx];
            idx++;
        }
        minr++;

        return two_d;
    }

    public static int[][] ringRotate(int[][] two_d, int s, int r) {
        int[] one_d = fill_1darr(two_d, s);
        System.out.println("oned filled");
        rotate(one_d, r);
        System.out.println("oned rotated");
        int ans[][] = fill_2darr(one_d, two_d, s);
        System.out.println("twod filled");

        return ans;

    }

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter dimension of array row and col");
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]two_d=new int[n][m];
        inputarr(two_d);
        System.out.println("Enter Shell number s or Ring number");
        int s=scn.nextInt();
        System.out.println("Enter Rotate number r");
        int r=scn.nextInt();
        int[][]res= ringRotate(two_d, s, r);
        System.out.println("*****************************************");
        display(res);
    }
}
