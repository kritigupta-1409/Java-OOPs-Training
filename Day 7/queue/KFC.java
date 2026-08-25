package queue;

import java.util.Scanner;

public class KFC {

    public static void main(String[] args) {

        OrderService service = new OrderService();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n-- KFC ORDER MENU --\n");
            System.out.println("1. Place Order");
            System.out.println("2. Remove Order");
            System.out.println("3. Next Order");
            System.out.println("4. Show All Orders");
            System.out.println("5. Exit");
            System.out.println("\n-------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Order ID: ");
                int orderId = sc.nextInt();

                System.out.print("Enter Mobile Number: ");
                long mobileNo = sc.nextLong();

                sc.nextLine();

                System.out.print("Enter Order: ");
                String orders = sc.nextLine();

                Order newOrder = new Order(orderId, mobileNo, orders);

                service.placeOrder(newOrder);

                System.out.println("Order Placed Successfully");

                break;

            case 2:
                service.removeOrder();
                break;

            case 3:

                Order next = service.getNextOrder();
                if (next == null) {
                    System.out.println("No orders available");
                } else {
                    System.out.println("Next Order: " + next);
                }

                break;

            case 4:

                service.showAllOrders();
                break;

            case 5:

                System.out.println("Thank you for using KFC Order System:)");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}