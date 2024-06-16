//SWAPPING OF TWO NUMBERS WITHOUT A THIRD VARIABLE
import java.util.Scanner;
class swapping{
    public static void main(String[] args){
        int a=10,b=15;
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
