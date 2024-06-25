//given a sorted array of size n and print the largest repeating number in the array
import java.util.Scanner;
class Arrays{
    static int LargestRepeatingElement(int[]arr){
        for(int i=(arr.length)-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int res=LargestRepeatingElement(arr);
        System.out.println(res);
    }
}