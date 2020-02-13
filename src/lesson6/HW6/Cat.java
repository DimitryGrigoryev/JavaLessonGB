package lesson6.HW6;

import lesson6.Animal;

public class Cat extends Animals {

    public static final int catMaxSwim = 0;

    public Cat(int maxRun, int maxJump) {
        super(maxRun, maxJump, catMaxSwim);
    }

    @Override
    public boolean run(int catRun) {
        if (this.maxRun >= catRun) {
            System.out.printf("Кот смог пробежать %s м. Ограничения = %s%n", catRun, maxRun);
            return true;
        }
        System.out.printf("Кот не может столько бегать %s м. Ограничения = %s%n", catRun, maxRun);
        return false;
    }

    @Override
    public boolean swim(int catSwim) {
        System.out.printf("Коты не умеют плавать %n");
        return false;
    }

    @Override
    public boolean jump(double catJump) {
        if (this.maxJump >= catJump) {
            System.out.printf("Кот смог подпрыгнуть на %s м. Ограничения = %s%n", catJump, maxJump);
            return true;
        }
        System.out.printf("Кот не может так высоко прыгать на - %s м. Ограничение = %s%n", catJump, maxJump);
        return false;
    }



}
