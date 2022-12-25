package CollectionsPart3.ListOfProductsAndRecipes;

import CollectionsPart3.ValidateUtils;

import java.util.*;

public class Recipe {
    private final Map<Product, Integer> products = new HashMap<>();
    private final String recipeName;

    public Recipe(String recipeName) {
        this.recipeName = ValidateUtils.validateString(recipeName, "Default");
    }
        public double getTotalCostAllProducts() {
            double totalCostAllProducts = 0.0;
            for (Map.Entry<Product, Integer> product : product.entrySet()) {
                totalCostAllProducts += product.getKey().getPrice() * product.getValue();

            }
        return totalCostAllProducts;
        }
        public void checkProduct(String name) {
            boolean isBought = false;
            for (product.getKey().getName().equals(name); {
                System.out.println(name + " куплен");
                isBought = true;
                break;

    }
        if (!isBought) {
            System.out.println(name + " не куплен");
        }


    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            Integer productCount = this.products.get(product);
            this.products.put(product, ++productCount)
        } else {
            this.products.put(product, 1);
        }
    }
    public String getRecipeName() {
        return recipeName;
    }

    public void checkProduct(String бананы) {
    }

    public boolean getTotalCostAllProduct() {
    }
}
