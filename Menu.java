public class Menu {
    String Name;
    double Price;
    Ingredient[] Ingredients;

    Menu(String name, double price, Ingredient[] ingredients) {
        this.Name = name;
        this.Price = price;
        this.Ingredients = ingredients;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setIngredients(Ingredient[] ingredients) {
        Ingredients = ingredients;
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

    public Ingredient[] getIngredients() {
        return Ingredients;
    }
}
