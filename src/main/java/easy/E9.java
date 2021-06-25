package easy;

/**
 * 9回文数
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 14:32
 */
public class E9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String temp = x + "";

        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() -1 -i)) {
                return false;
            }
        }

        return true;
    }
}
