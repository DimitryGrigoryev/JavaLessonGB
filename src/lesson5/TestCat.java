package lesson5;

public class TestCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "red", 3);
//        cat1.name = "Barsik";
//        cat1.color = "Red";
//        cat1.age = 3;
        System.out.println("Cat1 :" + cat1);

        Cat cat2 = new Cat("Barsik", "red");
        System.out.println("Cat2 : " + cat2);

        Cat cat3 = new Cat("Murzik");
        System.out.println("Cat3 : " + cat3);
        System.out.println("_________");

        cat3 = cat2;
        System.out.println("Cat3 : " + cat3);
        cat3.setName("Муська");
        System.out.println("Cat2 : " + cat2);
        System.out.println("Cat3 : " + cat3);
        cat3.sayMeow();

        Cat.printLegs();





      }
}
