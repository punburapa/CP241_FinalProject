public class Stock {
    String name;
    double Quantity;

    Stock(String name, double quantity) {
        this.name = name;
        this.Quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }
    public void addQuantity(double quantity) {
        Quantity += quantity;
    }
    public void removeQuantity(double quantity) {
        Quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return Quantity;
    }
}
