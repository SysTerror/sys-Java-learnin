package cn.sysror.Demo126ArrayList;

import java.util.ArrayList;

public class Demo126ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(); // 泛型必须是引用类型（如 String）
        System.out.println(list1); // []
        list1.add("Item1");
        System.out.println(list1); // [Item1]
        list1.add("Item2");
        System.out.println(list1); // [Item1, Item2]
    }
}