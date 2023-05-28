public class merge2sortedarr {
    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                k++;
                i++;
            } else {
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (j < n) {
            ans[k] = nums2[j];
            k++;
            j++;
        }

        while (i < m) {
            ans[k] = nums1[i];
            k++;
            i++;
        }
        for(int x=0;x<ans.length;x++){
            nums1[x]=ans[x];
        }
        // display(nums1);
    }

    public static void main(String[] args) {
        int[]nums1={1,2,3,0,0,0};
        int[]nums2={2,5,6};
        merge(nums1, 3, nums2, 3);
    }
}
