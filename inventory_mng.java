package conditionalstatements;

import java.util.*;

class InventorySystem {
    static double cart = 0; // Keeps track of the total value of ordered books.
    static Scanner sc = new Scanner(System.in);
    static List<Book> inventory = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int quantity;
        double price;

        public Book(String title, String author, int quantity, double price) {
            this.title = title;
            this.author = author;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Quantity: " + quantity + ", Price: " + price + " Rs";
        }
    }

    // Method to add a book to the inventory
    void addBook() {
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        // Add the new book to the inventory
        inventory.add(new Book(title, author, quantity, price));

        System.out.println("Book added successfully!");
    }

    // Method to show the inventory
    void showInventory() {
        System.out.println("\nCurrent Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("No books in the inventory.");
        } else {
            for (Book book : inventory) {
                System.out.println(book);
            }
        }
    }

    // Method to order a book (decrease quantity)
    void orderBook() {
        System.out.print("Enter the title of the book to order: ");
        String title = sc.nextLine();

        // Search for the book in the inventory
        Book bookToOrder = null;
        for (Book book : inventory) {
            if (book.title.equalsIgnoreCase(title)) {
                bookToOrder = book;
                break;
            }
        }

        if (bookToOrder != null) {
            System.out.print("Enter quantity to order: ");
            int orderQuantity = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if (orderQuantity <= bookToOrder.quantity) {
                // Update the quantity and add the price to the cart
                bookToOrder.quantity -= orderQuantity;
                cart += orderQuantity * bookToOrder.price;

                System.out.println("Ordered " + orderQuantity + " of " + title + ". Remaining quantity: " + bookToOrder.quantity);
            } else {
                System.out.println("Insufficient stock. Only " + bookToOrder.quantity + " available.");
            }
        } else {
            System.out.println("Book not found in inventory.");
        }
    }

    // Method to finalize the order and show the total
    void finalizeOrder() {
        System.out.println("Total cart amount is: " + cart);
    }
}

public class inventory_mng {
    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter option:\n1: Add Book\n2: Show Inventory\n3: Order Book\n4: Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if (choice == 1) {
                system.addBook();
            } else if (choice == 2) {
                system.showInventory();
            } else if (choice == 3) {
                system.orderBook();
            } else if (choice == 4) {
                system.finalizeOrder();
                break; // Exit the loop and the program
            } else {
                System.out.println("Incorrect input. Please try again.");
            }
        }
    }
}
