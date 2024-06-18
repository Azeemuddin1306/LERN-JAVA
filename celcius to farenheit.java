//Celcius to Farenheit Converter
import java.util.Scanner;
class Cles_To_Far{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter temperature in Celcius: ");
        int c=scan.nextInt();
        float f=(c*9.0f/5)+32;
        System.out.println("The converted temperature is: "+f+"f");
    }
}