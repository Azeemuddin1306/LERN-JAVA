//Given an array of integers, print all sub arrays of array in reverse manner
import java.util.Scanner;
class Arrays{
    static void SubArraysOfSizeK(int[]ar,int size){
        for(int i=0;i<=ar.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }  
    }
    static void PrintAllSubArrays(int[]ar){
        for(int size=ar.length;size>=1;size--){
            SubArraysOfSizeK(ar,size);
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        PrintAllSubArrays(ar);
    }
}