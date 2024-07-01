//Given an array of integers N, move all zero elements of an array to end of the array and maintiain the order of the non-zero elements. Note: No extra space for an array should be taken
import java.util.Scanner;
class Arrays {
    static int[] MoveZeroesToEnd(int[] ar) {
        int size = ar.length;
        if (size == 0 || size == 1) {
            return ar;
        }
        int nz = 0;
        int i = 0;
        while (i < size) {
            if (ar[i] != 0) {
                int temp = ar[nz];
                ar[nz] = ar[i];
                ar[i] = temp;
                nz++;
            }
            i++;
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int[] res = MoveZeroesToEnd(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
