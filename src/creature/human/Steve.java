package creature.human;

import creature.Creature;
import creature.monster.WitherSkeleton;
import potion.Potion;
import creature.monster.Undead;

public class Steve extends Human{

    private String weapon;//武器
    private String potion;//药水

    //两个参数的构造器
    public Steve(String weapon, String potion) {
        //默认属性
        super(100, 10, 20);

        this.weapon = weapon;
        this.potion = potion;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getPotion() {
        return potion;
    }

    @Override
    public void attack(Creature enemy) {
        System.out.println("Steve发动攻击");
        enemy.suffer(getDamage());
        decreaseStrength(1); // 消耗1体力
    }

    @Override
    public void drinkPotion() {
        if (potion.equals("RecoverPotion")) {
            increaseHp(20);
            System.out.println("Steve喝下了治疗药水，恢复20生命值");
            // 喝下治疗药水，恢复20生命值
        }
        if (potion.equals("DamagePotion")){
            increaseDamage(10);
            System.out.println("Steve喝下了伤害药⽔，伤害增加10");
        }
    }

    @Override
    public void jumpingChop(Creature enemy) {
        System.out.println("Steve发动跳劈");
        double damge = getDamage() * (Math.random() + 1);
        enemy.suffer(damge);
        decreaseStrength(2);
    }
}
