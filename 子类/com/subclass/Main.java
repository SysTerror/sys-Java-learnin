import entity.User;
import entity.Uper;

public class Main {
    public static void main(String[] args) {
        Uper up = new Uper(0, null);
        up.setName("A");
        up.setUid(233);
        up.hello();

        User up_User = new Uper(1, "B"); // 父类变量 引用 子类对象（向上转型）
        up_User.hello(); // 把 子类 当作 父类 使用
            // 输出：你好！我叫 null，是一名 Up 主，我的用户名是 B，我的 UID 是 1。
            // 这说明 Uper 类对象的构造方法 调用了 User 类的，而没有它自己的构造方法
        Uper up_Uper = (Uper) up_User; // 父类引用 转 子类引用，需要强制转型（向下转型）
            // 向下转型 适用于 原本就是目标类型的引用变量
        up_Uper.hello();

        User user = new User(213, "C");
        user.hello();

        if (up_Uper instanceof User) {
            System.out.println("up_Uper 所引对象属于 User 类或它的一个子类。");
        } else {
            System.out.println("up_Uper 所引对象不属于 User 类和它的所有子类。");
        }
    }
}