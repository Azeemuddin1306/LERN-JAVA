//Given array of size n, print all subarrays of array
import java.util.Scanner;
class Arrays{
    static void PrintSubArrays(int[]ar){
        for(int size=1;size<=ar.length;size++){
            for(int i=0;i<=ar.length-size;i++){
                for(int j=i;j<i+size;j++){
                    System.out.print(ar[j]+" ");
                }
            System.out.println();
            }
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        PrintSubArrays(ar);
    }
}
