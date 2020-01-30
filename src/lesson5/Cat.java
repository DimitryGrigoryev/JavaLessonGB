package lesson5;

public class  Cat {

    private static int legsNumber = 4;

    private String name;
    private String color;
    private int age;

    public static void  printLegs() {

        System.out.println(legsNumber);
    }

    public Cat() {
    }

//    public Cat() {
//        name = "Barsik";
//        color = "Red";
//        age = 3;
//    }

    public Cat(String name, String color, int age) {
        this.name = name.toLowerCase();
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color) {
        this(name, color, 0);
    }

    void sayMeow() {
        System.out.println("Meow!");
    }

    public Cat(String name) {
        this(name, null,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
