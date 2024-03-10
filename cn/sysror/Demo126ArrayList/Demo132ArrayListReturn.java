package cn.sysror.Demo126ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Demo132ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> raw = new ArrayList<>();
        Random rNum = new Random();
        for (int i = 0; i < 20; i++) {
            raw.add(rNum.nextInt(100) + 1); // [1, 100] 内取随机数
        } // 1. 生成原集合 raw
        for (int i = 0; i < getEven(raw).size(); i++) {
            System.out.println(getEven(raw).get(i));
        } // 3. 打印偶集合 even
    }

    public static ArrayList<Integer> getEven(ArrayList<Integer> raw) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < raw.size(); i++) {
            if (raw.get(i) % 2 == 0) even.add(raw.get(i));
        } // 2. 拣取偶集合 even
        return even;
    }
}
