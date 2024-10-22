import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter purchase amount:");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0;
        double payableAmount = 0;

        if (purchaseAmount < 100) {
            payableAmount = purchaseAmount;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = purchaseAmount * 0.10;
            payableAmount = purchaseAmount - discount;
        } else if (purchaseAmount > 1000) {
            discount = purchaseAmount * 0.20;
            payableAmount = purchaseAmount - discount;
        }

        System.out.printf("Purchase Amount: $%.2f\n", purchaseAmount);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Payable Amount: $%.2f\n", payableAmount);

        scanner.close();
    }
    }