//Given array of size n, print all subarrays of size k
import java.util.Scanner;
class Arrays{
    static void SubArrays(int[]ar,int size){
        for(int i=0;i<=ar.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
    static void PrintSubArrays(int[]ar){
        for(int size=0;size<=ar.length;size++){
            SubArrays(ar,size);
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        //int size=scan.nextInt();
        PrintSubArrays(ar);
    }
}
