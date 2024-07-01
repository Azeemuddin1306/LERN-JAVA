//Given an array of integers n. Print all the Longest consecuitive sub array
import java.util.Scanner;
class Arrays{
    static void PrintLongestConsecuitiveSubArrays(int[]arr){
        int count=1;
        int si=0,ei=0,max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    ei=i;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
            ei=arr.length-1;
        }
        si=ei-max+1;
        for(int i=si; i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        PrintLongestConsecuitiveSubArrays(arr);
    }
}