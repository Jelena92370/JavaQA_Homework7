package searchengine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchEngine {

    public static void main(String[] args) {

        List<Product> productList = createProductList();

        StringPredicate colorFilter = new StringPredicate("color", "White");
        List<Product> filteredByColor = filterProducts(productList, colorFilter);
        System.out.println("Filtered by Color:");
        printProducts(filteredByColor);


        StringPredicate sizeFilter = new StringPredicate("size", "L");
        List<Product> filteredBySize = filterProducts(productList, sizeFilter);
        System.out.println("Filtered by Size:");
        printProducts(filteredBySize);
    }

    static List<Product> createProductList() {
List<Product> productList = new ArrayList<>();

        Product jeans = new Product("Jeans");
        jeans.setType("Model");
        jeans.setColor("White");
        jeans.setFlavour("Strawberry");
        jeans.setSize("M");
        productList.add(jeans);

        Product skirt = new Product("Skirt");
        skirt.setType("Long");
        skirt.setColor("Red");
        skirt.setFlavour("Rose");
        skirt.setSize("S");
        productList.add(skirt);


        Product trousers = new Product("Trousers");
        trousers.setType("ForKids");
        trousers.setColor("Green");
        trousers.setFlavour("Apple");
        trousers.setSize("XS");
        productList.add(trousers);

        Product leggings = new Product("Leggings");
        leggings.setType("Winter");
        leggings.setColor("Black");
        leggings.setFlavour("Snow");
        leggings.setSize("L");
        productList.add(leggings);

        Product jacket = new Product("Jacket");
        jacket.setType("ForMen");
        jacket.setColor("Blue");
        jacket.setFlavour("Meat");
        jacket.setSize("L");
        productList.add(jacket);

        return productList;
    }

        static List<Product> filterProducts(List<Product> productList, Predicate<Product> predicate) {
            List<Product> filteredList = new ArrayList<>();
            for (Product product : productList) {
                if (predicate.test(product)) {
                    filteredList.add(product);
                }
            }
            return filteredList;
        }

        static void printProducts(List<Product> productList) {
            for (Product product : productList) {
                System.out.println("Product: " + product.getName());
                System.out.println("Type: " + product.getProperties().get("type"));
                System.out.println("Color: " + product.getProperties().get("color"));
                System.out.println("Size: " + product.getProperties().get("size"));
                System.out.println("Flavour: " + product.getProperties().get("flavour"));
                System.out.println();
            }
        }
    }
