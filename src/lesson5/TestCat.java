package lesson5;

public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color = "Red";
        cat1.age = 3;
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.name = "Murzik";
        cat2.color = "Gray";
//        cat2.age = 4;
        System.out.println(cat2);
    }
}
