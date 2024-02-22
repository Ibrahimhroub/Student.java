//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Address ads1 = new Address("Herzl", "jerusalem", 1111);
        Address ads2 = new Address(ads1);
        Student stu1 = new Student("yossi",222, ads1);

        System.out.println(ads1);
        System.out.println(stu1);
    }
}