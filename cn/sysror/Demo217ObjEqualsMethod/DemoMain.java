package cn.sysror.Demo217ObjEqualsMethod;

import cn.sysror.obj.Game;

public class DemoMain {
    public static void main(String[] args) {
        Game game1 = new Game("传说之下", 2018);
        Game game2 = new Game("来自星尘", 2024);
        Game game3 = new Game("传说之下", 2018);
        Game gameNull = null;
        System.out.println(game1.equals(game1)); // true
        System.out.println(game1.equals(game2)); // false
        System.out.println(game3.equals(game1)); // true
        System.out.println(game1.equals(gameNull)); // false
    }
}
