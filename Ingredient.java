public class Ingredient {
    String name;
    double Quantity;
    String Ingredient_Of;

    Ingredient(String name, double quantity){
        this(name, quantity, name.split("_")[1]);
    }
    Ingredient(String name, double quantity, String ingredient_Of) {
        this.name = name;
        this.Quantity = quantity;
        this.Ingredient_Of = ingredient_Of;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public void setIngredient_Of(String ingredient_Of) {
        Ingredient_Of = ingredient_Of;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return Quantity;
    }

    public String getIngredient_Of() {
        return Ingredient_Of;
    }
}

