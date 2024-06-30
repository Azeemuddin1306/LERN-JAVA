//Given a array of size n, print all the sub arrays that has only equal number of ones and zeroes
import java.util.Scanner;
class Arrays {
    static void PrintAllSubArraysEqual(int[] ar) {
        for (int size = 2; size <= ar.length; size++) {
            for (int i = 0; i <= ar.length - size; i++) {
                int count_Zero = 0;
                int count_One = 0;
                for (int j = i; j < i + size; j++) {
                    if (ar[j] == 1) {
                        count_One++;
                    } else if (ar[j] == 0) {
                        count_Zero++;
                    }
                }
                if ((count_Zero+count_One==size) && count_One == count_Zero) {
                    for (int j = i; j < i + size; j++) {
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        PrintAllSubArraysEqual(ar);
    }
}
