package lesson6.HW6;

import lesson6.Animal;

public class Cat extends Animals {

    public static final int catMaxRun = 200;
    public static final int catMaxJump = 2;
    public static final int catMaxSwim = 0;

    public Cat(int maxRun, int maxJump, int maxSwim) {
        super(maxRun, maxJump, catMaxSwim);
    }


    @Override
    public boolean run(int catRun) {
        if (this.maxRun >= catRun) {
            System.out.printf("Кот смог пробежать %s. Ограничения = %s%n", catRun, maxRun);
            return true;
        }
        System.out.printf("Кот не может столько бегать %s. Ограничения = %s%n", catRun, maxRun);
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


//     //   private String name;
//    private int weight;
//
//    public Cat(String name, String color, int age, int weight) {
//        super(name, color, age);
//        this.weight = weight;
////        this.name = super.name;
//    }
//
//    public Cat(String name, String color, int age) {
//        this(name, color, age, 0);
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    @Override
//    public void printInfo() {
//        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d; Вес = %d%n",
//                getName(),
//                getColor(),
//                getAge(),
//                getWeight());
//    }
//
//    @Override
//    public void voice() {
////        super.voice();
//        System.out.println("Кот сказал 'Мяу!'");
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "weight=" + weight +
//                '}';
//    }
//
//
//    public void test(int a, int b) {
//        super.test(a);
//    }
}
