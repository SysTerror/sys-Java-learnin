package cn.sysror.Demo213RedPacketPlus;

public class MyRed extends RedPacket {
    public MyRed() {
        super("恭喜发财"); // 默认标题
    }

    public MyRed(String title) {
        super(title);
    }
}
