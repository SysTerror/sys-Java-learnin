package entity;

public class Uper extends User { // 定义 Uper 为 User 的子类（超类）
    String name; // 子类属性与父类属性可以重名，优先级比后者高

    public Uper(int uid, String name) {
        super(uid, name); // 调用父类构造方法（必须，不能另起炉灶）
        System.out.println("「构造子类」紧接着上条构造了一个 Uper 类的对象，并继承其父类属性。");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void hello() {
        System.out.println("你好！我叫 "+ name +"，是一名 Up 主，我的用户名是 "+ super.name +"，我的 UID 是 "+ uid +"。");
    }
}