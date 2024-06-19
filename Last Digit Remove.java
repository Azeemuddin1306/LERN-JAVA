//Take a integer N and remove last digit from it
import java.util.Scanner;
class Last_Digit_Remove{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int N=scan.nextInt();
        System.out.print(N/10);
    }
}
