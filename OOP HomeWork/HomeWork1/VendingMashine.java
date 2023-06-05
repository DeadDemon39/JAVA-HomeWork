package HomeWork1;

import java.util.List;

public class VendingMashine {

    private List<Product> products;

    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public Product getChokolateCalories(double calories) {
        for(Product product : products) {
            if (product instanceof Product) {
                if (((Product)product).getCalories() == calories) {
                    return (Product)product;
                }
            }
        }
        return null;
    }
    
}
