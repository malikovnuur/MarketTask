import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market  implements ServiceMarket {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner getScanner = new Scanner(System.in);
    private static List<Products> products = new ArrayList<>();
    private String name;
    private int BankAccount;


    public Market(String name, int bankAccount) {
        this.name = name;
        BankAccount = bankAccount;
    }
    public Market(){

    }



    public static List<Products> getProducts() {
        return products;
    }

    public static void setProducts(List<Products> products) {
        Market.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
    }

    @Override
    public void ToBuy(List<Products> productsList) {
        System.out.println("Write product name: ");
        String productName = scanner.nextLine();
        for (Products products1 :productsList) {
            if(productName.trim().equalsIgnoreCase(products1.getName())){
                products.add(products1);
            }else {
                int i = 0;
                for (Products products2 : products) {

                    int summa = i+=  products2.getPrice();
                    System.out.println("What is Your name? ");
                    String personName = getScanner.nextLine();
                    System.out.println("Market name: ");
                    String marketName = getScanner.nextLine();
                    System.out.println("~~~~~ * bill * ~~~~~~~~");
                    System.out.println("name: " + personName);
                    System.out.println("Market name: " + marketName);
                    System.out.println("product name: " +products2.getName()+" , ");
                    System.out.println("product price: "+summa);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Thank you!");
                    break;
                }
                break;
            }
        }

    }


    @Override
    public void check(List<Customer> customerList) {

    }

}

