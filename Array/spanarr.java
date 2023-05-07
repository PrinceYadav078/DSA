// span =maxelement- minelement

import java.util.Scanner;

public class spanarr {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        // array input
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int res=spanarray(arr);
        System.out.println(res);
    }

    public static int spanarray(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;
        return span;
    }
}

// input=>15 30 40 4 11 9     output=>36