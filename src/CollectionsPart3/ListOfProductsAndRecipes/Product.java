package CollectionsPart3.ListOfProductsAndRecipes;

import CollectionsPart3.ValidateUtils;

import java.util.Objects;

public class Product {
    private String name;
    private String price;
    private int weight;

    public Product(String name, double price, int weight) {
        this.name = ValidateUtils.validateString(name, "Default");
        this.price = ValidateUtils.validateString(name, 0.0);
        this.weight = ValidateUtils.validateString(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtils.validateString(name, "Default");
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = ValidateUtils.validateString(name, 0.0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = ValidateUtils.validateString(name, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && weight == product.weight && Objects.equals((name), product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Продукт: " + name + '\'' +
                ", Цена: " + price + " рублей" + '\'' +
                ", Вес: " + weight + " киллограмм" +
                '}';
    }
}
