//Write a java program to check whether a given integer ends with 0
import java.util.Scanner;
class Program1{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n%10==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}