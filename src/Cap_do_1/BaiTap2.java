package Cap_do_1;

import java.util.Arrays;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] numsArray = {1, 3, 4, 5, 0, 2};

        int max = Arrays.stream(numsArray).max().getAsInt();

        int next = 0;

        if (numsArray.length > 1) {
            for (int num : numsArray) {
                if (num < max && num > next) {
                    next = num;
                }
            }

            System.out.println(next);
        } else {
            System.out.println(Integer.MIN_VALUE);
        }
    }
}