import service.OrderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String menu = menu();
        System.out.println(menu);
        int menuNumber = 0;
        while (menuNumber >= 0) {
            // Reading data using readLine
            System.out.println("Enter number");
            String number = reader.readLine();
            menuNumber = Integer.parseInt(number);

            // use switch for choosing method
            switch (menuNumber) {
                case 1 -> createAnOrder();
                case 2 -> companyUserCRUD();
                case 3 -> priceCRUD();
                case 4 -> productCRUD();
                case -1 -> System.out.println("we exit from menu");
                default -> System.out.println("wrong number");
            }
        }
    }


    private static String menu() {
        return "Menu (Choose number):" + "\n" +
                "1. Create an order" + "\n" +
                "2. Company/User CRUD" + "\n" +
                "3. Price CRUD" + "\n" +
                "4. Product CRUD" + "\n" +
                "-1. Exit";
    }

    private static void createAnOrder() {
        OrderService orderService = new OrderService();
        orderService.handle();
    }

    private static void companyUserCRUD() {
        System.out.println("companyUserCRUD");
    }

    private static void priceCRUD() {
        System.out.println("priceCRUD");
    }

    private static void productCRUD() {
        System.out.println("productCRUD");
    }
}