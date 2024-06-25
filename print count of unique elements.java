//java program to print the count of unique elements present in array of integers
import java.util.Scanner;
class Arrays{
    static void CountUniqueElements(int[]arr){
        int count=1;
        int unique_count=0;
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==arr[i+1]){
                 count++;
             }
             else{
                 if(count==1){
                     unique_count++;
                 }
                 count=1;
             }
        }
        if (count==1){
            unique_count++;
        }
        System.out.println(unique_count);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        CountUniqueElements(arr);
    }
}
