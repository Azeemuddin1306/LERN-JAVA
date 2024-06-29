//Given array of integers n, return the longest subarray whose sum is equal to k
import java.util.Scanner;
class Arrays{
    static void LongestSubArray(int[] ar, int k){
        for(int size=ar.length;size>=1;size--){
            for(int i=0;i<ar.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+ar[j];
                }
                if(sum==k){
                    for(int j=i;j<i+size;j++){
                        System.out.print(ar[j]+" ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int k=scan.nextInt();
        LongestSubArray(ar,k);
    }
}