package potion;
import creature.Creature;

public interface AttackBuff {
    public void increaseDamage(Creature self, Creature target);
}
