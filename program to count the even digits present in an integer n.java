//Write a java program to print number of even digits present in an integer n
import java.util.Scanner;
class CountEvenDigits{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            if(dig%2==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}