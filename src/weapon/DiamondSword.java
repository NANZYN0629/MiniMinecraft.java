package weapon;

import creature.human.Steve;

public class DiamondSword extends Weapon{

    @Override
    public void increaseDamage(Steve steve) {
        steve.increaseDamage(15);
    }
}
