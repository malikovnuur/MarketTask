import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Products> products = new ArrayList<>();
    public static void main (String[]args) {


        List<Products> products1 = new ArrayList<>(Arrays.asList(
                new Products("Meat", 600, "kyrgyzstan"),
                new Products("Milk", 60, "kyrgyzstan"),
                new Products("Bread", 25, "kyrgyzstan"),
                new Products("Pasta", 120, "kyrgyzstan"),
                new Products("Apple", 50, "kyrgyzstan"),
                new Products("Banana", 40, "Africa"),
                new Products("Cherry", 60, "kyrgyzstan"),
                new Products("Peach", 70, "kyrgyzstan"),
                new Products("Apricot", 100, "kyrgyzstan"),
                new Products("Watermelon", 300, "kyrgyzstan"),
                new Products("Sausage", 250, "kyrgyzstan"),
                new Products("Egg", 10, "kyrgyzstan"),
                new Products("Fish", 560, "kyrgyzstan"),
                new Products("Cheese", 180, "kyrgyzstan"),
                new Products("Potato", 40, "kyrgyzstan")
        ));


        List<Customer> customerList = new ArrayList<>(Arrays.asList(
                new Customer("Baktybek", "Globus", 2000)
        ));

        Market market1 = new Market();

        List<Market> market = new ArrayList<>(Arrays.asList(
                new Market("Globus", 1000000),
                new Market("Frunze", 500000),
                new Market("Narodnyi", 300000),
                new Market("Walmart", 50000)
        ));


        while (true) {
            commands();


            System.out.print("Command: ");
            int input = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println("|~~~~~~~~~~~~~~~~~ * GLOBUS * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTS _                 ");


                    market1.ToBuy(products1);

                    break;
                case 2:
                    System.out.println("|~~~~~~~~~~~~~~~~~ * Frunze * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTS _                 ");
                    market1.ToBuy(products1);

                case 3:
                    System.out.println("|~~~~~~~~~~~~~~~~~ * Narodnyi * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTS _                 ");
                    market1.ToBuy(products1);

                default:
                    System.out.println("|~~~~~~~~~~~~~~~~~ * Walmart * ~~~~~~~~~~~~~~~~|");
                    System.out.println("                  _ PRODUCTS _                 ");
                    market1.ToBuy(products1);
                    break;
            }
        }
    }

        public static  void commands() {
            System.out.println("""
                1. Globus 
                2. Frunze
                3. Narodnyi
                4. Walmart
                """);
        }
}