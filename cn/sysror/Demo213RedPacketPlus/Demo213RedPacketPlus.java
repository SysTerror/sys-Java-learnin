package cn.sysror.Demo213RedPacketPlus;

import java.util.ArrayList;

public class Demo213RedPacketPlus {
    public static void main(String[] args) {
        // 普通红包
        MyRed redNormal = new MyRed("恭喜发财，一人一百");
        OpenMode normal = new NormalMode();
        ArrayList<Integer> redListNormal = normal.divideMoney(3000, 7);
        System.out.println("【" + redNormal.getTitle() + "】" + redListNormal);

        // 手气红包
        MyRed redRandom = new MyRed("新年快乐，拼拼手气");
        OpenMode random = new RandomMode();
        ArrayList<Integer> redListRandom = random.divideMoney(2000, 17);
        System.out.println("【" + redRandom.getTitle() + "】" + redListRandom);
    }
}
