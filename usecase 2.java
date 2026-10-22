import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String item = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            double amount = price * quantity;
            total += amount;

            System.out.println(item + " " + amount);
        }

        double discount = total * 0.10;
        double finalAmount = total - discount;

        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final Bill: %.2f%n", finalAmount);

        sc.close();
    }
}