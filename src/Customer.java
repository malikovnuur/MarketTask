public class Customer {
    private String name;
    private String cardMarket;
    private int BankAccount;

    public Customer(String name, String cardMarket, int bankAccount) {
        this.name = name;
        this.cardMarket = cardMarket;
        BankAccount = bankAccount;
    }
    public Customer(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardMarket() {
        return cardMarket;
    }

    public void setCardMarket(String cardMarket) {
        this.cardMarket = cardMarket;
    }

    public int getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cardMarket='" + cardMarket + '\'' +
                ", BankAccount=" + BankAccount +
                '}';
    }
}
