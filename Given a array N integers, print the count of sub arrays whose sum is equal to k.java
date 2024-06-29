//Given a array N integers, print the count of sub arrays whose sum is equal to k
import java.util.Scanner;
class Arrays{
    static void PrintCountOfSubArrays(int[]ar,int k){
        int count=0;
        for(int size=1;size<=ar.length;size++){
            for(int i=0;i<=ar.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+ar[j];
                }
                if(sum==k){
                    count=count+1;
                }
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
        int k=scan.nextInt();
        PrintCountOfSubArrays(ar,k);
    }
}