import java.util.Scanner;

public class subsetofarr {
    public static void inputarr(int[] arr) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void subset(int[] arr, int n) {
        int lim = (1 << n);
        for (int i = 0; i < lim; i++) {
            int dec = i;
            String str = "";
            for (int j = 0; j < arr.length; j++) {
                int rem = dec % 2;
                dec /= 2;
                if (rem == 0) {
                    str = "-\t" + str;
                } else {
                    str = (arr[arr.length - 1 - j]) + "\t" + str;
                }

            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputarr(arr);
        subset(arr, n);

    }
}
