package conditionalstatements;

import java.util.*;

class Menu{
    double cart = 0;
    Scanner sc = new Scanner(System.in);

    void veg() {
        System.out.println("The menu is: ");
        System.out.println("1-Idly(50 rs)\n2-Dose(60 rs)\n3-Ricebath(70 rs)\n4-Veg Biryani(100 rs)\n5-Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int vg_ch = sc.nextInt();

            if (vg_ch == 1) {
                cart += 50;
            } else if (vg_ch == 2) {
                cart += 60;
            } else if (vg_ch == 3) {
                cart += 70;
            } else if (vg_ch == 4) {
                cart += 100;
            } else if (vg_ch == 5) {
                break;
            } else {
                System.out.println("Incorrect input.");
            }
        }
    }

    void nveg() {
        System.out.println("The menu is: ");
        System.out.println("1-Chicken Biryani(150 rs)\n2-Mutton Curry(180 rs)\n3-Fish Fry(120 rs)\n4-Chicken Sandwich(100 rs)\n5-Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int vg_ch = sc.nextInt();

            if (vg_ch == 1) {
                cart += 150;
            } else if (vg_ch == 2) {
                cart += 180;
            } else if (vg_ch == 3) {
                cart += 120;
            } else if (vg_ch == 4) {
                cart += 100;
            } else if (vg_ch == 5) {
                break;
            } else {
                System.out.println("Incorrect input.");
            }
        }
    }

    void finale() {
        System.out.println("Total cart amount is: " + cart);
        System.out.println("Do you have a coupon code ('y'/'n'): ");
        String c_ch = sc.next();

        if (c_ch.equals("y")) {
        	while(true){
                System.out.println("Please enter coupon code: ");
                String coupon = sc.next().toLowerCase(); // Convert to lowercase to handle case-insensitivity;
                if (coupon.equals("food10")) {
                    cart *= 0.90; // Apply 10% discount
                    break;
                } else if (coupon.equals("food20")) {
                    cart *= 0.80; // Apply 20% discount
                    break;
                } else {
                    System.out.println("Invalid coupon code.");
                }
        	}

            System.out.println("Cart amount after discount: " + cart);
            double gst = cart * 0.05;
            double total = cart + gst;
            
            System.out.println("GST is: "+gst);
            System.out.println("Final amount is: " + total);

        } else if (c_ch.equals("n")) {
            double gst = cart * 0.05;
            double total = cart + gst;
            System.out.println("GST is: "+gst);
            System.out.println("Final amount is: " + total);
        }
    }
}

public class food_ordering {
    public static void main(String[] args) {
        Menu aobj = new Menu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter category:\n1: Veg\n2: Non-Veg\n3: Exit");
            int cat_ch = sc.nextInt();

            if (cat_ch == 1) {
                aobj.veg();
            } else if (cat_ch == 2) {
                aobj.nveg();
            } else if (cat_ch == 3) {
                aobj.finale();
                break; // Exit the loop and the program
            } else {
                System.out.println("Incorrect input. Please try again.");
            }
        }
    }
}
