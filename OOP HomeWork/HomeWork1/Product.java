package HomeWork1;

public class Product {

    String name;
    double weight;
    double calories;
    
    
    
    public Product() {
    }


    public Product(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getCalories() {
        return calories;
    }


    public void setCalories(double calories) {
        this.calories = calories;
    }

     public String displayInfo () {
        return String.format("%s - %s - %f", name, weight, calories);
    }

    

    
    
}
