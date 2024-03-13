package cn.sysror.Demo213RedPacketPlus;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divideMoney(final int total, final int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        Random r = new Random();
        int leftMoney = total, leftCount = count;
        for (int i = 0; i < count-1; i++) { // 先包前 n-1 个
            int max = leftMoney / leftCount * 2; // 每次分发金额不过当前均值的 2 倍（削弱先者优势）
            int cur = r.nextInt(max) + 1; // [1, max]
            redList.add(cur);
            leftMoney -= cur;
            leftCount--;
        }
        redList.add(leftMoney); // 前 n-1 个包完，余下的包给最后一个
        return redList;
    }
}
