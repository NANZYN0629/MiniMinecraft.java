package creature;

public abstract class Creature {
    private double hp;
    private double damage;//伤害
    private double strength;//体力

    //全参构造器
    public Creature(double hp, double damage, double strength) {
        this.hp = hp;
        this.damage = damage;
        this.strength = strength;
    }

    //三个属性的get方法
    public double getHp() {
        return hp;
    }
    public double getDamage() {
        return damage;
    }
    public double getStrength() {
        return strength;
    }

    //普通方法
    //增加血量
    public void increaseHp(double n){
        hp += n;
    }
    //增加伤害
    public void increaseDamage(double n){
        damage += n;
    }
    //减少体力
    public void decreaseStrength(double n){
        strength -= n;
    }
    //增加体力
    public void increaseStrength(double n){
        strength += n;
    }
    //受到伤害
    public void suffer(double n){
        hp -= n;
    }

    //抽象方法：attack
    public abstract void attack(Creature enemy);

}
