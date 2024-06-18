//Take a number N from the user and print Fizz if it is divisible by 3, Buzz if it divisible by 5, FizzBuzz if it is divisible by both. else return number
import java.util.Scanner;
class Fizz_Buzz{
        public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int num=scan.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("Fizz Buzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
    }
}