package cn.sysror.Demo213RedPacketPlus;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divideMoney(final int total, final int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        int avg = total / count;
        int mod = total % count;
        for (int i = 0; i < count-1; i++) redList.add(avg); // 先包整的
        redList.add(avg + mod); // 最后包带零头的
        return redList;
    }
}
