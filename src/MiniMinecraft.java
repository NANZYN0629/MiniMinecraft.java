import creature.human.Steve;
import creature.monster.WitherSkeleton;

import java.util.Scanner;

/*
1. 为什么我们要写一个空接口Undead，它的意义是什么。并谈一谈你对接口理解。
答：
    1. 空接口Undead可以给WitherSkeleton一个属性，在特殊处理时，比如本次作业要求补血药使用时如果对手是亡灵生物增加伤害，这样如果有多种亡灵生物，可以方便分类
    2. 接口可以实现代码的复用和拓展，提高代码的可读性和可维护性。

2. 为什么java只允许单继承，请你谈谈多继承会出现的问题以及java对此的解决方案。
答：
    1.
        （1）命名冲突：如果一个类继承了两个父类，而这两个父类中包含相同的方法或属性名称，那么子类就无法确定应该调用哪个父类的方法或属性。
        （2）代码耦合度高：多继承会将多个不同的类联系在一起，使得代码的耦合度变得非常高，如果其中一个父类需要修改，那么其他所有的子类都可能会受到影响。
    2.使用接口和抽象类
 */


public class MiniMinecraft {
    public static void main(String[] args) {
        Steve steve = new Steve("DamagePotion","RecoverPotion");
        WitherSkeleton ws = new WitherSkeleton();

        System.out.println("你是Steve，你装备了武器：" + steve.getWeapon() + "，药水：" + steve.getPotion());

        Scanner scanner = new Scanner(System.in);




        while(steve.getHp() > 0 && steve.getStrength() > 0 && ws.getHp() > 0){

            System.out.println("Steve的属性         | Hp:"+steve.getHp()+" |Damage"+steve.getDamage()+" |Strength"+steve.getStrength());
            System.out.println("WitherSkeleton的属性| Hp:"+ws.getHp()+" |Damage"+ws.getDamage()+" |Strength"+ws.getStrength());


            String input = scanner.nextLine();
            char key = input.charAt(0);
            switch (key){
                case 'a':
                    steve.attack(ws);
                    break;
                case 'd':
                    steve.drinkPotion();

                    break;
                case 'q':
                    System.out.println("原地挨打");
                    // 原地挨打...
                    break;
                case 'j':
                    steve.jumpingChop(ws);
                    break;
                default:
                    System.out.println("未知操作");
                    break;
            }

            if (ws.getHp() > 0 && ws.getStrength() > 0) {
                ws.attack(steve);
            }

            if (steve.getHp() <= 0){
                System.out.println("Steve死亡");
                break;
            }

            if (steve.getStrength() <= 0)
            {
                System.out.println("Steve体力耗尽");
                break;
            }

            if (ws.getHp() <= 0){
                System.out.println("WitherSkeleton死亡");
                break;
            }

            if(ws.getStrength() <= 0)
            {
                System.out.println("WitherSkeleton体力耗尽");
                break;
            }


            System.out.println("------------------------------------------------");
        }


    }
}
