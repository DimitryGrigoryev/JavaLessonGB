package lesson7.oop;

public class Cat {

    private final String name;
    private int appetite;
    private boolean foodFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFoodFull() {
        return foodFull;
    }

    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage != null) {
            System.out.println(validateMessage);
            return false;
        }
        doEat(plate);
        foodFull = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if ( !plate.isFoodEnough(appetite) ) {
            return  "Food is not enough in the plate!";
        }
        if (foodFull){
            return "Cat is already foodfull!";
        }
         return null;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", foodFull=" + foodFull +
                '}';
    }



}
