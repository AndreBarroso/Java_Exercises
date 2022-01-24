package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter de name of products: ");
        int numberProduct = sc.nextInt();

        List<Product> listProducts = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i <= numberProduct; i ++) {
            System.out.println("Product #" + i + "data");
            System.out.print("Common, used or imported? (c/u/i)? ");
            String typeProduct = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if(typeProduct.equals("i")) {
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                listProducts.add(new ImportedProduct(name, price, customsFee));
                sc.nextLine();
            }
            else if(typeProduct.equals("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                listProducts.add(new UsedProduct(name, price, sdf.parse(date)));
            }
            else {
                listProducts.add(new Product(name, price));
            }

        }

        System.out.println("");
        System.out.println("PRICE TAGS");
        for(Product product: listProducts) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
