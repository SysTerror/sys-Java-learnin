package cn.sysror.obj;

import java.util.Objects;

public class Game {
    private String title;
    private int year;

    public Game() {
    }

    public Game(String title, int year) {
        this.title = title;
        this.year = year;
    }

/*    @Override
    public boolean equals(Object obj) { // 覆写父类 Object 的 equals 方法
        // 【特例】
        if (obj == this) return true; // 【增效】与本身比较，返回 true
        if (obj == null) return false; //【增效】传入空指针，返回 false
        if (!(obj instanceof Game)) return false;
            // 本非 Person 类对象，则返回 false
            // 防止 ClassCastException (类型转换异常)

        // 【惯例】
        Game game = (Game) obj; // 强制向下转型
        return this.title.equals(game.title) && this.year == game.year;
            // 这里的 equals 方法属于 String 类，不是同一个
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return year == game.year && Objects.equals(title, game.title);
            // Objects 类的静态方法 equals，可防止 NullPointerException (空指针异常)
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}