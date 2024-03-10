package cn.sysror.Demo126ArrayList;

import java.util.ArrayList;

public class Demo127ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        
        // 添加 0~9 至集合（作为字符串）
        for (int i = 0; i < 10; i++) {
            list2.add("" + i);
        }
        
        // 遍历打印集合元素（使用 for 循环）
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
