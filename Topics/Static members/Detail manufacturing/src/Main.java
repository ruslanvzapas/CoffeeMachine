import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    static int numberOfRequestedProducts = 0;

    

    public static String requestProduct(String product) {
        // write your code here

        numberOfRequestedProducts++;

        String str = numberOfRequestedProducts + ". Requested " + product;
        return str;
        
    }

    public static int getNumberOfProducts() {
        // write your code here
        return numberOfRequestedProducts;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}
