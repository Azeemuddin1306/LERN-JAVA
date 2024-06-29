//Given array of size n, and integer value k, print the count of subarrays whose sum is equal to k
import java.util.Scanner;
class Arrays{
    static void SubArraysCount(int[]ar,int size,int k){
        int count=0;
        for(int i=0;i<ar.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum=sum+ar[j];
            }
            if(sum==k){
                count=count+1;
            }
        }
        System.out.println(count);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int[]ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int size=scan.nextInt();
        int k=scan.nextInt();
        SubArraysCount(ar,size,k);
    }
}