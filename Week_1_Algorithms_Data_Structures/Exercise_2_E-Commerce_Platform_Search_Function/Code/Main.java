public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone 15", "Mobile"),
            new Product(102, "Galaxy S23", "Mobile"),
            new Product(103, "Dell XPS", "Laptop"),
            new Product(104, "AirPods Pro", "Accessories")
        };

        // Linear Search
        Product result1 = SearchFunctions.linearSearch(products, "Dell XPS");
        System.out.println(result1 != null ? "Found: " + result1.productName : "Not Found");

        // Binary Search
        SearchFunctions.sortProducts(products); // Must sort before binary search
        Product result2 = SearchFunctions.binarySearch(products, "Dell XPS");
        System.out.println(result2 != null ? "Found: " + result2.productName : "Not Found");
    }
}
