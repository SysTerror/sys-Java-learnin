package cn.sysror.Demo213RedPacketPlus;

public abstract class RedPacket {
    private String title;
    private boolean isRandom;

    public RedPacket(String title, boolean isRandom) {
        this.title = title;
        this.isRandom = isRandom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getRandom() {
        return isRandom;
    }

    public void setRandom(boolean isRandom) {
        this.isRandom = isRandom;
    }
}