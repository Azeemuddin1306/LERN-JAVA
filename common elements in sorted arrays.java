//Given 2 sorted arrays, print the elements which are common in both
import java.util.Scanner;
class Arrays {
    static void printCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
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

        printCommonElements(arr1, arr2);
    }
}
