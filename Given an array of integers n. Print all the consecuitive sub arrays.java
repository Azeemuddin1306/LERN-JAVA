//Given an array of integers n. Print all the consecuitive sub arrays
import java.util.Scanner;
class Arrays{
    static void PrintConsecuitiveSubArrays(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
        System.out.print(arr[arr.length-1]);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        PrintConsecuitiveSubArrays(arr);
    }
}