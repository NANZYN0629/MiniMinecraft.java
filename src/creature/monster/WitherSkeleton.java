package creature.monster;

import creature.Creature;

public class WitherSkeleton extends Monster implements Undead{

    //无参构造器
    public WitherSkeleton() {
        //默认值：
        super(200, 10, 20);
    }



    @Override
    public void attack(Creature enemy) {
        System.out.println("WitherSkeleton发动了攻击");
        enemy.suffer(getDamage());
        decreaseStrength(1);
    }


}
