package Cap_do_2;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean bool = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                bool = false;
            }
            left++;
            right--;
        }

        System.out.println(bool);
    }
}
