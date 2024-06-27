//Given two arrays, merge those arrays such that the resultant array is sorted
import java.util.Scanner;

class Arrays_Mrng_Session {
    static int[] MergedSortedArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[arr1.length + arr2.length];
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = scan.nextInt();
        }
        int[] res = MergedSortedArray(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
