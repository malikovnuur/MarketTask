public class Products {
    private String name;
    private int price;
    private String production;

    public Products(String name, int price,String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {

        return  "\n* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ * "+"\n"+
                "name: " + name + " \n " +
                "price: " + price+"\n"+
                "Production: "+production+"\b"+
                " * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ * ";
    }
}

