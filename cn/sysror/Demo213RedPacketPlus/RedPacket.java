package cn.sysror.Demo213RedPacketPlus;

public abstract class RedPacket {
    private String title;

    public RedPacket(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}