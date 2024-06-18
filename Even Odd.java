//Take integer N, check if it even or odd
import java.util.Scanner;
class Even_Odd{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int N=scan.nextInt();
        if(N%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
}