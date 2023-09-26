import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("How much money do you owe?");
        double moneyowed = scan.nextDouble();
        System.out.println("How much money are you giving?");
        double change= scan.nextDouble();
        double moneyback = change - moneyowed;
        System.out.println("Here is your change: $" + moneyback);


    }
}
