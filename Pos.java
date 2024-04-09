import javax.swing.*;

public class Pos extends JFrame {
    static ListADT bill,menu,ingredient,stock;

    public static void main(String[] args) throws Exception {
        bill = new ArrayList();
        menu = new ArrayList();
        ingredient = new ArrayList();
        stock = new ArrayList();

        // insert Mock data
        insertData();
        HomePage homePage = new HomePage();

    }

    public static void insertData() throws Exception {

        Menu menu1 = new Menu("Fired Egg", 45);
        Menu menu2 = new Menu("Krapao Pork", 50);
        Menu menu3 = new Menu("Krapao Meat", 65);
        Menu menu4 = new Menu("Crab Fried Rice", 60);

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
    }
}
