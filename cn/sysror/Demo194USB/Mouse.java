package cn.sysror.Demo194USB;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("【鼠标】打开鼠标");
    }
    @Override
    public void close() {
        System.out.println("【鼠标】关闭鼠标");
    }
    public void click() {
        System.out.println("【鼠标】鼠标点击");
    }
}
