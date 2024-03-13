package cn.sysror.Demo213RedPacketPlus;

public class MyRed extends RedPacket {
    public MyRed() {
        super("普通红包", false);
    }

    public MyRed(boolean isRandom) {
        super("普通红包", isRandom);
        if (isRandom) super.setTitle("手气红包");
    }
}
