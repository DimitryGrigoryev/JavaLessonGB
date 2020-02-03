package lesson6.HW6;

public class Dog extends Animals {
    public static final int dogMaxRun = 500;
    public static final double dogMaxJump = 0.5;
    public static final int dogMaxSwim = 10;

    public Dog(int maxRun, double maxJump, int maxSwim) {
        super(maxRun, maxJump, maxSwim);
    }

    @Override
    public boolean run(int distance) {
        return false;
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }

    @Override
    public boolean jump(int height) {
        return false;
    }


//    private int heightJump;
//
//    public Dog(String name, String color, int age, int heightJump) {
//        super(name, color, age);
//        this.heightJump = heightJump;
//    }
//
//    public Dog(String name, String color, int age) {
//        this(name, color, age, 0);
//    }
//
//    public int getHeightJump() {
//        return heightJump;
//    }
//
//    public void setHeightJump(int heightJump) {
//        this.heightJump = heightJump;
//    }
//
//    public void jump() {
//        System.out.println("Собака прыгнала на высоту " + getHeightJump());
//    }
//
//    @Override
//    public void printInfo() {
//        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d; Высота прыжка = %d%n",
//                getName(),
//                getColor(),
//                getAge(),
//                getHeightJump());
//    }
//
//    @Override
//    public void voice() {
//        System.out.println("Собака сказала 'Гав!'");
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "heightJump=" + heightJump +
//                '}';
//    }
}
