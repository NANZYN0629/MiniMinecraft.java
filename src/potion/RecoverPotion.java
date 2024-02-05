package potion;

import creature.Creature;
import creature.human.Steve;
import creature.monster.WitherSkeleton;

public class RecoverPotion extends Potion implements AttackBuff,RecoverBuff{

    @Override
    public void increaseHp(Steve steve) {
        steve.increaseHp(20);
        System.out.println("Steve喝下了治疗药水，恢复20生命值");
    }


    @Override
    public void increaseDamage(Creature self, Creature target) {
        if (self instanceof Steve && target instanceof WitherSkeleton){
            self.increaseDamage(10);
        }
        System.out.println("敌人是亡灵生物，伤害增加10");
    }
}
