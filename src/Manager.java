public class Manager extends Employee{
    public double bonus;

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getCompensation() {
        return bonus + getSalary();
    }
}
