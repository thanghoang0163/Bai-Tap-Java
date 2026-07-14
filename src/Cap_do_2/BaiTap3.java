package Cap_do_2;

import java.util.*;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        List<String> strArray = new ArrayList<>(List.of(str.split("")));
        List<String> newStrArray = new ArrayList<>();

        for (int i = 0; i < strArray.size(); i++) {
            if (!newStrArray.contains(strArray.get(i))) {
                newStrArray.add(strArray.get(i));
            }
        }


        System.out.println(String.join("", newStrArray));
    }
}
