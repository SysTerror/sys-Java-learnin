package cn.sysror.Demo209ClassVar;

public class Demo209ClassVar {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("A_Pi");
        hero.setAge(32);

        Weapon weapon = new Weapon("樱之缺德");
        hero.setWeapon(weapon);
        hero.attack();
        
        hero.setSkill(new SkillImpl()); // 向上转型
        hero.attackSkill();

        hero.setSkill(new Skill() {
            @Override
            public void useSkill() {
                System.out.println("使用匿名技能！");
            }
        });
        hero.attackSkill();
    }
}