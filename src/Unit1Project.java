import java.util.Scanner;
public class Unit1Project {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tip Calculator");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Input
        //Collects the total
        System.out.println("Bill:");
        double bill = scan.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Collects the tip percentage
        System.out.println("Tip %:");
        int tippercentage = scan.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Collects the number of people
        System.out.println("Number of people");
        int numberofpeople = scan.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Output
        //Calculates total tip amount
        double tipamount =  bill*((double) tippercentage/100);
        System.out.println("Total tip amount:");
        System.out.printf("%.2f %n", tipamount);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculates the total bill including tip
        double totalbill = bill + tipamount;
        System.out.println("Total bill including tip:");
        System.out.printf("%.2f %n", totalbill);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculates tip per person
        double tipperperson = tipamount/numberofpeople;
        System.out.println("Tip per person:");
        System.out.printf("%.2f %n", tipperperson);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculates total per person
        double totalperperson = totalbill / numberofpeople;
        System.out.println("Total per person:");
        System.out.printf("%.2f %n", totalperperson);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
