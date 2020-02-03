package lesson6.HW6;

public class Animals {

    protected String name;
    private String color;
    private int age;



//    public Animals(String name, String color, int age) {
//        super();
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void printInfo() {
////        System.out.println(this);
//        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d%n",
//                getName(),
//                getColor(),
//                getAge());
//    }
//
//    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
