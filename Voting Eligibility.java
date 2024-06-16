import java.util.Scanner;
class VotingEligibility{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=scan.nextLine();
        System.out.println("Enter Age: ");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println(name+" is eligible for voting");
        }
        else
        {
            System.out.println(name+" is not eligible for voting");
        }
    }
        
}