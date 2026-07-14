package Cap_do_3;

import java.util.HashMap;

public class BaiTap3 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        String newStrT = t.toUpperCase();
        String newStrS = s.toUpperCase();

        for (char c : newStrT.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        while (right < newStrS.length()) {
            char c = newStrS.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);

                if (window.get(c).intValue() == need.get(c).intValue()) {
                    valid++;
                }
            }

            while (valid == need.size()) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char d = newStrS.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(start, start + minLen));
        }
    }
}
