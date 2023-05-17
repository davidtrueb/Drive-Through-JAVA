import java.util.Scanner;
import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {

        System.out.print("WELCOME TO YOUR PERSONAL ASSISTANT AT MCDONALDS DRIVE THROUGH\n");
        System.out.println("--------------------------------------------------------------");
        System.out.print("What would you like to order?\n");
        System.out.println("------------------------------");
        System.out.println("OUR CURRENT WEEKLY OFFERS ARE:\n" +

                "SELECT NR 1 >> Big Mac Meal with fries and Coca Cola - 17.99$\n" +
                "SELECT NR 2 >> Cheeseburger with a larg Coca Cola - 12.99$\n" +
                "SELECT NR 3 >> Special King Flury with an apple pie - 7.99$\n" +
                "SELECT NR 4 >> To get to the regualr menu items...\n" +
                "---------------------------------------------------------------");
        // SPECIAL OFFER
        Scanner scanner = new Scanner(System.in);
        int user_selection = Integer.parseInt(scanner.nextLine());

        if (user_selection == 1) {
            System.out.println("SELECTED NR 1 - CURRENT VALUE 17.99 $");
            BigDecimal deal_01 = new BigDecimal("17.99");
        } else if (user_selection == 2) {
            System.out.println("SELECTED NR 2 - CURRENT VALUE 12.99 $");
            BigDecimal deal_00 = new BigDecimal("12.99");
        } else if (user_selection == 3) {
            System.out.println("SELECTED NR 3 - CURRENT VALUE 7.99 $");
        }


        // OTHER OFFERS



        BigDecimal price = new BigDecimal("19.99");
        BigDecimal taxRate = new BigDecimal("0.07");
        BigDecimal totalPrice = price.add(price.multiply(taxRate));

        System.out.println("Total: $" + totalPrice);


    }
}