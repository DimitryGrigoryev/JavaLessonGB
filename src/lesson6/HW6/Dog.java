package lesson6.HW6;

public class Dog extends Animals {


    public Dog(int maxRun, double maxJump, int maxSwim) {
        super(maxRun, maxJump, maxSwim);
    }

    @Override
    public boolean run(int dogRun) {
        if (this.maxRun >= dogRun) {
            System.out.printf("Собака смогла пробежать %s м. Ограничения = %s%n", dogRun, maxRun);
            return true;
        }
        System.out.printf("Собака не может так далеко бегать на  %s м. Ограничения = %s%n", dogRun, maxRun);
        return false;
    }

    @Override
    public boolean swim(int dogSwim) {
        if (this.maxSwim >= dogSwim) {
            System.out.printf("Собака проплыла на %d м. Максимальная дистанция = %d%n", dogSwim,  maxSwim);
            return true;
        }

        System.out.printf("Собака не смогла переплыть дистанцию %d. Максиимальный прыжок = %d м.%n", dogSwim,  maxSwim);
        return false;
    }

    @Override
    public boolean jump(double dogJump) {
        if (this.maxJump >= dogJump) {
            System.out.printf("Собака смогла подпрыгнуть на %s м. Ограничения = %s%n", dogJump, maxJump);
            return true;
        }
        System.out.printf("Собака не может так высоко прыгать %s м. Ограничение = %s%n", dogJump, maxJump);
        return false;
    }

}
