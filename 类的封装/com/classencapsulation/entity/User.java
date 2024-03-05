package entity;

public class User {
    private int uid;
    private String name;
    private int age;
    
    // 构造方法
    private User(int uid, String name, int age) {
        this.uid = uid;
        this.name = name;
        this.age = age;
    }

    public static User getInstance(int uid, String name, int age) {
        User newUser = new User(uid, name, age);
        newUser.name = "B_Pi";
        return newUser;
    }

    // Get 接口
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getUid() {
        return uid;
    }

    // Set 接口
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        if (name.contains("SDNC")) return;
        this.name = name;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
