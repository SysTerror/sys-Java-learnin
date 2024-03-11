package cn.sysror.Demo169HongBao;

import java.util.ArrayList;

class Demo169HongBao {
    public static void main(String[] args) {
        Manager mng = new Manager("12dora", 100000);
        Member mb1 = new Member("A_Pi", 10000);
        Member mb2 = new Member("Kinoko7", 20000);
        Member mb3 = new Member("LBB", 10000);
        
        mng.showMoney();
        mb1.showMoney();
        mb2.showMoney();
        mb3.showMoney();

        ArrayList<Integer> redList = mng.sendMoney(20000, 3);
            // 2000 块群发红包，发给 3 个群成员
        mb1.recieveMoney(redList);
        mb2.recieveMoney(redList);
        mb3.recieveMoney(redList);

        mng.showMoney();
        mb1.showMoney();
        mb2.showMoney();
        mb3.showMoney();
    }
}