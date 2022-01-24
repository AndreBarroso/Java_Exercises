package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String stringBirthDate = sc.nextLine();
        Date birthDate = sdf.parse(stringBirthDate);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String stringStatus = sc.nextLine();
        OrderStatus status = OrderStatus.valueOf(stringStatus);
        System.out.print("How many items to this order? ");
        Double numberOfItems = sc.nextDouble();

        Client client = new Client(clientName, email, sdf.parse(stringBirthDate));
        Order order = new Order(new Date(), client);
        for(int i = 0; i < numberOfItems; i ++){
            sc.nextLine();
            int itemNumber = i + 1;
            System.out.println("Enter #" + itemNumber + " data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity, new Product(productName, price)));
        }

        System.out.println("ORDER SUMMARY ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + status);

        // Colocar aqui a linha do Cliente


        System.out.println("Order item: ");
        for(OrderItem item: order.getItem()) {
            System.out.print(item.getProduct().getName() + ", " +
                    item.getProduct().getPrice()
                    + ", Quantity: " + item.getQuantity() + ", Subtotal: " + item.subTotal());
        }




        sc.close();
    }
}
