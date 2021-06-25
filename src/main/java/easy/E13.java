package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 13罗马数字转整数
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 14:49
 */
public class E13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        // 合计
        int result = 0;
        for (int i = 0; i < length; i++) {
            int num = 0;
            if (i < length - 1) {
                num = addNum(s.charAt(i), s.charAt(i + 1), map);
            } else {
                num = map.get(s.charAt(i));
            }
            result += num;
        }

        return result;
    }

    public static int addNum (char a1, char a2, Map<Character, Integer> map) {
        // 1 5 10 50 100 500 1000

        /*
            I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
            X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
            C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
        */
        if (a1 != 'I' && a1 != 'X' && a1 != 'C') {
            return map.get(a1);
        }

        if (a1 == 'I' && (a2 == 'V' || a2 == 'X')) {
            return -1;
        }

        if (a1 == 'X' && (a2 == 'L' || a2 == 'C')) {
            return -10;
        }

        if (a1 == 'C' && (a2 == 'D' || a2 == 'M')) {
            return -100;
        }

        return map.get(a1);
    }


}
