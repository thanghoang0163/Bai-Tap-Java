package Cap_do_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        List<String> newStr = new ArrayList<>(List.of(str.split(" ")));
        List<String> upperFirstCharList = new ArrayList<>();

        for (String word : newStr) {
            upperFirstCharList.add(String.valueOf(Character.toUpperCase(word.charAt(0))));
        }

        System.out.println(String.join(" ", upperFirstCharList));
    }
}
