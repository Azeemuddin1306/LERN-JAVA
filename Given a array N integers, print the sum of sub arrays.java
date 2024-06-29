//Given a array N integers, print the sum of sub arrays
import java.util.Scanner;
class Arrays{
    static void PrintSubArrays(int[]ar){
        for(int size=1;size<=ar.length;size++){
            for(int i=0;i<=ar.length-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+ar[j];
                }
                System.out.println(sum);
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