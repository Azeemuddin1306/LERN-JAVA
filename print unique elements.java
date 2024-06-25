//java program to print the unique elements present in array of integers
import java.util.Scanner;
class Arrays{
    static void PrintUniqueElements(int[]arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==arr[i+1]){
                 count++;
             }
             else{
                 if(count==1){
                     System.out.print(arr[i]+" ");
                 }
                 count=1;
             }
        }
        if (count==1){
            System.out.println(arr[arr.length-1]);
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        PrintUniqueElements(arr);
    }
}
