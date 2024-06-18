//Take integer N, print Yes if the last digit is 0, No in every other case
import java.util.Scanner;
class Last_digit{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter: ");
        int N=scan.nextInt();
        if(N%10==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}