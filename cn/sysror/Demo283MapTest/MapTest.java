package cn.sysror.Demo283MapTest;

import java.util.HashMap;
import java.util.Scanner;

/* 输入一个字符串，输出其中所有出现的字符及其出现次数 */
public class MapTest {
    public static void main(String[] args) {
        System.out.println("输入一行文字：");
        String strInput = new Scanner(System.in).next();
        HashMap<Character,Integer> charMap = new HashMap<>();

        for (char c : strInput.toCharArray()) {
            Integer appearTimes = 0;
            if (charMap.containsKey(c)) {
                appearTimes = charMap.get(c);
            }
            charMap.put(c, ++appearTimes);
        }

        for (Character key : charMap.keySet()) {
            Integer value = charMap.get(key);
            System.out.printf(key + " = " + value + ", ");
        }
    }
}
