package cn.sysror.Demo286DouDizhuSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDizhuSorted {
    public static void main(String[] args) {
        List<String> colors = List.of("♤", "♡", "♧", "♢");
        List<String> nums = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        int JOKERIndex = 0;
        poker.put(JOKERIndex, "\uD83E\uDD21JOKER");
        pokerIndex.add(JOKERIndex);
        int jokerIndex = 1;
        poker.put(jokerIndex, "\uD83C\uDCCFjoker");
        pokerIndex.add(jokerIndex);

        int index = 2;
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index, color + num);
                pokerIndex.add(index);
                index++;
            }
        }

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> p1Hand = new ArrayList<>();
        ArrayList<Integer> p2Hand = new ArrayList<>();
        ArrayList<Integer> p3Hand = new ArrayList<>();
        ArrayList<Integer> holes = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                holes.add(in);
            } else if (i % 3 == 0) {
                p1Hand.add(in);
            } else if (i % 3 == 1) {
                p2Hand.add(in);
            } else {
                p3Hand.add(in);
            }
        }

        Collections.sort(p1Hand);
        Collections.sort(p2Hand);
        Collections.sort(p3Hand);
        Collections.sort(holes);

        lookHand("A_Pi", poker, p1Hand);
        lookHand("Kinoko7", poker, p2Hand);
        lookHand("12dora", poker, p3Hand);
        lookHand("HOLES", poker, holes);
    }

    static void lookHand(String pName, HashMap<Integer,String> poker, ArrayList<Integer> hand) {
        System.out.print("【" + pName + "的手牌】");
        for (Integer in : hand) {
            System.out.print(poker.get(in) + ", ");
        }
        System.out.print("\n");
    }
}
