package easy;

/**
 * 14最长公共前缀
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 15:37
 */
public class E14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                char c1 = strs[0].charAt(i);

                if (strs[j].length() -1 < i || c1 != strs[j].charAt(i)) {
                    return result.toString();
                }
                if (j == strs.length - 1) {
                    result.append(c1);
                }
            }
        }

        return result.toString();
    }
}
