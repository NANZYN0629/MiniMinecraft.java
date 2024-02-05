package creature.human;

import creature.Creature;

public abstract class Human extends Creature {

    public Human(int hp, int damage, int strength) {

        super(hp, damage, strength);
    }

    //喝药水
    public abstract void drinkPotion();
    //跳劈
    public abstract void jumpingChop(Creature enemy);



}
