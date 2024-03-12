package cn.sysror.Demo194USB;

public class Demo194USB {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        USB usbMouse = new Mouse(); // 向上转型
        laptop.useDevice(usbMouse); // 供 laptop 使用
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard); // Keyboard 类对象 自动向上转型为 USB 接口类对象
        laptop.powerOff();
    }
}
