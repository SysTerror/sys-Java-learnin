package cn.sysror.Demo194USB;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("【键盘】打开键盘");
    }
    @Override
    public void close() {
        System.out.println("【键盘】关闭键盘");
    }
    public void type() {
        System.out.println("【键盘】键盘打字");
    }
}
