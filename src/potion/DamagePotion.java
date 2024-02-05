package potion;

import creature.Creature;

public class DamagePotion extends Potion implements AttackBuff{

    @Override
    public void increaseDamage(Creature self, Creature target) {
        self.increaseDamage(10);
        System.out.println("Steve喝下了伤害药⽔，伤害增加10");
    }
}
