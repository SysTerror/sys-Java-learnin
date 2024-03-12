package cn.sysror.Demo194USB;

public class Laptop {
    public void powerOn() {
        System.out.println("【笔记本电脑】开机");
    }
    
    public void powerOff() {
        System.out.println("【笔记本电脑】关机");
    }

    public void useDevice(USB usbDevice) {
        usbDevice.open();
        if (usbDevice instanceof Mouse) { // 检查 USB 设备类型
            ((Mouse)usbDevice).click(); // 根据设备类型执行相应方法
        } else if (usbDevice instanceof Keyboard) {
            ((Keyboard)usbDevice).type();
        }
        usbDevice.close();
    }
}