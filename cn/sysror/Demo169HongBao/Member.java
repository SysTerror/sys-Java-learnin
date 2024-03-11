package cn.sysror.Demo169HongBao;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    String name = "群员";

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void recieveMoney(ArrayList<Integer> redList) {
        int index = new Random().nextInt(redList.size()); // [0, n-1]
        int delta = redList.remove(index); // 从集合里随机取出一个红包，用 delta 接收其金额
            // delta 变动的金额
        int left = this.getMoney();
        super.setMoney(left + delta); // 给钱，重设余额
    }

    public void showMoney() {
        super.showMoney(name);
    }
}
