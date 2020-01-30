package lesson5.DZ5;

public class Staff {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int wages;
    private int age;

    public static void main(String[] args) {
        Staff staff1 = new Staff("Johnik", "Engeneer", "001@gmail.com", "+79230000000");
        staff1.setWages(45000);
        staff1.setAge(45);
        printInfo(staff1);
        System.out.println("-------------");


        Staff[] stArray = new Staff[5];
        stArray[0] = new Staff("John", "Engeneer", "123@gmail.com", "+79239560011", 40000, 45);
        stArray[1] = new Staff("Ivan", "Direktor", "124@gmail.com", "+79239560012", 50000, 55);
        stArray[2] = new Staff("Evgeniy", "Manager", "125@gmail.com", "+79239560013", 33000, 30);
        stArray[3] = new Staff("Vadim", "Auditor", "126@gmail.com", "+79239560014", 44000, 22);
        stArray[4] = new Staff("Alex", "Engeneer", "127@gmail.com", "+79239560015", 80000, 40);
        stArray[1].setAge(51);
        int maxAge =40;
        printStaffOlderThan(stArray, maxAge);

    }

    private static void printInfo(Object staff) {
        System.out.println(staff);
    }

    private static void printStaffOlderThan(Staff[] stArray, int maxAge) {
        for (Staff staff : stArray) {
            if (staff.age > maxAge) {
                System.out.println(staff);
            }
        }
    }

    public Staff (String name, String position, String email, String phone, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public Staff(String name, String position, String email, String phone) {
        this(name, position, email, phone, 0, 0);
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", wages=" + wages +
                ", age=" + age +
                '}';
    }
}
