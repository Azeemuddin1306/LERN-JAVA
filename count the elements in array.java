//java program to print the count of elements present in array of integers
import java.util.Scanner;
class Arrays{
    static void PrintOccurence(int[]arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==arr[i+1]){
                 count++;
             }
             else{
                 System.out.println(arr[i]+" - "+count);
                 count=1;
             }
        }
        System.out.println(arr[arr.length-1]+" - "+count);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        PrintOccurence(arr);
    }
}