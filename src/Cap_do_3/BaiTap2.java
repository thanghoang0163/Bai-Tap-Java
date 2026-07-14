package Cap_do_3;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("");
            return;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < str.length()
                    && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < str.length()
                    && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }
        }

        System.out.println(str.substring(start, start + maxLength));
    }
}
