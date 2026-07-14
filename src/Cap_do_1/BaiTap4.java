package Cap_do_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        List<String> newStr = new ArrayList<>(List.of(str.split(" ")));

        System.out.println(newStr.size());
    }
}
