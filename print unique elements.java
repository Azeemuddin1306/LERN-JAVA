//java program to print the elements present in array without repeat
import java.util.Scanner;
class Arrays{
    static void PrintWithoutRepetition(int[]arr){
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==arr[i+1]){
             }
             else{
                 System.out.print(arr[i]+" ");
             }
        }
        System.out.print(arr[arr.length-1]+" ");
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        PrintWithoutRepetition(arr);
    }
}