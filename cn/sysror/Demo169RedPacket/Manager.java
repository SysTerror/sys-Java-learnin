package cn.sysror.Demo169RedPacket;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendMoney(int total, int n) {
        ArrayList<Integer> redList = new ArrayList<>(); // 红包金额集合

        // 1. 检查余额 & 扣钱
        int left = super.getMoney(); // 群主余额
        if (total > left) {
            System.out.println("余额不足");
            return redList; // 返回空集合
        }
        super.setMoney(left - total); // 扣钱，重设余额

        // 2. 包红包
        int avg = total / n;
        int mod = total % n; // 余数，甩下的零头
        for (int i = 0; i < n-1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod); // 把 除不开的零头 包在 最后一个红包里

        return redList;
    }
}
