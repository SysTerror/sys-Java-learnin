package cn.sysror.Demo253DouDizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class DouDizhu {
    public static void main(String[] args) {
        // 1 备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♤", "♡", "♧", "♢"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        // 2 配牌
        poker.add("\uD83E\uDD21JOKER"); // 大王
        poker.add("\uD83C\uDCCFjoker"); // 小王
        for (String num : nums) {
            for (String color : colors) {
                poker.add(color + num);
            }
        }

        // 3 洗牌（使用集合类方法 shuffle）
        Collections.shuffle(poker);

        // 4 发牌（使用 求余运算符 % 顺序发牌）
        // 4.1 引入 4 个集合，存储 3 名玩家各自的 17 张手牌 和 剩下的 3 张底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> hole = new ArrayList<>(); // 底牌 hole cards
        // 4.2 遍历 poker 集合，按余数决定发牌目标
        for (int i = 0; i < poker.size(); i++) {
            String card = poker.get(i);
            if (i >= 51) {
                hole.add(card);
            } else if (i % 3 == 0) {
                p1.add(card);
            } else if (i % 3 == 1) {
                p2.add(card);
            } else {
                p3.add(card);
            }
        }

        // 5 看牌
        System.out.println("A_Pi: " + p1);
        System.out.println("Kinoko7: " + p2);
        System.out.println("Win11: " + p3);
        System.out.println("HOLE: " + hole);
    }
}
