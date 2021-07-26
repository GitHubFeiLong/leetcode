package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20有效的括号
 * @author e-Feilong.Chen
 * @version 1.0
 * @description TODO
 * @date 2021/6/25 15:57
 */
public class E20 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(6);
        map.put("(", ")");
        map.put(")", "(");
        map.put("{", "}");
        map.put("}", "{");
        map.put("[", "]");
        map.put("]", "[");


        String s = "([)]";
        String[] split = s.split("");
        if (split.length % 2 != 0) {
            
        }
        Stack<String> stack = new Stack();
        
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            if (i != 0) {
                // 添加时检查上一个元素和本次添加的元素是否可以抵消
                String peek = stack.peek();
                if (!s1.equals(map.get(peek))) {
                    stack.push(s1);
                }
            } else {
                stack.push(s1);
            }


            System.out.println("stack = " + stack);

        }

        System.out.println(Arrays.toString(split));
    }
}