//Take a integer N and print Yes if last digit is 7 and No in every other case
import java.util.Scanner;
class Last_Digit_Is_7{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int N=scan.nextInt();
        if((N+3)%10==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}


//Using Ternary operator
//Take a integer N and print Yes if last digit is 7 and No in every other case
import java.util.Scanner;
class Last_Digit_Is_7{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int N=scan.nextInt();
        String result=((N+3)%10)==0 ? "Yes":"No";
        System.out.print(result);
    }
}