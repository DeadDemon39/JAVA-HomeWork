import java.util.ArrayList;
import java.util.List;

import HomeWork1.Product;
import HomeWork1.VendingMashine;

public class Task {
    public static void main(String[] args) {
        
        Product chokolate1 = new Product("Alpen Gold", 0.300, 2000);

        Product chokolate2 = new Product("Каркунов", 0.150, 1650);

        Product chokolate3 = new Product("Milka", 0.600, 3500);

       // System.out.println(chokolate1.displayInfo());


        List<Product> products = new ArrayList<>();
        products.add(chokolate1);
        products.add(chokolate2);
        products.add(chokolate3);


        VendingMashine vendingMashine = new VendingMashine(products);

        Product productResult = vendingMashine.getChokolateCalories(3000);
        if (productResult != null) {
            System.out.println("Вы купили:");
            System.out.println(productResult.displayInfo());
        } else {
            System.out.println("Данный товар отсутствует!");
        }
    }
    
}
