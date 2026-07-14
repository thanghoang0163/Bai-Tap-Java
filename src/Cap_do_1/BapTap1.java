package Cap_do_1;

import java.util.*;

public class BapTap1 {
    public static void main(String[] args) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "o", "e", "u", "i"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str =sc.nextLine();

        List<String> newStr = new ArrayList<>(List.of(str.split("")));

        newStr.removeIf(ch -> vowels.contains(ch.toLowerCase()));

        System.out.println(String.join("", newStr));
    }
}