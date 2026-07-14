package Cap_do_1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();

            if (n >= 0) {
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }

                System.out.println(sum);
            }
        } while (n < 0);
    }
}
