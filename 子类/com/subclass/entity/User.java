package entity;

public class User { // 所有的类 都 默认继承自 Object 类
    int uid;
    String name;

    public User(int uid, String name) {
        this.uid = uid;
        this.name = name;
        System.out.println("「构造父类」构造了一个 User 类的对象。");
    }

    public void hello() {
        System.out.println("你好！我叫 "+ name +"，是一名用户，我的 UID 是 "+ uid +"。");
    }
}