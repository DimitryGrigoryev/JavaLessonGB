package lesson7.oop;

public class Test7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat ("Barsik", 4),
                new Cat ("Murzik", 5),
                new Cat("Markiz", 7),
        };

        Plate plate = new Plate(15);
        printInfo (cats, plate);
        haveLunch(cats, plate);

        printInfo (cats, plate);

        plate.addFood(7);
        System.out.println("Added food: " + plate);
        System.out.println();

        printInfo (cats, plate);
        haveLunch(cats, plate);

        printInfo (cats, plate);
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat? Answer: %s%n",
                    cat.getName(),
                    result);
        }
        System.out.println();
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("----Info-----");
        System.out.println(plate);
        printInfo(cats);
        System.out.println("----------");
        System.out.println();

    }

    private static void printInfo(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isFoodFull());
        }
    }
}
