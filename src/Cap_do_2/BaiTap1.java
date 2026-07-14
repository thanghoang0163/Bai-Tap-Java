package Cap_do_2;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tax = 0;
        double income = 0;

        do {
            System.out.print("Enter annual income: ");
            income = sc.nextDouble();

            if (income < 0) {
                System.out.println("Invalid income!");
            } else if (income <= 5000000) {
                tax = income * 0.05;
            } else if (income <= 10000000) {
                tax = income * 0.1;
            } else if (income <= 18000000) {
                tax = income * 0.15;
            } else if (income <= 32000000) {
                tax = income * 0.20;
            } else if (income <= 52000000) {
                tax = income * 0.25;
            } else if (income <= 80000000) {
                tax = income * 0.30;
            } else {
                tax = income * 0.35;
            }
        } while (income < 0);

        System.out.printf("Tax payable: %.0f million VND%n", tax);
    }
}
