package lesson6.HW6;

public class TestHW6 {
    public static void main(String[] args) {
        Cat catMurzik = new Cat (200, 2);
        catMurzik.run(200);
        catMurzik.jump(1);
        catMurzik.swim(3);
        System.out.println("-----------");
        Dog dogSharik = new Dog (500, 0.5, 10);
        dogSharik.run(600);
        dogSharik.jump(0.6);
        dogSharik.swim(5);
        System.out.println("-----------");
        Dog dogBobik = new Dog (600, 1, 15);
        dogSharik.run(300);
        dogSharik.jump(0.6);
        dogSharik.swim(20);
    }







}
