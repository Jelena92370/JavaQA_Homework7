package searchengine;

import java.util.List;
import java.util.Scanner;

public interface FilterApp {

    static void main(String[] args) {
        List<Product> productList = SearchEngine.createProductList();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter filter criteria:");
        System.out.print("Color: ");
        String colorFilterValue = scanner.nextLine().trim().toLowerCase();

        System.out.print("Size: ");
        String sizeFilterValue = scanner.nextLine().trim().toLowerCase();


        StringPredicate colorFilter = new StringPredicate("color", colorFilterValue);
        StringPredicate sizeFilter = new StringPredicate("size", sizeFilterValue);


        List<Product> filteredProducts = SearchEngine.filterProducts(productList, colorFilter.and(sizeFilter));


        System.out.println("Filtered Products:");
        SearchEngine.printProducts(filteredProducts);

        scanner.close();
    }
}


