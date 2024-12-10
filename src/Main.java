//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager mag1 = new Manager("89", "Josh John", 5000, 10000);
        double compe = mag1.getCompensation();
        System.out.println("Manager Compensation " + compe  );
    }
}