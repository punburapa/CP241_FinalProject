public class Menu {
    String Name;
    double Price;


    Menu(String name, double price) {
        this.Name = name;
        this.Price = price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }
}
