package weapon;

import creature.human.Steve;

public class IronSword extends Weapon{

    @Override
    public void increaseDamage(Steve steve) {
        steve.increaseDamage(10);
    }
}
