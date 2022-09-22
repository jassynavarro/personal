// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Halleluia Mozzarella Pizza that costs 370.00 pesos");
        System.out.println("Enter B if you want a Buffalo Chicken Pizza that costs 355.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);
        String pizza = "";
        double price = 0;
        scan.nextLine();

        System.out.println("Enter H if you want it Hand tossed");
        System.out.println("Enter T if you want a Thin crust");
        System.out.print("Enter your type of crust: ");
        char chosenCrust = scan.next().charAt(0);
        String crust = "";
        scan.nextLine();

        
        System.out.println("Enter M if you want a Medium Size");
        System.out.println("Enter F if you want a Family Size");
        System.out.println("Enter B if you want a Big Family Size");
        System.out.print("Enter the size of your pizza: ");
        char size = scan.next().charAt(0);
        String Ofsize = "";
        scan.nextLine();

        System.out.print("Enter the quantity of your pizza: ");
        int number = scan.nextInt();

        switch (choice) {
            case 'A':
                pizza = "Halleluia Mozzarella Pizza";
                price = 370.00;
                break;
            case 'B':
                pizza = "Buffalo Chicken Pizza";
                price = 355.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        switch (chosenCrust) {
            case 'H':
                crust = "Hand tossed";
                break;
            case 'T':
                crust = "Thin crust";
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        switch (size) {
            case 'M':
                Ofsize = "Medium Size";
                break;
            case 'F':
                Ofsize = "Family Size";
                break;
            case 'B':
                Ofsize = "Big Family Size";
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        double product = number * price;

        System.out.println("Your order is: " + pizza);
        System.out.println("Price: " + price);
        System.out.println("Type of Crust: " + crust);
        System.out.println("Size: " + Ofsize);
        System.out.println("Quantity of your pizza: " + number);
        System.out.println("Total Amount: " + product);
     
        
        scan.close();
    }
}
