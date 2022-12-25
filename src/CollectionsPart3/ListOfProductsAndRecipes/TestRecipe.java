package CollectionsPart3.ListOfProductsAndRecipes;

public class TestRecipe {
    public static void main(String[] args {
        Product bananas = new Product("Бананы", 150.0, 2);
        Product carrot = new Product("Морковь", 200.0, 3);
        Product cabbage = new Product("Капуста", 50, 6);
        System.out.println();
        Recipe recipel = new Recipe("Рецепт 1");
        recipel.addProductToList(bananas);
        recipel.addProductToList(bananas);
        recipel.addProductToList(cabbage);
        recipel.checkProduct("Бананы");
        recipel.checkProduct("Вишня");

        System.out.println(recipel.getTotalCostAllProduct());
    }
}
