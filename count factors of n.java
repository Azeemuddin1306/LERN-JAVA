//print the count of number of factors of a given number
import java.util.Scanner;
class CountFactors{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        System.out.println("The factors are: "+count);
    }
}