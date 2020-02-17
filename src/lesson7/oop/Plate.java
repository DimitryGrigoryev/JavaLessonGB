package lesson7.oop;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }
}
