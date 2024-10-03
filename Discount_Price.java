import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input MRP from user
        System.out.print("Enter the MRP (Maximum Retail Price) of the product: ");
        double mrp = scanner.nextDouble();

        // Input discount percentage from user
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Input GST percentage from user
        System.out.print("Enter the GST percentage: ");
        double gstPercentage = scanner.nextDouble();

        // Calculate discount amount
        double discountAmount = (mrp * discountPercentage) / 100;

        // Calculate discounted price (MRP - Discount)
        double discountedPrice = mrp - discountAmount;

        // Calculate GST amount on discounted price
        double gstAmount = (discountedPrice * gstPercentage) / 100;

        // Calculate final price (Discounted Price + GST)
        double finalPrice = discountedPrice + gstAmount;

        // Output the results
        System.out.println("\n--- Price Calculation Summary ---");
        System.out.printf("Original MRP: %.2f\n", mrp);
        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Price After Discount: %.2f\n", discountedPrice);
        System.out.printf("GST Amount: %.2f\n", gstAmount);
        System.out.printf("Final Price (After Discount and GST): %.2f\n", finalPrice);
    }
}
