package easy;

/**
 * 7整数反转
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 14:19
 */
public class E7 {
    public static void main(String[] args) {
        System.out.println(new E7().reverse(1534236469));
    }
    public int reverse(int x) {
        try {
            if (x < 0) {
                return Integer.parseInt(new StringBuilder(x * -1 + "").reverse().insert(0, "-").toString());
            }
            return Integer.parseInt(new StringBuilder(x + "").reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
