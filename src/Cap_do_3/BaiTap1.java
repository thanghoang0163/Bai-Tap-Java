package Cap_do_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};

        Scanner sc = new Scanner(System.in);


        int target = 0;
        List<Integer> indexsArray = new ArrayList<>();

        do {
            System.out.println("Enter target: ");
            target = sc.nextInt();

            if (target >= 0) {
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers.length; j++) {
                        if (j > i) {
                            if (numbers[i] + numbers[j] == target) {
                                indexsArray.add(i + 1);
                                indexsArray.add(j + 1);
                                break;
                            }
                        }
                    }
                }
            }

            if (indexsArray.isEmpty()) {
                System.out.println("Not Found!");
            } else {
                System.out.println(indexsArray);
            }
        } while (target < 0);
    }
}
