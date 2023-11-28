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

        // Add Stock inventory
        Stock s1 = new Stock("Garlic", 100.0);
        Stock s2 = new Stock("Rice", 5000.0);
        Stock s3 = new Stock("Green-Cap Sauce", 500.0);
        Stock s4 = new Stock("Oyster Sauce", 500.0);
        Stock s5 = new Stock("Black Soy Sauce", 500.0);
        Stock s6 = new Stock("Soy Sauce", 500.0);
        Stock s7 = new Stock("Spring Onion", 300.0);
        Stock s8 = new Stock("Sugar", 1000.0);
        Stock s9 = new Stock("Fish Sauce", 500.0);
        Stock s10 = new Stock("Chilli", 100.0);
        Stock s11 = new Stock("Dried Chilli", 50.0);
        Stock s12 = new Stock("Pepper", 75.0);
        Stock s13 = new Stock("Butter", 250.0);
        Stock s14 = new Stock("Crab", 350.0);
        Stock s15 = new Stock("Meat", 1000.0);
        Stock s16 = new Stock("Pork", 1000.0);
        Stock s17 = new Stock("Egg", 36.0);
        Stock s18 = new Stock("Holy Basil", 350.0);
        Stock s19 = new Stock("Oil", 350.0);
        stock.add(s1);
        stock.add(s2);
        stock.add(s3);
        stock.add(s4);
        stock.add(s5);
        stock.add(s6);
        stock.add(s7);
        stock.add(s8);
        stock.add(s9);
        stock.add(s10);
        stock.add(s11);
        stock.add(s12);
        stock.add(s13);
        stock.add(s14);
        stock.add(s15);
        stock.add(s16);
        stock.add(s17);
        stock.add(s18);
        stock.add(s19);


        //Add Ingredient
        Ingredient i101 = new Ingredient("fired-Egg_Rice", 200, "Rice");
        Ingredient i102 = new Ingredient("fried-Egg_Oil", 100, "Oil");
        Ingredient i103 = new Ingredient("fired-Egg_Egg", 2, "Egg");
        Ingredient i104 = new Ingredient("fired-Egg_Pepper", 2.5, "Pepper");
        Ingredient i105 = new Ingredient("fired-Egg_Fish Sauce", 7.5, "Fish Sauce");

        Ingredient i201 = new Ingredient("Kra-pao_Rice", 200);
        Ingredient i202 = new Ingredient("Kra-pao_Pork", 400);
        Ingredient i203 = new Ingredient("Kra-pao_Oil", 40);
        Ingredient i204 = new Ingredient("Kra-pao_Holy Basil", 50);
        Ingredient i205 = new Ingredient("Kra-pao_Garlic", 40);
        Ingredient i206 = new Ingredient("Kra-pao_Chilli", 40);
        Ingredient i207 = new Ingredient("Kra-pao_Fish Sauce", 20);
        Ingredient i208 = new Ingredient("Kra-pao_Green-Cap Sauce", 67.5);
        Ingredient i209 = new Ingredient("Kra-pao_Oyster Sauce", 135);
        Ingredient i210 = new Ingredient("Kra-pao_Black Soy Sauce", 22.5);
        Ingredient i211 = new Ingredient("Kra-pao_Sugar", 22.5);

        Ingredient i301 = new Ingredient("Kra-pao-Meat_Rice", 200);
        Ingredient i302 = new Ingredient("Kra-pao-Meat_Meat", 250);
        Ingredient i303 = new Ingredient("Kra-pao-Meat_Oil", 40);
        Ingredient i304 = new Ingredient("Kra-pao-Meat_Chilli", 40);
        Ingredient i305 = new Ingredient("Kra-pao-Meat_Garlic", 30);
        Ingredient i306 = new Ingredient("Kra-pao-Meat_Holy Basil", 15);
        Ingredient i307 = new Ingredient("Kra-pao-Meat_Oyster Sauce", 22.5);
        Ingredient i308 = new Ingredient("Kra-pao-Meat_Fish Sauce", 10);
        Ingredient i309 = new Ingredient("Kra-pao-Meat_Sugar", 2.5);
        Ingredient i310 = new Ingredient("Kra-pao-Meat_Pepper", 2.5);

        Ingredient i401 = new Ingredient("Crab-Fried-rice_Rice", 200);
        Ingredient i402 = new Ingredient("Crab-Fried-rice_Crab", 200);
        Ingredient i403 = new Ingredient("Crab-Fried-rice_Egg", 200);
        Ingredient i404 = new Ingredient("Crab-Fried-rice_Garlic", 200);
        Ingredient i405 = new Ingredient("Crab-Fried-rice_Spring Onion", 200);
        Ingredient i406 = new Ingredient("Crab-Fried-rice_Butter", 200);
        Ingredient i407 = new Ingredient("Crab-Fried-rice_Soy Sauce", 200);
        Ingredient i408 = new Ingredient("Crab-Fried-rice_Pepper", 200);

        ingredient.add(i101);
        ingredient.add(i102);
        ingredient.add(i103);
        ingredient.add(i104);
        ingredient.add(i105);

        ingredient.add(i201);
        ingredient.add(i202);
        ingredient.add(i203);
        ingredient.add(i204);
        ingredient.add(i205);
        ingredient.add(i206);
        ingredient.add(i207);
        ingredient.add(i208);
        ingredient.add(i209);
        ingredient.add(i210);
        ingredient.add(i211);

        ingredient.add(i301);
        ingredient.add(i302);
        ingredient.add(i303);
        ingredient.add(i304);
        ingredient.add(i305);
        ingredient.add(i306);
        ingredient.add(i307);
        ingredient.add(i308);
        ingredient.add(i309);
        ingredient.add(i310);

        ingredient.add(i401);
        ingredient.add(i402);
        ingredient.add(i403);
        ingredient.add(i404);
        ingredient.add(i405);
        ingredient.add(i406);
        ingredient.add(i407);
        ingredient.add(i408);



        //add Menu
        Ingredient[] Fried_egg = {i101, i102, i103, i104, i105};
        Ingredient[] Krapao = {i201, i202, i203, i204, i205, i206, i207, i208, i209, i210, i211};
        Ingredient[] Krapao_meat = {i301, i302, i303, i304, i305, i306, i307, i308, i309, i310};
        Ingredient[] Carb_Fried_rice = {i401, i402, i403, i404, i405, i406, i407, i408};
        Menu menu1 = new Menu("Fired Egg", 45, Fried_egg);
        Menu menu2 = new Menu("Krapao Pork", 50, Krapao);
        Menu menu3 = new Menu("Krapao Meat", 65, Krapao_meat);
        Menu menu4 = new Menu("Crab Fried Rice", 60, Carb_Fried_rice);

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
    }
}
