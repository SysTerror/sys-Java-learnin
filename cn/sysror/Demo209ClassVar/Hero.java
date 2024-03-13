package cn.sysror.Demo209ClassVar;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon; // 自定义的类作为变量类型
    private Skill skill;

    public Hero() {}

    public Hero(String name, int age, Weapon weapon, Skill skill) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("【" + name + "(" + age + ")】使用" + weapon.getCode() + "攻击了一次！");
    }

    public void attackSkill() {
        System.out.println("【" + name + "(" + age + ")】开始施放技能！");
        skill.useSkill();
        System.out.println("【" + name + "(" + age + ")】技能施放完毕！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
