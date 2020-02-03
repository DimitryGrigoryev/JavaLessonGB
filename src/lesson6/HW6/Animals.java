package lesson6.HW6;

public abstract class Animals {

    protected int maxRun;
    protected double maxJump;
    protected int maxSwim;

    public Animals(int maxRun, double maxJump, int maxSwim ) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);
    public abstract boolean jump(double height);

    public void printInfo() {
        System.out.println(this);
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                ", maxSwim=" + maxSwim +
                '}';
    }
}
