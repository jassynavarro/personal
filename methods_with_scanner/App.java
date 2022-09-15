import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // // Method call
        // int quotient = Divider();
        // System.out.println("The quotient is: " + quotient);

        // // Method call
        // int product = multiply();
        // System.out.println("The product is: " + product);

        // Method call
        String crushName = revealMyCrush();
        System.out.println(crushName);

        // Close scanner
        scan.close();

    }

static int Divider() {
    System.out.println("Please enter two numbers to divide");
    System.out.print("Enter first number: ");
    int x = scan.nextInt();

    System.out.print("Enter second number: ");
    int y = scan.nextInt();
    return x / y;
}

static int multiply() {
    System.out.println("Please enter two numbers to multiply");
    System.out.print("Enter first number: ");
    int x = scan.nextInt();

    System.out.print("Enter second number: ");
    int y = scan.nextInt();
    return x * y;
}

static String revealMyCrush() {
    System.out.println("This will reveal the name of your crush");
    System.out.print("Enter your name: ");
    String myName = scan.nextLine();

    System.out.print("Enter the name of your crush: ");
    String nameOfMyCrush = scan.nextLine();

    System.out.print("Enter the name of your second crush: ");
    String nameOfMySecondCrush = scan.nextLine();

    return myName + " loves " + nameOfMyCrush + " and " + nameOfMySecondCrush;
}

}
